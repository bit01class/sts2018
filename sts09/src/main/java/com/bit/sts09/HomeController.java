package com.bit.sts09;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class HomeController {
	String uploadPath="C:\\web\\sts-workspace\\upload\\";
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		logger.info("파일업로드 페이지");
		
		return "home";
	}
	
	@RequestMapping(value="/upload",method=RequestMethod.POST)
	public String upload(
			@RequestParam("id") String id,
			@RequestParam("file1") MultipartFile file,
			Model model){
		
		logger.info("id:"+id);
		logger.info("file name:"+file.getOriginalFilename());
		
		String origin=file.getOriginalFilename();
		String newName=origin+System.currentTimeMillis();
		
		File f=new File(uploadPath+newName);
		
		try {
			file.transferTo(f);
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
//		InputStream is =null;
//		OutputStream os =null;
//		BufferedInputStream bis=null;
//		BufferedOutputStream bos=null;
//		byte[] buf=new byte[1024];
//		try {
//			is = file.getInputStream();
//			os = new FileOutputStream(f);
//			
//			bis= new BufferedInputStream(is);
//			bos= new BufferedOutputStream(os);
//			int su=0;
//			while((su=bis.read(buf))>0) {
//				bos.write(buf, 0, su);
//			}
//			bos.flush();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			if(is!=null)is.close();
//			if(os!=null)os.close();
//		}
		model.addAttribute("origin", origin);
		model.addAttribute("newName", newName);
		return "result";
	}
	
	@RequestMapping("/down")
	public void download(String target,String filename,HttpServletResponse res){
		res.setContentType("application/octet-stream;charset=utf-8");
		res.setHeader("Content-Disposition","attachment; filename=\""+filename+"\"");
		
		File file =new File(uploadPath+target);
		OutputStream out = null;
		InputStream is=null;
		
		try {
		out = res.getOutputStream();
		is=new FileInputStream(file);
			FileCopyUtils.copy(is, out);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
//		byte[] buf=new byte[512];
//		
//		BufferedInputStream bis=null;
//		BufferedOutputStream bos=null;
//		try {
//			is=new FileInputStream(file);
//			
//			bis=new BufferedInputStream(is);
//			bos=new BufferedOutputStream(out);
//			int su=0;
//			while((su=bis.read(buf))>0) {
//				bos.write(buf, 0, su);
//			}
//		}finally {
//			if(is!=null)is.close();
//			if(out!=null)out.close();
//		}
		
	}
}






















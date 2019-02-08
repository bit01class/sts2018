package com.bit.sts08;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bit.sts08.model.Bbs02Dao;
import com.bit.sts08.model.entity.Bbs02Vo;

@RestController
public class JsonController {
	@Autowired
	SqlSession sqlSession;
	
	private static final Logger logger = LoggerFactory.getLogger(JsonController.class);
	
	
	@GetMapping("/bbs")
	public List<Bbs02Vo> list() {
		try {
			return sqlSession.getMapper(Bbs02Dao.class).selectAll();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@PostMapping("/bbs")
	public String add(Bbs02Vo bean) {
		logger.debug(bean.toString());
		try {
			sqlSession.getMapper(Bbs02Dao.class).insertOne(bean);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "test";
	}
}

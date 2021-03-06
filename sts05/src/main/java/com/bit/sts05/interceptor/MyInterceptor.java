package com.bit.sts05.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class MyInterceptor extends HandlerInterceptorAdapter {
	Logger log=LoggerFactory.getLogger(this.getClass());

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		log.debug("controller 호출전");
		log.debug(handler.toString());
		 HttpSession session = request.getSession();
	        // login처리를 담당하는 사용자 정보를 담고 있는 객체를 가져옴
	        Object obj = session.getAttribute("login");
	         
	        if ( obj == null ){
	            // 로그인이 안되어 있는 상태임으로 로그인 폼으로 다시 돌려보냄(redirect)
	            response.sendRedirect("../login/login");
	            return false; // 더이상 컨트롤러 요청으로 가지 않도록 false로 반환함
	        }


		return true;
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		log.debug("controller 호출후");
		log.debug(handler.toString());
		log.debug(modelAndView.getViewName());
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		log.debug("view 위임 후");
	}
}













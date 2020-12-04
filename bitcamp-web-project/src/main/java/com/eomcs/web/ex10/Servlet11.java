// 쿠키(cookie) - 유효기간 설정하기
package com.eomcs.web.ex10;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex10/s11")
@SuppressWarnings("serial")
public class Servlet11 extends HttpServlet {

  @Override
  protected void service(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
	  ServletContext sc = this.getServletContext();
	    sc.setAttribute("v1", "aaa");
	    
	    
	    
	    ServletContext sc = this.getServletContext();
	    sc.setAttribute("v1", "aaa");
	    
	    
	    
	    response.setContentType("text/plain;charset=UTF-8");
	    PrintWriter out = response.getWriter();
	    
	   
  }
// 썸네일 이미지 만들기
package com.eomcs.web.ex04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;

@MultipartConfig(maxFileSize = 1024 * 1024 * 10)
@WebServlet("/ex04/s8")
public class Servlet08 extends GenericServlet {

  private static final long serialVersionUID = 1L;
  private String uploadDir;

  @Override
  public void init() throws ServletException {
    this.uploadDir = this.getServletContext().getRealPath("/upload");
  }

  @Override
  public void service(ServletRequest req, ServletResponse res)
      throws ServletException, IOException {

  
  req.setCharacterEncoding("UTF-8");
  
  HttpServletRequest httpReq = (HttpServletRequest) req;
  res.setContentType("text/html;charset=UTF-8");
  PrintWriter out = res.getWriter();
  out.println("<html>");
  out.println("<head><title>servlet04</title></head>");
  
  out.println("<body><h1>파일업로드 결과</h1>");
  
  
   
  
  
  
  
  
  
  
  
  
  
  
}
}
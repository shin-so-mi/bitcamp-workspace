// 쿠키(cookie) 보내기
package com.eomcs.web.ex10;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex10/s1")
@SuppressWarnings("serial")
public class Servlet01 extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//    클라이언트에 보낸 쿠키 읽기
//     요청헤더에 포함된 쿠키를 읽는다
//     
//     쿠키꺼내기
//     쿠키를 이름으로 한개씩 추출할수없다
//     한번에 배열로받아야한다
//     요청헤더에  쿠키가 없으면 리턴되는것은 빈 배열이 아니라 null 이다
//     따락서 무조건 반복문을 돌리면  안되다
//     
//	 
	 
	 Cookie[] cookies = request.getCookies();
	 response.setContentType("text/plain;charset=UTF-8");
	 PrintWriter out = response.getWriter();
	 
		
		
	 
	}
	
	
}


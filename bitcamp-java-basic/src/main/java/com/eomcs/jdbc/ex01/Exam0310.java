package com.eomcs.jdbc.ex01;

import java.sql.DriverManager;

import org.mariadb.jdbc.MariaDbConnection;

import java.sql.SQLException;
import java.sql.Connection;
public class Exam0310 {
  public static void main(String[] args) throws Exception {
	  
	try (java.sql.Connection con = DriverManager.getConnection(
    		  "jdbc:mysql://localhost:3306/studydb?user=study&password=1111");
       
  java.sql.Statement stmt = con.createStatement();) { //서버에 전달하는 객체 
		 //크리에이트에서 stmt를 호출한다

		System.out.println(con.getClass().getName());
		
		
		int count = stmt.executeUpdate(//호출한것을 여기서 사용
				"insert into x_board(title,contents) value('제목','네용')"); //여기만 바뀜
		System.out.printf("%d개 입력성공", count);
	}
		

		 
}

}
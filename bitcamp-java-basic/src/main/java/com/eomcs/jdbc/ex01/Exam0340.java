package com.eomcs.jdbc.ex01;

import java.sql.DriverManager;

import org.mariadb.jdbc.MariaDbConnection;

import java.sql.SQLException;
import java.sql.Connection;
public class Exam0340 {
  public static void main(String[] args) throws Exception {
	  
	try (java.sql.Connection con = DriverManager.getConnection(
    		  "jdbc:mysql://localhost:3306/studydb?user=study&password=1111");
  java.sql.Statement stmt = con.createStatement();
			java.sql.ResultSet rs = stmt.executeQuery(//
					"select * from x_board order by board_id desc");
			) { 
	
           boolean isReceived = rs.next();
	
           
     //while 을 사용함으로써 한개 이상의 게시뭃을 반복문으로 돌릴수잇다
           while (rs.next()) {
             System.out.printf("%d, %s, %s, %s, %d\n", //
                 rs.getInt("board_id"), // 컬럼명을 직접 사용
                 rs.getString("title"), //
                 rs.getString("contents"), //
                 rs.getDate("created_date"), //
                 rs.getInt("view_count")); //
      
		
	
	}
		
	}
		 
}

}
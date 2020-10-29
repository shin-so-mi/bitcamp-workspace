package com.eomcs.jdbc.ex01;

import java.sql.DriverManager;

import org.mariadb.jdbc.MariaDbConnection;

import java.sql.SQLException;
import java.sql.Connection;
public class Exam0320 {
  public static void main(String[] args) throws Exception {
	  
	try (java.sql.Connection con = DriverManager.getConnection(
    		  "jdbc:mysql://localhost:3306/studydb?user=study&password=1111");
  java.sql.Statement stmt = con.createStatement();
			
			
			java.sql.ResultSet rs = stmt.executeQuery(//
					"select * from x_board order by board_id desc");
			) { //서버에 전달하는 객체 
		 //크리에이트에서 stmt를 호출한다
           boolean isReceived = rs.next();
	
           
           if (isReceived) {
               // 서버에서 한 개 가져온 결과를 출력한다.
               System.out.printf("%d, %s, %s, %s, %d\n", //
                   rs.getInt(1), // board_id
                   rs.getString(2), // title
                   rs.getString(3), // contents
                   rs.getDate(4), // created_date
                   rs.getInt(5)); // view_count



             } else {
               System.out.println("서버에서 한 개의 레코드를 가져오지 못했다!");
             }
           
		
	
	}
		

		 
}

}
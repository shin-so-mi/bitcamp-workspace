package com.eomcs.jdbc.ex02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

 

public class Exam0150 {

	  public static void main(String[] args) throws Exception {
		  String no = null;
	    String title = null;
	    String contents = null;

	    try (Scanner keyScan = new Scanner(System.in)) {

	      System.out.print("번호? ");
	      no = keyScan.nextLine();


	
	      }
	    

	    try (Connection con = DriverManager.getConnection( //
	        "jdbc:mysql://localhost:3306/studydb?user=study&password=1111");
	        Statement stmt = con.createStatement();) {

	  
	      stmt.executeUpdate(
	    		  "delete from x_board_file where board_id = " + no);
	      

	      int count = stmt.executeUpdate(
	    		  "delete from x_board where board_id = " + no);
	      
	      if (count == 0) {
	    	  System.out.println("해당게시물이 존재하지않ㅅ급니다");
	    	  
	      } else {
	    	  System.out.println("삭제");
	      }
	    }
	  }
	}



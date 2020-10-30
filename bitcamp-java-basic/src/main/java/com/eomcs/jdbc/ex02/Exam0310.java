package com.eomcs.jdbc.ex02;
 //오타 확인하기
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Exam0310 {

	  public static void main(String[] args) throws Exception {
	    String title = null;
	    String contents = null;

	    try (Scanner keyScan = new Scanner(System.in)) {

	      // 사용자로부터 제목, 내용을 입력 받는다.
	      System.out.print("제목? ");
	      title = keyScan.nextLine();

	      System.out.print("내용? ");
	      contents = keyScan.nextLine();

	      System.out.print("입력하시겠습니까?(Y/n) ");
	      String input = keyScan.nextLine();

	      if (!input.equalsIgnoreCase("y") && input.length() != 0) {
	        System.out.println("등록을 취소 하였습니다.");
	        return;
	      }
	    }

	    try (Connection con = DriverManager.getConnection( //
	        "jdbc:mysql://localhost:3306/studydb?user=study&password=1111");
	    		
	        PreparedStatement stmt = con.prepareStatement("insert into x_board(title,contents) values(?,?)");) {

	    	
	      int count = stmt.executeUpdate();
	      System.out.printf("%d 개 입력 성공!", count);
	    }
	  }
	}



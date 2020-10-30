package com.eomcs.jdbc.ex02;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

public class Exam0420 {

	  public static void main(String[] args) throws Exception {
	    String title = null;
	    String contents = null;
       ArrayList<String> files = new ArrayList<>();
        
	    try (Scanner keyScan = new Scanner(System.in)) {

	      // 사용자로부터 제목, 내용을 입력 받는다.
	      System.out.print("제목? ");
	      title = keyScan.nextLine();

	      System.out.print("내용? ");
	      contents = keyScan.nextLine();
	      
          //사용자로부터 첨부파일 입력받기
	      while (true) {
	    	  System.out.println("첨부파일:(완료는 그냥엔터)");
	    	  String filename = keyScan.nextLine();
	    	  if (filename.length() == 0) {
	    		  break;
	    	  }
	    	      files.add(filename);
	      }
	    }
	   

	    try (Connection con = DriverManager.getConnection( //
	        "jdbc:mysql://localhost:3306/studydb?user=study&password=1111");
            //게시글 입력처리
	        PreparedStatement boardStmt = con.prepareStatement(
	        		"insert into x_board(title,contents) values(?,?)",
	        		Statement.RETURN_GENERATED_KEYS);
	    		 //첨부파일입려객체
	    		 PreparedStatement fileStmt = con.prepareStatement( 
	 	        		"insert into x_board_file(file_path,board_id) values(?,?)"))
	    		{

	      // in-parameter에 값을 설정한다.
	      // => 설정하는 순서는 상관없다. 하지만 유지보수를 위해 순서대로 나열하라!
	      boardStmt.setString(1, title);
	      boardStmt.setString(2, contents);
	      int count = boardStmt.executeUpdate();
	      System.out.printf("%d 개 입력 성공!\n", count);
	      
	      
	      ResultSet keyRS = boardStmt.getGeneratedKeys();
	      keyRS.next();
	      int boardId = keyRS.getInt(1);
	      
	      //첨부파일 입력
	      
	      int fileCount = 0;
	      for (String filename : files) {
	    	  fileStmt.setString(1,filename);
	    	  fileStmt.setInt(2, /*버노뭐지 앞에꺼*/ 0);
	    	  //첨부파일테이블에 데이터를 입력하려면 게시글 테이블의 번호를 알아야한다
	    	  //문제는 바로 위에서 입력한 게시글의 pk가 자동생성되는 컬럼이기때문에
	    	  //입력한후  그 pk 값이 뭔지 알수가 없다는것이다
	    	  //그래서 첨부파일 테이블에 데이터를 입력할수가 없다
	    	  //해결책
	    	  //데이터를 입력할때 자동생성된 pk값을 알 수 있다면 이문제를 해결 할수 있다
	    	  //다음 예쩨를 통해 확인
	    	  fileStmt.setInt(2, boardId);
	    	  
	    	  fileStmt.executeUpdate();
	    	  fileCount++;
	    	  
	    	  
	      }
	      System.out.printf("%d 개 파일 입략성공" , fileCount);
	      
	    }
	  }
	}
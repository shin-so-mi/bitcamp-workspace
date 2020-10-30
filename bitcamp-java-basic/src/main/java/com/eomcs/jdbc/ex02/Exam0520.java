package com.eomcs.jdbc.ex02;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

public class Exam0520 {

	  public static void main(String[] args)  {
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
	   
                 Connection con2 = null;
                 
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
    
	    	
	    	//한단위로 수행해야할 작업이 있다면 
	    	//commit할때 까지 실제 테이블ㅇ ㅔ적용하징낳도록
	    	//auto commit을 취소하고 수동 커밋상태로 만든다
	    	con.setAutoCommit(false);
	    	
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
	      
	      //자식 테이블의 데이터까지 정상적으로 입력햇다면 
	      //dbms 에 게 작업결과를 실제테이블에 적용하라고 요청한다
	      
	    		
	    		}catch (Exception e) {
	    	System.out.println("게시뮬 ㅇ입력중 오류발생");
	    	
	    	//만약에 입력도중 실패 했다면 
	    	//현재까지 작업한 결과르 모두 취소하라고 dbms에 통보한다
	    		}
	  }
	}

package com.eomcs.pms.handler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Iterator;
import java.util.List;
import com.eomcs.pms.domain.Board;

public class BoardListCommand implements Command {

 

  @Override
  public void execute() {
    System.out.println("[게시물 목록]");

    try (Connection con = DriverManager.getConnection(
  		  "jdbc:mysql://localhost:3306/studydb?user=study&password=1111");
PreparedStatement stmt = con.prepareStatement(
			"select no, title, writer,cdt,vw_cnt"
		+ " from pms_board"
		+ " order by no desc");
			ResultSet rs = stmt.executeQuery()) { 
	
      
	
         System.out.println("번호,제목,글쓴이,등록일,조회수");
   //while 을 사용함으로써 한개 이상의 게시뭃을 반복문으로 돌릴수잇다
         while (rs.next()) {
           System.out.printf("%d, %s, %s, %s, %d\n", 
               rs.getInt("no"), // 컬럼명을 직접 사용
               rs.getString("title"), //
               rs.getString("writer"),
               rs.getDate("cdt"),//
               rs.getInt("vw_cnt")); //
    
		
	
	}
		
	} catch (Exception e) {
		System.out.println("데이터 목록 조회둥 오류바생");
		e.printStackTrace();
	}
  

  }

}

package com.eomcs.jdbc.ex01;

import java.sql.DriverManager;

import org.mariadb.jdbc.MariaDbConnection;

import java.sql.SQLException;
import java.sql.Connection;


public class Exam0361 {

  public static void main(String[] args) throws Exception {
    try (
        java.sql.Connection con = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/studydb?user=study&password=1111");
        java.sql.Statement stmt = con.createStatement();

    ) {

      //부모테이블의 데이터를지우려면 먼저 부모 테이블의 데이터를 참조하고 있는 자식 테이블의 테이터를 지워야 한다.
    	//게시글을 참조하는 첨부파일데이터를 먼저지운다
        int count = stmt.executeUpdate( //
                "delete from x_board_file where board_id =4 ");
            System.out.printf("x_board_file 테이블 :%d 개 변경 성공!", count);
            
            //부모 테이블의 데이터를 지운다
                 count = stmt.executeUpdate( //
                "delete from x_board where board_id =4 ");
            System.out.printf("%d 개 변경 성공!\n", count);
    }
  }
}


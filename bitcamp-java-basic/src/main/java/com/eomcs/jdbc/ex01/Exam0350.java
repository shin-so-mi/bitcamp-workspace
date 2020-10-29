package com.eomcs.jdbc.ex01;

import java.sql.DriverManager;

import org.mariadb.jdbc.MariaDbConnection;

import java.sql.SQLException;
import java.sql.Connection;


public class Exam0350 {

  public static void main(String[] args) throws Exception {
    try (
        java.sql.Connection con = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/studydb?user=study&password=1111");
        java.sql.Statement stmt = con.createStatement();

    ) {

      // executeUpdate()
      // => DBMS 서버에 update 문을 보낸다.
      // => 리턴 값: 변경된 레코드의 개수이다.
      int count = stmt.executeUpdate( //
          "update x_board set view_count = view_count +1" //
              + " where board_id > 4");
      System.out.printf("%d 개 변경 성공!", count);
    }
  }
}


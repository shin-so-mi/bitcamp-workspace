package com.eomcs.jdbc.ex01;

import java.sql.DriverManager;

import org.mariadb.jdbc.MariaDbConnection;

import java.sql.SQLException;
import java.sql.Connection;
public class Exam0220 {
  public static void main(String[] args) {
	  
	  java.sql.Connection con = null;
	try {
		 con = DriverManager.getConnection(
    		  "jdbc:mariadb://localhost:3306/stydydb",
         "study",
         "1111");
		System.out.println("dbms와 연결됨");
		System.out.println(con.getClass().getName());
		
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		try {
			con.close();
		}catch (Exception e) {
			
		}
		System.out.println("dbms와 연결 해제됨");
	}
}
}

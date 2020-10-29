package com.eomcs.jdbc.ex01;

import java.sql.DriverManager;

public class Exam0120 {
  public static void main(String[] args) {
	try {
		 new org.mariadb.jdbc.Driver();
		 new oracle.jdbc.driver.OracleDriver();
		 new com.microsoft.sqlserver.jdbc.SQLServerDriver();
		


		
		java.sql.Driver driver2 = DriverManager.getDriver("jdbc:mariadb:");
		System.out.println(driver2);
	
		
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}

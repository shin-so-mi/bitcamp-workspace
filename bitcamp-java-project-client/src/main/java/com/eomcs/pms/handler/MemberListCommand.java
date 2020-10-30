package com.eomcs.pms.handler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Iterator;
import java.util.List;
import com.eomcs.pms.domain.Member;

public class MemberListCommand implements Command {


  @Override
  public void execute() {
    System.out.println("[회원 목록]");

    try (Connection con = DriverManager.getConnection(
    		  "jdbc:mysql://localhost:3306/studydb?user=study&password=1111");
  PreparedStatement stmt = con.prepareStatement(
  			"select no, name, email, password, photo, tel"
  		+ " from pms_member"
  		+ " order by no desc");
    		ResultSet rs = stmt.executeQuery()) { 

    while (rs.next()) {
      System.out.printf("%d, %s, %s, %d, %s, %s\n",
    		  rs.getInt("no"), // 컬럼명을 직접 사용
              rs.getString("name"),
              rs.getString("email"),
              rs.getInt("password"),
              rs.getString("photo"),
              rs.getInt("tel"));
    }
  } catch (Exception e) {
		System.out.println("데이터 목록 조회둥 오류바생");
		e.printStackTrace();
	}

  }

}

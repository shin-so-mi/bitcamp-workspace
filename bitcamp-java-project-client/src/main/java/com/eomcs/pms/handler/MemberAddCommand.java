package com.eomcs.pms.handler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;
import com.eomcs.pms.domain.Member;
import com.eomcs.util.Prompt;

public class MemberAddCommand implements Command {


 

  @Override
  public void execute() {
    System.out.println("[회원 등록]");

    Member member = new Member();
    member.setNo(Prompt.inputInt("번호? "));
    member.setName(Prompt.inputString("이름? "));
    member.setEmail(Prompt.inputString("이메일? "));
    member.setPassword(Prompt.inputString("암호? "));
    member.setPhoto(Prompt.inputString("사진? "));
    member.setTel(Prompt.inputString("전화? "));
 

    try (Connection con = DriverManager.getConnection( //
	        "jdbc:mysql://localhost:3306/studydb?user=study&password=1111");
	    		
	        PreparedStatement stmt = con.prepareStatement("insert into pms_member(no,name,email,password,photo,tel) values(?,?,?,?,?,?)");) {

	    	stmt.setInt(1,member.getNo());
	    	stmt.setString(2,member.getName());
	    	stmt.setString(3,member.getEmail());
	    	stmt.setString(4,member.getPassword());
	    	stmt.setString(5,member.getPhoto());
	    	stmt.setString(6,member.getTel());
	    	
	    	stmt.executeUpdate();
	    	System.out.println("게시글을 등록하였습니다.");
    } catch (Exception e) {
    	System.out.println("오류");
    	e.printStackTrace();
    }
   }

 
  }


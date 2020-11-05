package com.eomcs.pms.handler;

import com.eomcs.pms.dao.MemberDao;
import com.eomcs.pms.domain.Member;
import com.eomcs.util.Prompt;

// Command 규칙에 따라 클래스를 정의한다. 
public class LoginCommand implements Command {

	
	 MemberDao memberDao;
	 
	 public LoginCommand(MemberDao memberDao) {
		 this.memberDao = memberDao;
	 }
  @Override
  public void execute() {
    System.out.println("로그인");
    String email = Prompt.inputString("이메일");
    String password = Prompt.inputString("암호");
    
    
    try {
    Member member = memberDao.findByEmailPassword(email,password); // 맴버다오야 이메일과 번호좀 찿아줘 
    if (member == null) {
    	System.out.println("사용자 ㅂ정보가 맞지않습니다");
    }else {
    	context.put("loginUser", member);
    	   System.out.printf("%s 님 반갑습니다.\n", member.getName());
    }
  
    
  
}catch (Exception e) {
	System.out.println(" 로그인중 오류발생");
	e.printStackTrace();
}
}
}
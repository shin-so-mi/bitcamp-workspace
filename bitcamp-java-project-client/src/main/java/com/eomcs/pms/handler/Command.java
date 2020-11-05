package com.eomcs.pms.handler;

import java.util.Map;

// 사용자의 명령을 처리하는 객체에 대해 호출할 메서드 규칙을 정의 한다.
public interface Command {
	
	
	//커맨드 객체들간에 데이터 교횐을 위해 맵객체를 주고 받는다 
  void execute(Map<String,Object> context);
}

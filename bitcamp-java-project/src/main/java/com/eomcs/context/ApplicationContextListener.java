package com.eomcs.context;
import java.util.Map;
public class ApplicationContextListener {

  //어플리케이션의 상태가 변경되었을때
  //호출할 메서드 규칙을 정의 한다
  //즉 애플리케이션 상태 변경에 대해 보고를 받을 Observer 규칙을 정의한다
  //보통 옵저버를 리스너/ 구독자라 부른다

  public interface ApplicationContextListener {

    void contextInitialized(Map<String,Object> context);


    }
}

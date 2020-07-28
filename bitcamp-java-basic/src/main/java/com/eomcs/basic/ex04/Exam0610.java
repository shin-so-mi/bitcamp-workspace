package com.eomcs.basic.ex04;

//상수 값을 바꿀수 없는 변수
public class Exam0610 {
  
  public static void main(String[] args) {
    

    
    int a;
    a = 100;
    a = 200;
    a = 300;
    
    
    //변수의 값을 핝번 설정하면 바꾸지 못하게 막는 문법
    final int b;
    b = 100;
    //b = 200; // 컴파일 오류 문법이 맞지 않아 컴파일 할수 업는것!
    
    
    //상수변수는 보통선언과 동시에 값을 저장한다
    final int c = 100; 
    //c = 200;  //컴파일 오류
    
    //일반변수가 아님을 표시하기 위해 보통 대문자로 이름을짓는다
    final int LENGTH =100;
    
    //상수 변수의 이름을 대문자로 작성할떄 단어사이에 _를 삽입한다
    int firstUserName;
    final int FIRST_USER_NAME;
    
    
    
    
    
    
    
    
    
    
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  

}

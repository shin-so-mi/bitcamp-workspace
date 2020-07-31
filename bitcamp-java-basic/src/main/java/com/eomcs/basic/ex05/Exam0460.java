package com.eomcs.basic.ex05;

//# 비트 이동 연산자 : 응용 III
//
public class Exam0460 {
  public static void main(String[] args) {
    // 한 개의 정수 값에 여러 개의 정보를 저장하기
    // => 비트의 1 또는 0을 이용하여 정보를 표현할 수 있다.
    //특정비트의 값을 설정할떄 
    //0x01 , 0x02 , 0x03, 0x04,0x08처럼 숫자를 직접 사용하면
    //코드를 읽고 이해하기힘들다
    //해결책
    //각각의 값을 의미있는 이름을 가진 변수에 저장한 후 사용

    // 개발자가 프로그래밍 가능한 언어를 int 값으로 표현해 보자!
    final int CSS           = 0x01; //  0000 0001
    final int HTML          = 0x02; //  0000 0010
    final int PHP           = 0x04; //  0000 0100
    final int PYTHON        = 0x08; //  0000 1000
    final int JAVASCRIPT    = 0x10; //  0001 0000
    final int JAVA          = 0x20; //  0010 0000
    final int CPP           = 0x40; //  0100 0000
    final int C             = 0x80; //  1000 0000
  
    // Java와 C, C++, JavaScript를 할 줄 아는 개발자의 정보를 설정하라!
   
  
  
    //   1000 0000 (C)
    // | 0010 0000 (JAVA)
    // | 0000 1000 (PYTHON)
    // | 0000 0010 (HTML)
    // ---------------------------
    //   1010 1010 
    int lang = JAVA | C | PHP; 
    
    System.out.println(Integer.toBinaryString(lang)); //2진수로출력하기
    
 

   
  }
}



package com.eomcs.basic.ex04;

public class Exam0430 {
public static void main(String[] args) {


  
  char c1;
  char c2;
  char c3;
  
  // 문자 'A'를 변수에 저장하는 방법?
  //- 문자 'A'의 UCS-2 코드 값을 저장하면 된다.
  //
  c2 = 65;            // 문자 'A'의 코드 값을 10진수로 표현한 것.
  c1 = 0x41;          // 문자 'A'의 코드 값을 16진수로 표현한 것.
  c3 = 0b0100_0001;   // 문자 'A'의 코드 값을 2진수로 표현한 것.

  // println()을 통해 문자를 출력할 수 있다.
  //- 변수의 종류가 char 이면 출력할 때 코드 값 대신 문자를 출력한다.
  //- 해당 코드의 문자를 폰트 파일에서 찾아 출력한다.
  //
  System.out.println(c1);
  System.out.println(c2);
  System.out.println(c3);


  
  
  char c = 'A';
  char b = 'B';
  
  System.out.println(c);
  System.out.println(b);
  
  
  
  
  
  
  
  
char d = 't';
char w = 'i';
 
System.out.println(d);
  System.out.println(w);
  
  int a = 0x41;
  System.out.println(a);
  System.out.println((char)a);
  
  }
  
  
  
}
}

 
    
  
  
  

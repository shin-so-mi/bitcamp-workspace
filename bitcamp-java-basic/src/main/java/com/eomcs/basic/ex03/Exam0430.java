//Ex0340.java
//주제 :  부동소수점의 정규화 = 2진수로 바꾸기

//부동소숫점의 정규화 = 2진수로 바꾸기

package com.eomcs.basic.ex03;



class Exam0430 {
    public static void main(String[] args) {
      //자바는 문자를 메모리에 저장할때 unicode규칙에 따라
      //2바이트로 저장한다
      
      System.out.println(0x41); 
      System.out.println(65);
      
      
      System.out.println((char)0x41);
      System.out.println((char)65); 
      System.out.println((char)0xd5d0);
      
      System.out.println('a');  //=>a의 의미 주어진문자의 리턴값을 알려준다
               //(char)0x0042      
    //single qualtation 연산자 ' ' 의 역할
      //문자의 코드값을 리턴해주는 일을 한다
      
}
}
    


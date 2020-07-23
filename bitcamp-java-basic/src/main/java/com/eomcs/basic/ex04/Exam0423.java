package com.eomcs.basic.ex04;
 //문자변수
public class Exam0423 {
public static void main(String[] args) {
    
    //각변수의 값이 개별적으로 옳은 부동소수점이라도
  float f1 = 99988.88f;
  float f2 = 11.11111f;
  
    System.out.println(f1);
    System.out.println(f2);
    
    float f3 = f1 + f2;
    System.out.println(f3);
    
   //부동소수점을 다룰땐 가능한 double을 사용하자
   double d1 = 99988.88;
   double d2 = 11.11111;
   double d3 = d1 + d2;
   System.out.println(d3);
  
  
  
}
}

package com.eomcs.basic.ex05;

public class practice11 {
public static void main(String[] args) {

  double d1 = 987.6543;
  double d2 = 1.111111;


  System.out.println((d2 + d2) == 988.765411);
  //결과는 오류이다
  //부동소수점값을 연산할떄는 외곡되는경우가 있다
  
  //실행을 해보면 988.7654110000001
  //이렇듯 극소수의 값이 붙는다
  double x = 234.765411;
  double y = 754.0;
  
  //이러한 문제를 해결하는방법은??
      
      //소수점뒤에 붙은 극소수 값을 버리면 된다
   
  //개발자가 직접 처리해야됨
  double EPSILON = 0.00001;
  System.out.println(Math.abs((d1 + d2) - (x + y)) < EPSILON);
  
  
  
  
  
  
  
  
  
  
  
  
}
}
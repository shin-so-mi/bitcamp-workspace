package com.eomcs.basic.ex04;

public class Exam0910 {
public static void main(String[] args) {

  

  //반듯이 같은데이터 타입 이어야한다
  //같은 데이터 타입이라도 저장하는 값의 크기가
  //변수보다 같거나 같아야한다
  //정수  .>> 부동소수점변수
  
  //
  

    
    System.out.println("2)==========================");
    
  
  i = 17_3456_1234;
  f2 = i;  //유효자리수를벗어난 수는 잘린다
  
  System.out.println(f2);
  
  
  //int 를 float에 저장할떄 컴파일 오류는 발생하지 않는다
  //다만 실행시에 float 메모리에 저장되는과정에서 
  //유효자리수 가 넘어가는 값은 짤린다
  
  
  
  l = 200_1234_3654l;
  f2 =l;
  System.out.println(f2);
  
  
  
  
  
  
  
  
  
  // 부동소수점 >>>>정수변수
  // 부동소수점은 정수변수에 저장할수 없다
  
  //컴파일 오류 
  f = 112.123f;
  //s = f;
  //i = f;
   System.out.println("3===================================");
  //강제로 부동소수점을 정수변수에 저장하는방법이 있다
  //형변환 명령을 사용하라
  b = (byte) f; //소수점 이하가 잘린다
  System.out.println(b);
  
  
  s = (short) f;
  System.out.println(s);
  
  i = (int) f;
  System.out.println(i);

  c = (char) f;
  System.out.println(c);
  
  //이렇게 명령어를 통해 강제로 형변환시키는것을 명시적 형변환(Explicit type )라 부른다
  
  
  
  // 단 논리값은 정수나 부동소수점으로 바꿀수 없다
  //b = (byte) bool;
  //s = (short) bool;
  
  
  //같은 정수 변수 끼리 변환ㅁ
  //작은 메모리 >>>> 큰메모리 가능
  //큰메모리   >>>>> 작은메모리 (명시적 형변환)
  //형변환 할떄 값이 메모리에 저장하지 못한만큼 크다면 잘린다
  
 
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
}

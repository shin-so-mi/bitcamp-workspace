package com.eomcs.basic.ex03;

//  문자의 리터럴
// 자바의 기본타입이 아니라 객체이다
// 객체란 여러데이터들의 덩어리이다
// 표기법
//큰 따움표(double quote) 안에 문자들 을 작성한다

    

public class Exam0600 {
  public static void main(String[] args) {
    //문자열 기본예
    System.out.println("홍길동");

    //두문자열을 합쳐서 새문자열이 생성된다
    //"Hello" + "world" = "hello,world"
    System.out.println("Hello" + "world");

    //새 문자열을 합쳐 새문자열이 생성된다
    //"나이" + "20" = "나이+20"
    System.out.println("나이" + 20);

    //새문자열을 만들어 논리 값을 붙힌다
    //false + "<== 재직자 여부" = "false<=== 재직자여부"
    System.out.println(false +"<===재직자여부");

    //새문자열을 만들어 문자르 붙힌다
    //"성별:" +'여' = "성별:여"
     System.out.println("성별:" + '여');

     //새문자열을 만들어 부동소수점을 붙힌다
     //"키:" + 170.5f = "키:175.5"
     System.out.println("키:" + 170.5f);
     
  }
}
// String - String 객체와 문자열 리터럴의 타입
package com.eomcs.corelib.ex02;

public class Exam0112 {
  public static void main(String[] args) {

    String s1 = new String("Hello");  //string 객체
    String s2 = "Hello";              //문자열 리터럴

    // 문자열 리터럴이 String 객체인지 확인해보자.
    System.out.println(s1 instanceof String);
    System.out.println(s2 instanceof String);
  }
}
/*
String s1 = new String("Hello");// new 인스턴스
String s2 = "Hello";   //string pool에 저장됨 중복저장하지 않는다 */

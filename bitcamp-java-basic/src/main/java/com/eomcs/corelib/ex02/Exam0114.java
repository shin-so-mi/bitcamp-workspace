// String - String 인스턴스를 상수풀에 생성하기: intern()
package com.eomcs.corelib.ex02;

public class Exam0114 {
  public static void main(String[] args) {

    String s1 = new String("Hello");

    // 먼저 상수풀에 String 객체를 생성해보자.
    String s2 = "Hello";

    // intern()
    // - 지정된 String 객체를 상수풀에서 찾는다.
    // - 있으면 그 String 객체의 주소를 리턴한다.
    // - 없으면 상수풀에 String 객체를 생성한 후 그 주소를 리턴한다.
    String s3 = s1.intern();

    System.out.println(s1 == s2);
    System.out.println(s2 == s3);



String s5 = new String("hello");
String s6 = "hello";  //먼저 상수풀에 String객체를 생성해보자
String s7 = s5.intern(); //s5를 상수풀로만들어 S7에 넣는다



























String a1 = new String("Hello");

//>>>>>>>>>>>>>>.>>>>>>>>>>>>

String a2 = "Hello";
String t5 = a1.intern();













}
}
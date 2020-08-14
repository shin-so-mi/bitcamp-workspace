// String - 문자열 리터럴
package com.eomcs.corelib.ex02;

public class Exam0111 {
  public static void main(String[] args) {

    // 문자열 리터럴
    // - string constant pool 메모리 영역에 String 인스턴스를 생성한다.
    // - 내용물이 같으면 기존 인스턴스의 주소를 리턴한다.
    // - 즉 메모리 절약을 위해 중복 데이터를 갖는 인스턴스를 생성하지 않는다.
    // - JVM이 끝날 때까지 메모리에 유지된다.
    //
    String x1 = "Hello"; // 새 String 인스턴스의 주소!!!!!를 리턴한다.
    String x2 = "Hello"; // 기존의 String 인스턴스 주소를 리턴한다.

    // 인스턴스의 주소를 비교해 보면,
    System.out.println(x1 == x2); // true => 두 String 객체는 같다.
  }
}
/*문자열 리터럴
//string comstant pool메모리 영역에 String 인스턴스를 생성한다
//내용물이 같으면 기존인스턴스 주소를 리턴한다
//메머리절약을 위해 중복데이터를 갖는 인스턴스를 생성하지않는다
//
String x1 = "Hello"; //String 풀에 저장됨 힙은 아님 중복데이터 만들지않는다
String x2 = "Hello";
*/
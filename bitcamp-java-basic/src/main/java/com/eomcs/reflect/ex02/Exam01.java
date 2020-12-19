// 클래스 정보 추출 - 클래스 이름 알아내기
package com.eomcs.reflect.ex02;

public class Exam01 {
  static class A {}

  public static void main(String[] args) throws Exception {

    //패키지맴버클래스
    Class<?> clazz = Class.forName("java.lang.String");

    // 클래스의 타입 객체를 통해 클래스 정보를 추출할 수 있다.
    System.out.println(clazz.getSimpleName()); // String
    System.out.println(clazz.getName()); // java.lang.String
    System.out.println(clazz.getCanonicalName()); // java.lang.String
    System.out.println(clazz.getTypeName()); // java.lang.String




    //익명클래스
    Class<?> clazz2 = Class.forName("com.eomcs.reflect.ex02.Exam01$A");

    // 클래스의 타입 객체를 통해 클래스 정보를 추출할 수 있다.
    System.out.println(clazz2.getSimpleName()); // String
    System.out.println(clazz2.getName()); // java.lang.String
    System.out.println(clazz2.getCanonicalName()); // java.lang.String
    System.out.println(clazz2.getTypeName()); // java.lang.String

  }

}

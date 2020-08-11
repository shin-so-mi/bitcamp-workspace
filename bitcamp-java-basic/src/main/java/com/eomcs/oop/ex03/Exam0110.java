package com.eomcs.oop.ex03;

public class Exam0110 {
public static void main(String[] args) {
  //인스턴스 변수 static 이 붙지 않음 non-static 변수
  class A {
    int v1;
    boolean v2;
    //v1,b2  A의 인스턴스,객체
  }
    A obj1 = new A(); //생성자 호출
   //A객체의 주소레퍼런스 =obj1
    A obj2 = new A();
    A obj3 = new A();

  obj1.v1=100;
  //레퍼런스 뒤에 객체의 변수명을 적어주면 레퍼런스주소로 찿아간다


}
}

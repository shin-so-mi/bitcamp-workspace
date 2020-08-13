// 오버라이딩(overriding) - 상위클래스의 메소드 호출
package com.eomcs.oop.ex06.c;

public class Exam0430 {
  public static void main(String[] args) {
    X4 x4 = new X4();
    x4.m1();

   //ㅡ인스턴스 필드와 달리 메서드의 경우는
// 상위 레퍼런스가 하위 인스턴스를 가르킬경우
    //호출하는 메서드는 그인스턴스의 클래스에서 찿는다
    //없으면 상위클래스로 따라 올라가면서 찿는다
    ((X3)x4).m1();
    ((X2)x4).m1();
    ((X)x4).m1();
  }
}

// this.메서드() 호출?
// => 현재 클래스부터 호출할 메서드를 찾는다.
//
// super.메서드() 호출?
// => 부모 클래스부터 호출할 메서드를 찾는다.







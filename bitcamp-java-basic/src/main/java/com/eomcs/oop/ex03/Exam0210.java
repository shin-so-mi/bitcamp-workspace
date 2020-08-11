package com.eomcs.oop.ex03;

public class Exam0210 {
  static class A{
static int v1; //클래스변수 클래스이름을 생략해도됟ㄴ다//스테틱,클래스변수
int v2; //변수가 아니라 명령어이다 NEW라=ㅡㄹ 사용해라 //인스턴스,논스테틱 변수

    static void m1() {  //클래스 메서드
      System.out.println("m1()");
      A.v1 = 100;
      v1 = 200; //같은 스테틱 멤버이기떄뭉에 생략가능

      //this.v2 = 200;
      // 스테틱 메소드는 THIS라는 내장변수가 엊ㅅ다
      //스테틱 메서드는 THIS를 사용하여 접근하는 인스턴스멤버(필드,메서드)를
      //사용할수 없다

    }
    void m2() { //인스턴스 메서드 앞에 인스턴스 주소를 넣어야함
      System.out.println("m2()");
      this.v1 = 100; =>A.v1 =100;
      v1 = 100; => A.v1 = 200;
      A.v1 = 100;
      //인스턴스 필드에 접근하려면
      //메서드 내장변수인 this를 사용하라
      //외부로부터 받은 인스턴스주소를 갖고있다
 this.v2 = 100;
 v2 = 300; //생략가능
 //스태틱필드는 인스턴스레퍼런스를 통해 접근할수있다
 //그러나권장하지 않는다
 this.v1 = 100;

 //물론다음과같이 클래스이름을 생략 할수잇다

 v1 = 200;
 A.v1 = 200;
    }
m1();
A.m1();
//인스턴스메서드는 인스턴스멤버(필드,메서드) 뿐만아니라
// 클래스 맴버 (필드나 메서드)도 사용할수있다

  static int abc(int value) {
     if (value <0) {
       return value * -1;
     }else {
       return value;
     }
   }


}
     public static void main(String[] args) {
       A.m1();
      // A.m2();
       //인스턴스가 있어야 만 호출가능
       A obj1 = new A();
       obj1.m2();

       System.out.println(obj1.abc(100));
       System.out.println(Math.abc(-100));

       }
}
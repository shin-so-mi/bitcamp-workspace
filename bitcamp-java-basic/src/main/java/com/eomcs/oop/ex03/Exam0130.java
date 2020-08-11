package com.eomcs.oop.ex03;

public class Exam0130 {
//instance 변수  클래스 변수
 static  class A {
   static  int v1;
static boolean v2;
 }//클래스는 딱한번만 로딫된다
public static void main(String[] args) {
    A obj1 = new A();
    A obj2 = new A();
  //레퍼런스 변수명 = 100;
 //레퍼런스 다음에지정한 변수가 인스턴스 변수가 아니라
// 클래스 변수라면 컴파일러가 컴파일 하는 과정에 정화과게
    //클래스변수를 가르키도록 기계어로 바꾼다
    //개발자가 레퍼런스를 통해 클래스 변수를 지정하더라도
    //컴파일러가 클랴스 변수로 인식하여 클래스변수를 사요와는 코드를 변환한다

  obj1.v1=100;//method Area 에 저장 클래스변수임
  obj2.v1=200;


  System.out.println(obj1.v1);
  System.out.println(obj2.v1);

}
}
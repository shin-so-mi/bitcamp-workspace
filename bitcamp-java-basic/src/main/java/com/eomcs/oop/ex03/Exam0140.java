package com.eomcs.oop.ex03;

public class Exam0140 {

 static  class A {
static int v1; //클래스변수
int v2;        //인스턴스변수

}


  public static void main(String[] args) {
    A.v1 = 100;
//클래스변수는 클래스가 로딩되는 시점에 method Area에 생성된다
    //클래스가 로딩되는떄는 로딩되지않은 클래스를 사용할떄
    //클래스 변수를 사용하거나 클래스 메서드를 사용하려할때

    A obj1 = new A();
    A obj2 = new A();

    obj1.v2 = 200;
    obj2.v2 = 300;


    System.out.println(A.v1);
    System.out.println(obj1.v1);
    System.out.println(obj1.v1);
    System.out.println(obj1.v2);
    System.out.println(obj1.v2);

  }
}
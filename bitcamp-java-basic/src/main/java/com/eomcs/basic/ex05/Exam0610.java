package com.eomcs.basic.ex05;

//# 증감 연산자 : 후위(post-fix) 증가 연산자
//
public class Exam0610 {
  public static void main(String[] args) {
    int i = 2;
   // 증감연산자가 없다면
    //기존 변수의 값을 1증가 시키기 위해 다음과 같이 코딩해야한다
    //i = i + 1;
    //증감연산자를 사용하면 다음과 같이 간단하게 사용가능
    i++;  // i = 3
    // 현재 위치에 i 메모리에 들어 있는 값(2)을 꺼내 놓는다. 
    //  그런다음 i 메모리의 값을 1 증가시킨다.

    i++;   // i = 4

    System.out.println(i);

    System.out.println(i++);
    // System.out.println(4);
    // i = i + 1;
    System.out.println(i);

  }
}

package com.eomcs.basic.ex08;

import com.eomcs.oop.ex01.Score;

//캠슐화 문법 사용전
public class Exam0111 {
  public static void main(String[] args) {


  Score s1 = new Score();
  s1.name = "홍길동";
  s1.kor = 100;
  s1.eng = 90;
  s1.math = 80;
  s1.compute();

  s1.sum = s1.kor + s1.eng + s1.math;
  s1.aver = s1.sum / 4f;

  // 원래 프로그램에서 의도한대로 계산결과가
  //나오지 않는다
  //해결책
  //sum이나 aver처럼 기존필드의 값을연산해서
  //나온결과를 저장하는경우
  직접 해당변수의 값을 변경하지 못하도록 막아야한다
  오직 메서드를 통해서만 변경하도록 해야한다





  }
}
























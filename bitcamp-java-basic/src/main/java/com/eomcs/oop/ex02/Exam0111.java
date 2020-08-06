package com.eomcs.oop.ex02;

public class Exam0111 {

static class Score {
  String name = "홍길";
  int kor;
  int eng;
  int math;
  int sum;
  float aver;
}
public static void main(String[] args) {
  Score s1;
  //Score설계도에 따라만든 변수목록(인스턴스)
  s1 = new Score();
//로컬변수생성
 s1.name = "홍길";
 //s1의 인스턴스에 name항목에 홍길동을 집어넣어라
  s1.kor = 100;
  s1.eng = 90;
  s1.math = 87;
  s1.sum= s1.kor + s1.eng +s1.math;
  s1.aver = s1.sum / 3f;
  printScore(s1);
}


static void printScore(Score s) {
  System.out.printf("%s:%d,%d,%d,%d,%.1f\n", s.name,s.kor,s.eng,s.math,s.sum,s.aver);
//s객체의 항목들에 넣어라
}
}
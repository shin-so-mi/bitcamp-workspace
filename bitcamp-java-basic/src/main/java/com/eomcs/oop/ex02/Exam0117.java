package com.eomcs.oop.ex02;

import com.eomcs.oop.ex02.util.Score2;

public class Exam0117 {


public static void main(String[] args) {
  Score2 s1;
  //Score설계도에 따라만든 변수목록(인스턴스)
  s1 = new Score2();
//로컬변수생성
 s1.init("홍길동", 100, 90,87);
 s1.compute();

  Score2 s2 =new Score2();
  s2.init("임걱정",90,100,100);

  s2.compute();


  printScore(s1);
  System.out.println("============");
  printScore(s2);
}


static void printScore(Score2 s) {
  System.out.printf("%s:%d,%d,%d,%d,%.1f\n", s.name,s.kor,s.eng,s.math,s.sum,s.aver);
//s객체의 항목들에 넣어라
}
}
package com.eomcs.oop.ex02;

import com.eomcs.oop.ex02.util.Score3;

public class Exam0118 {


public static void main(String[] args) {
  Score3 s1;

  s1 = new Score3();
//로컬변수생성
 s1.init("홍길동", 100, 90,87);
 s1.compute();

  Score3 s2 =new Score3();
  s2.init("임걱정",90,100,100);

  s2.compute();


  printScore(s1);
  System.out.println("============");
  printScore(s2);

}


static void printScore(Score3 s) {
  System.out.printf("%s:%d,%d,%d,%d,%.1f\n", s.name,s.kor,s.eng,s.math,s.sum,s.aver);
//s객체의 항목들에 넣어라
}
}
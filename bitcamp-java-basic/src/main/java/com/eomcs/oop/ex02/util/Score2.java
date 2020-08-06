package com.eomcs.oop.ex02.util;

public class Score2 {
  public String name;
  public int kor;
  public int eng;
  public int math;
  public int sum;
  public float aver;
  public void compute() {
  this.sum = this.kor + this.eng + this.math;
  this.aver = this.sum / 3f;
}


  public void init(String name,int kor,int eng,int math) {
    this.name = name;
    this.kor = kor;
    this.eng = eng;
    this.math = math;
    this.compute();
    //this에 저장된 주소에 copute를 넣어라

  }
}

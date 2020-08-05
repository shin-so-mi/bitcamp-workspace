package com.eomcs.basic.ex07;

public class Exam0414 {
static class Score {
  int name;
  int kor;
  int eng;
  int math;
  int sum;
  int aver;

}
public static void main(String[] args) throws Exception {
  Score s = new Score();


Score s2;
s2 = createObject();

}
//score클래스의 설계도에 따라 heap에 생성한 메모리의 주소를 리턴
//score클래스에따라 heap에 생성한 후  그 주소를 리턴
//score클래스 인스턴스를 생성한후 그주소르 리턴
//score클래스의 인스턴스르 리턴
//score 인슻턴스를 리턴
//score 객체를 리턴score클래스


static Score createObject() {
  Score s = new Score();
  return s;
}








}
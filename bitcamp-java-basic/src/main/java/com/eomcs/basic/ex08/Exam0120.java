package com.eomcs.basic.ex08;

;

public class Exam0120 {
public static void main(String[] args) {
  Examvehicle v = new Examvehicle();
  Exambike b = new Exambike();
  Examcar c = new Examcar();
  Examsedan s = new Examsedan();
  Examtruck t = new Examtruck();
//자식클래스의 인스턴스는 가리킬수 있다
  //자식클래스의 인스턴스에는 무조건 부모인스턴스가 들어있기때문이다
  //c2 = s;
  //c2 = t;
  //상위 클래스의 레퍼런스로 하위클래스의 레퍼런스를 가르킬때

  Examcar c = new Examsedan();
  c.model = "티";
  c.capacity = 5;
  c.cc = 890;
  c.valve = 16;


}
}

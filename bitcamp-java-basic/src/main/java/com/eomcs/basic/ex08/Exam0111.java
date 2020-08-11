package com.eomcs.basic.ex08;

public class Exam0111 {
public static void main(String[] args) {
  Examvehicle v = new Examvehicle();
  Examcar c = new Examcar();
  Exambike b = new  Exambike();
  Examsedan s = new Examsedan();
  Examtruck t = new Examtruck();
  //레퍼런스는 같은타입의 객체를 가리킬수 잇을 뿐만아니라
  //그 클래스의 서브 클레스 객체까지 가리킬수 있다
  //서브클래스는 항상 상위클래스의 모든것을 사용할수 있다
  //이런 규칙에따라서 다음 v2변수는 Examvehicle객체 뿐만아니라
  //그밑 바이크 카 세단 객체까지 다양한 서브클래스의 객체를 가리킬수 있다
  //그래서 v2를 다형적 변수의 기능을 갖고 있다고 말한다
  Examvehicle v2 = null;
  v2 = c;
  v2 = b;
  v2 = s;
  v2 = t;
  //이렇게 상위클래스의 레퍼런스로 하위클래스의 인스턴스를
  //가리킬수 있는 이유는?
  //하위클래스의 인스턴스는 상위클래스의 인스턴스 멤버를 갖고잇어서.
  //그래서상위클래스의 레퍼런스(주소)로 상위클래스의 인스턴스멤버사용을 보장한다
  //
  //예를들어 vehcicle 변수v2 가   bike객체를 가르킨다면
  v2 = b;
  //v2를 통해서 vehicle변수에 접근할수잇다


}
}

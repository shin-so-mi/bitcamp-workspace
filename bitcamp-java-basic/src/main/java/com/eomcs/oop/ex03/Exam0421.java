package com.eomcs.oop.ex03;

public class Exam0421 {
  static class Smartphone {
    int volume;
    int bright;
    int constrast;



//다음과 같이 기본생성자를 직접정의할수있다
    //클래스 이름과같다
    //생성자가 한개라도 있으면 자동으로 생성되지않는다
    public Smartphone(int a) {
      System.out.println("Smartphone() 생성자 호출됨");
    }




    }

public static void main(String[] args) {
  //인스턴스를 생성할떄 반드시 ㄹ호출될 생성자를 지정해야한ㄱ다
  //new 클래스명(값);
  //new A();생성자에 파라미터가 없기때문에 값을 넘겨주지않는다
  //new A(100); 생성자의 파라미터가 int이기땜에 정수 값을 넘긴다


  //smartphone 인스턴스를 만들때 기본생성자가 호출되게 한다
//  Smartphone obj1 = new Smartphone;// 오류

  //다음과같이 존재하지않는 생성자를 지정하면 오류이다
  //Smartphone obj1 = new Smartphone(100); int 파라미터를가지는 생성자는없다



Smartphone obj1 = new Smartphone(100);

System.out.println(obj1.volume);
System.out.println(obj1.bright);
System.out.println(obj1.constrast);
}
}
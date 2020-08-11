package com.eomcs.oop.ex03;

public class Exam0422 {
  static class Smartphone {
    int volume;
    int bright;
    int constrast;


//파라미터가 다른생성자를여러개 정의할수있다

    public Smartphone(int a) {
      System.out.println("Smartphone(int) 생성자 호출됨");
    }


    public Smartphone() {
      System.out.println("Smartphone() 생성자 호출됨");
    }
    public Smartphone(String str, int a) {
      System.out.println("Smartphone(String,int) 생성자 호출됨");
    }

    }

public static void main(String[] args) {
  //인스턴스를 생성할떄 생성자에 던지는값에 땋라
  //자동으로 호출될 생성자가 결정된다
new Smartphone();
new Smartphone(100);
new Smartphone("aa",100);

Smartphone obj1 = new Smartphone();

System.out.println(obj1.volume);
System.out.println(obj1.bright);
System.out.println(obj1.constrast);
}


}
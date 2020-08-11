package com.eomcs.oop.ex03;
class Smartphone {
  int volume;
  int bright;
  int constrast;


  private Smartphone() {

    System.out.println("Smartphone() 생성자 호출됨");
  }
  public Smartphone(int volume) {
    System.out.println("Smartphone(int) 생성자 호출됨");

    this.volume = volume;
    this.bright = 50;
    this.constrast = 50;
  }
//파라미터가 다른생성자를여러개 정의할수있다

public class Exam0424 {


    public Smartphone(int volume,int bright) {
      this.volume = volume;
      this.bright = bright;
      this.constrast = constrast;
      System.out.println("Smartphone(int,int) 생성자 호출됨");
    }
    public Smartphone(int volume, int bright, int constrast) {
      System.out.println("Smartphone(int,int,int) 생성자 호출됨");
      this.volume = volume;
      this.bright = bright;
      this.constrast = constrast;
    }
void m1 () {
  //일반메서드에서 생성자를 임의로 호출할수 없다.

}
    }

public static void main(String[] args) {
  // private로 접근 제한한경우 다른 클래스가 생성자를 지정할수 없다
  Smartphone obj1 = new Smartphone();

  //생성자 호출은 new명령을 실행할떄만 지정할수 있다
  //




//new Smartphone(100);
//new Smartphone("aa",100);

//Smartphone obj1 = new Smartphone();

//System.out.println(obj1.volume);
//System.out.println(obj1.bright);
//System.out.println(obj1.constrast);
}


}
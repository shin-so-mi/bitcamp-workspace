package com.eomcs.oop.ex03;

public class Exam0423 {
  static class Smartphone {
    int volume;
    int bright;
    int constrast;


//파라미터가 다른생성자를여러개 정의할수있다
    public Smartphone() {
      this(50,50,50);
      System.out.println("Smartphone() 생성자 호출됨");
    }
    public Smartphone(int volume) {
      System.out.println("Smartphone(int) 생성자 호출됨");

      this.volume = volume;
      this.bright = 50;
      this.constrast = 50;
    }


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
  //인스턴스를 생성할떄 생성자에 던지는값에 땋라
  //자동으로 호출될 생성자가 결정된다
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
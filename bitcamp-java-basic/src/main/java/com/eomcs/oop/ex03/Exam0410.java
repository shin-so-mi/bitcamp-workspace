package com.eomcs.oop.ex03;

public class Exam0410 {
  static class Smartphone {
    int volume;
    int bright;
    int constrast;


    void playmusic() {
      // 음악을 출력한다
    }
    //생성자란?
    // 인스턴스를 만든 후 사용하기전에 적적한 값으로 초기화시킬 필요가있다
   // (제품을만든 후 사용하기전에)
    //제품이 구동되는데 문제가없도록 기본값으로 설정되어야한다
    //그래서 인스턴스를 사용하기 전에 적절한 값으로 초기화 시키기위해
    //자동으로 호출하는 메서드를 도입하게 되었다(생성자)
    //모든클래스는 반드시 한개이상의 생성자를 가져야 한다
    //생성자문법
    //클래스명 (파라미터,..) {
 //생성자를 선언할때는 리턴타입을 지정하지 않는다
  //개발자가 생성자를 작성하지 않으면 컴파일러가 자동으로 추가한다
 // 기본생성자 (default constructor)
    //파라미터가 없는 생성자
    //public으로 공개된다
    //public 클래스명() {

    //이클래스의 생성자를 정의하지않으면ㅇ 다음과같이 기본생성자가 추가된다
    //   public Smartphone(){


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



Smartphone obj1 = new Smartphone();
obj1.playmusic();
System.out.println(obj1.volume);
System.out.println(obj1.bright);
System.out.println(obj1.constrast);
}
}
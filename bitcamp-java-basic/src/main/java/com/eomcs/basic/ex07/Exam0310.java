package com.eomcs.basic.ex07;
//call by value값만 넘기는것 , call by reference 주소(배열)
  public class Exam0310 {

    class Person {
      String name;
      int age;
      boolean working;
      //새 종류의 설계도
    }














   public static void main(String[] args) {
    int a = 200;  //명령
    m1(a);
    System.out.println(a);

    a = 300;
    m1(a);

    System.out.println(a);
   int[] arr = new int[3];
   arr[0] = 100;
   arr[1] = 200;
   arr[2] = 300;
   m2(arr); // new명령으로 생성하는 변수 HEAP
   System.out.println(arr[0]);
   System.out.println(arr[1]);
   System.out.println(arr[2]);



   Person p = new Person();

 System.out.printf("%s, %d, %b\n", p.name,p.age, p.working);

 m3(p);  //call by reference
 System.out.printf("%s, %d, %b\n", p.name,p.age, p.working);
}
static void m3(Person p) {
  p.name = "홍길동";
  p.age = 20;
  p.working = true;

  }

   static void m1(int a) {
     a = 100;
      System.out.println("==>" + a);


   }
   static void m2(int[] arr) {
     arr[0] *= 2;
     arr[1] *=3;
     arr[2] *=4;

   }
}

  //로컬변수는 호출하고나면 사라진다
  //값을넘김




// 시험지
  //1.다음 계산을 수행하라
  // A변수에 100을 넣어라
  // B변수에 200을 넣어라
  // A와 B를 더해 그결과를 더해라

  //
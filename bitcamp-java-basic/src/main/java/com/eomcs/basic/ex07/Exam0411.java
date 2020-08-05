package com.eomcs.basic.ex07;

public class Exam0411 {

 public static void main(String[] args) {

   int a = 100;
   System.out.println("main() >> " + a );
   m1(a);
   System.out.println(a + " << main()");





 }



 static void m1(int a) {
   a = 100;
   System.out.println("main() >> " + a );
   m2(a);
   System.out.println(a + "<< m1()");
 }




 static void m2(int a) {
   a += 100;
   System.out.println("m2() >> " + a );
   m3(a);
   System.out.println(a + "<< m2()");
 }

 static void m3(int a) {
   a += 100;
   System.out.println("m3() : " + a );
 }
//메소드의 로컬변수는

  }
//LIFO 후입선출 스택 마지막에들어온것을 먼저처리(웹브라우져에서 방문한페이지 저장)
//FILO 선입선출 큐  먼저들어온것을 먼저처리 (예약시스템구축)


//조건문
package com.eomcs.basic.ex06;

public class Exam0110 {
public static void main(String[] args) {
   int age = 64;



   if (age >= 19)

    System.out.println("성인입니다");



   if (age >=65)
    System.out.println("노인연금 수령대상자");


  System.out.println("================================");


  int gender = 2;

  if (gender == 1) {
    System.out.println("여성");
    System.out.println("---------------------------");
  } else {
    System.out.println("남성");
    System.out.println("---------------------------");
  }

  System.out.println("------------------------");

  int age2 = 17;

  if (age2 >= 19)
    if (age2 >= 65)
      System.out.println("지하철 무임승차 가능합니다");
  else
      System.out.println("미성년입니다");


  else // 맨위의 17에 속함
    System.out.println("ok");



    int age3 = 56;
    if (age3 < 8)
      System.out.println("아동");
    else
      if (age3 < 14)
        System.out.println("어린이");
      else
        if (age3 < 19)
          System.out.println("청소년");
        else
          if (age3 < 65)
            System.out.println(" 성인");
          else
            System.out.println("노인");


    System.out.println("------------------------");



     age3 =55;
    if (age3 < 8)
      System.out.println("아동");
    else if (age3 < 14)
        System.out.println("어린이");
      else if (age3 < 19)
          System.out.println("청소년");
        else if (age3 < 65)
            System.out.println(" 성인");
          else
            System.out.println("노인");











    age3 =22;
   if (age3 < 8) {
     System.out.println("아동");
   }else if (age3 < 14) {
       System.out.println("어린이");
   }else if (age3 < 19) {
         System.out.println("청소년");
   }else if (age3 < 65) {
           System.out.println(" 성인");
   }else
           System.out.println("노인");



//if 문의 조건은 반듯이 boolean데이터여야한다

//if 문은 else 문 없이 단독으로 사용 할수 있다
   int age5 = 17;
   if (age5 < 19)
     System.out.println("미성년입니다");

   //else 문을 사용하는 아주 모범적인 예
   if (age5 < 19)
     System.out.println("성인입니다");
   else
     System.out.println("미성년입니다");

   //여러문장으로 실행할떄 블록으로 묶어야 한다

   if (age >= 20) {
     System.out.println("================");
     System.out.println("성인");
   }else {
     System.out.println("===================");
     System.out.println("미성년");
   }


    //if , else 둘중 하나만 블럭으로 묶을수 있다
    if (age >= 19)
      System.out.println("성");

      else {
        System.out.println("미성년");
      }
      //if 와 else사이에 다른문장이 올순 없다


    if (age >= 64)
      if (age >= 65)
        System.out.println("지하철 무임승차 가능");
      else
        System.out.println("미성년입니다");

       System.out.println("=======================");

//if와 else 를 한문장으로 간주한다

       //굳이 중괄호를 넣을 필요는 없다
    if (age >= 19) {
      if (age >=70)
        System.out.println("지하철 무임승차 가");

      else
        System.out.println("미성년임");
    }

















}
}

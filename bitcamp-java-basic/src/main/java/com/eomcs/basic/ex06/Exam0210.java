package com.eomcs.basic.ex06;

public class Exam0210 {
public static void main(String[] args) {
  final int GENERAL_MANAGER = 2;
   final int  DEVELOPER = 1;
 final  int BUILDING_MANAGER = 3;
 int type = GENERAL_MANAGER;
   if (type == DEVELOPER) { //개발자
     System.out.println("정보처리 자격증");
     System.out.println("졸업증명서");
     System.out.println("이력서");
   } else if (type == GENERAL_MANAGER) { //일반관리
     System.out.println("졸업증명서");
     System.out.println("이력서");
   }else if (type == BUILDING_MANAGER) { //시설관리
     System.out.println("이력서");
   }else {
     System.out.println("잘못된양식");
   }
   System.out.println("-----------------------");


  switch (type) {
    case DEVELOPER:
    System.out.println("정보처리 자격증");



    case GENERAL_MANAGER:
    System.out.println("졸업증명서");


    case BUILDING_MANAGER:
    System.out.println("이력서");
     break;
    default:
      System.out.println("잘못된양식");
  }

  System.out.println("-----------------------");

int score = 70;
switch (score) {
  case 100:
  case 90:
    System.out.println("a");
    break;
  case 80:
  case 70:
    System.out.println("b");
    break;
  case 60:
  case 50:
    System.out.println("c");
    break;
    //값이  하나로 떨어질때 가능
}
System.out.println("-----------------------------");


     String value = "developer";
    final String value2 = "developer2";
switch (value) { //4byte이하정수( byte,short,int,char)
  case value2:
    break;
  case "developer":
    break;
  case "manager":
    break;
    default:
 //케이스명은 상수값만 온다 변수는 안됌
}

  int value3 = 100;
  final int x = 200;

  switch (value3) {
    case 100:
      break;
    case 100 + 3:
      break;
    case x + 3:
      break;
  }

 System.out.println("------------------------------------");
    job type2 = job.DEV;

    switch (type2) {
      case DEV:
      break;
      case GM:
     break;
      case BM:
        break;
    }



}
enum job {   //상수이름만 기술한다  그룹명을 넣어야한다
  DEV, GM, BM
}
}



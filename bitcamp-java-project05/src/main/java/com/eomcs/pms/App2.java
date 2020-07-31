package com.eomcs.pms;

import java.sql.Date; //컨트롤 스페이스 누르고나서 sql선택  미리알려주는것

public class App2 {

  public static void main(String[] args) {
    class project{
      int no;
      String title;
      String content;
      Date startDate;
      Date endDate;
      String owner;
    String member;
    }


   //여러개의 프로잭트 정보를 입력받기 위해 변수 준비
     final int LENGTH = 10;
  project[] one = new project[LENGTH];

  java.util.Scanner KeyInput = new java.util.Scanner(System.in);


    System.out.println("[프로잭트]");


    int count = 0;

    for (int i = 0; i < LENGTH; i++) {
      project o = new project();  //레퍼런스 o 를만듬
      count++;

      System.out.print("번호: ");
      o.no = KeyInput.nextInt();
      KeyInput.nextLine(); //버리는효과


      System.out.print("프로젝트명: ");
      o.title = KeyInput.nextLine();

      System.out.print("내용: ");
      o.content = KeyInput.nextLine();

      System.out.print("시작일: ");
      o.startDate = Date.valueOf(KeyInput.nextLine());

      System.out.print("종료일: ");
      o.endDate = Date.valueOf(KeyInput.nextLine());

      System.out.print("만든이: ");
      o.owner = KeyInput.nextLine();

      System.out.print("팀원: ");
      o.member = KeyInput.nextLine();


      one[i] = o;



      System.out.print("계솓 입력 하시겠습니까?(y/N)");
      String response = KeyInput.nextLine();
      if (!response.equalsIgnoreCase("y")) //사용자가 y가아니라면  break다
        break;

      System.out.println();


    }

    KeyInput.close();


    System.out.println("-------------");


    for (int i = 0; i < count; i++) {
      project o = one[i];
      System.out.printf("%d ,%s,%s,%s,%s\n" ,
          o.no, o.title,o.startDate,o.endDate ,o.owner);
    }



  }
}

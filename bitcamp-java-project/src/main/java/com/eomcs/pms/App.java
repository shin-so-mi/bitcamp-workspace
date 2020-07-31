package com.eomcs.pms;

import java.sql.Date;

public class App {
   public static void main(String[] args) {
     class member {
    int no;
    String title;
    String content;
    Date startDate;
    Date endDate;
    String owner;

     }
     java.util.Scanner KeyInput = new java.util.Scanner(System.in);

    final int LENGTH = 10;

     member[] builder = new member[LENGTH];

     System.out.println("개발자 ");

     int count = 0;

     for (int i = 0; i < LENGTH; i++) {
       member a = new member();
       count++;

       System.out.print("번호 :");
       a.no = KeyInput.nextInt();
       KeyInput.nextLine();


     System.out.print("내용:");
     a.title = KeyInput.nextLine();

     System.out.print("시작일:");
    a.startDate = Date.valueOf(KeyInput.nextLine());

    System.out.print("종료일:");
    a.endDate = Date.valueOf(KeyInput.nextLine());

    System.out.print("만든이 :");
    a.owner = KeyInput.nextLine();

    builder[i] = a;

    System.out.print("계속 하시겟습니까? (y/N)");
      String response = KeyInput.nextLine();
     if (!response.equalsIgnoreCase("y"))
       break;

  }

  KeyInput.close();

   for (int i = 0; i < count; i++) {
     member a = builder[i];
      System.out.printf("%d, %s, %s, %s %s\n",
          a.no, a.title, a.startDate, a.endDate , a.owner);
   }







   }
}

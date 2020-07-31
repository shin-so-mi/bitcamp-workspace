package com.eomcs.pms;

import java.sql.Date;

public class App3 {

  public static void main(String[] args) {




    java.util.Scanner KeyInput = new java.util.Scanner(System.in);




   final int length = 3;
    int[] no = new int[length];
    String[]content = new String[length];
    Date[]endDate = new Date[length];
    String[]state = new String[length];
      int count = 0;


      System.out.println("[프로잭트]");


      for (int i = 0; i <length; i++) {
        count++;
        System.out.printf("번호: ");
        no[i] = KeyInput.nextInt();
        KeyInput.nextLine();


        System.out.printf("내용: ");
        content[i] = KeyInput.nextLine();

        System.out.printf("종료일: ");
        endDate[i] = java.sql.Date.valueOf(KeyInput.nextLine());

        System.out.printf("상태: ");
        state[i] = KeyInput.nextLine();

      }








      switch (state) {
      case "0":
        System.out.println("신규");
        break;

      case "1":
      System.out.println("진행중");
      break;

       default:
         System.out.println("완료");

    }



     KeyInput.close();








  }
}

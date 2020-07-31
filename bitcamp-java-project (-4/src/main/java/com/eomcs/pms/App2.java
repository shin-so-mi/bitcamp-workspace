package com.eomcs.pms;

import java.sql.Date; //컨트롤 스페이스 누르고나서 sql선택  미리알려주는것

public class App2 {

  public static void main(String[] args) {

    java.util.Scanner KeyInput = new java.util.Scanner(System.in);

   //여러개의 프로잭트 정보를 입력받기 위해 변수 준비
     final int LENGTH = 10;

    int[] no = new int[LENGTH];
    String[] title = new String[LENGTH];
    String[] content = new String[LENGTH];
    Date[] startDate = new Date[LENGTH];
    Date[] endDate = new Date[LENGTH];
    String[] owner = new String[LENGTH];
    //  주소를 담는 ==레퍼런스 배열을 가르키는변수


    int count = 0;

    System.out.println("[프로잭트]");


    for (int i = 0; i < LENGTH; i++) {
      count++;

      System.out.print("번호: ");
      no[i] = KeyInput.nextInt();
      KeyInput.nextLine(); //버리는효과


      System.out.print("프로젝트명: ");
      title[i] = KeyInput.nextLine();

      System.out.print("내용: ");
      content[i] = KeyInput.nextLine();

      System.out.print("시작일: ");
      startDate[i] = java.sql.Date.valueOf(KeyInput.nextLine());

      System.out.print("종료일: ");
      endDate[i] = java.sql.Date.valueOf(KeyInput.nextLine());

      System.out.print("만든이: ");
      owner[i] = KeyInput.nextLine();


      System.out.println();
      System.out.print("계솓 입력 하시겠습니까?(y/N)");
      String response = KeyInput.nextLine();
      if (!response.equalsIgnoreCase("y")) //사용자가 y가아니라면  break다
        break;

      System.out.println();

    }


    KeyInput.close();


    System.out.println("-------------");


    for (int i = 0; i < count; i++) {
      System.out.printf("%d ,%s,%s,%s,%s\n" , no[i], title[i],startDate[i],endDate[i],owner[i]);
    }







  }
}

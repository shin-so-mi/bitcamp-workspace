package com.eomcs.pms;

import java.sql.Date;

public class App2 {
public static void main(String[] args) {
  class develop {
    String name;
    int age;
    String title;
    String content;
    Date start;


  }

  java.util.Scanner KeyInput =new java.util.Scanner(System.in);
  final int LENGTH = 10;
  develop[] javap = new develop[LENGTH];
  int count = 0;



  for (int i = 0; i < LENGTH; i++) {
     count++;

     develop b = new develop();

     System.out.print("이름:");
     b.name = KeyInput.nextLine();

     System.out.print("나이 : ");
     b.age = KeyInput.nextInt();
     KeyInput.nextLine();


     System.out.print("제목:");
     b.title = KeyInput.nextLine();

     System.out.print("내용:");
     b.content = KeyInput.nextLine();

     System.out.print("시작일:");
     b.start = Date.valueOf(KeyInput.nextLine());


     javap[i] = b;



     System.out.println("계속 입력 하시곘습니까? ( y/N)");
     String response = KeyInput.nextLine();

     if (!response.equalsIgnoreCase("y"))

       break;

     System.out.println();



  }

  KeyInput.close();



  for ( int i = 0; i < count; i++) {
      develop b = javap[i];
    System.out.printf("%s, %d, %s, %s, %s\n",
        b.name, b.age, b.title, b.content, b.start);

  }








}










}

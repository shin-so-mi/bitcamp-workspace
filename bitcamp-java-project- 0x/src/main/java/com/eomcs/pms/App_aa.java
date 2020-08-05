package com.eomcs.pms;
import java.sql.Date;
//회원번호,이메일,암호,사진,전화전호,등록일을 4담을수 있는 메모리를 설계한다
//MEMBER클래수 정의
//클랫스의 패키지정보를 미리 선언하여 컴파일에게 알려준다
import java.util.Scanner;

public class App_aa {

  public static void main(String[] args) {
    //값을 담기위해 메모리를 준비할때
    //어떤종류의 메모리를 준비해야하는지 설계도를 작성한다
    //이것을 클래스라 한다

    class Member {
      int no;
      String name;
      String email;
      String password;
      String photo;
      String tel;
      Date now;

    }
   Scanner KeyInput = new Scanner(System.in);

    System.out.println("[회원]");

    int no1, no2, no3, no4, no5;
    String name1, name2, name3, name4, name5;
    String email1, email2, email3, email4, email5;
    String password1, password2, password3, password4, password5;
    String photo1, photo2, photo3, photo4, photo5;
    String tell1, tell2, tell3,tell4, tell5;
    java.sql.Date now1, now2, now3, now4, now5;
    long currentMillis1;

     //1번회원
    System.out.println("번호:");
    no1 = KeyInput.nextInt();
    KeyInput.nextLine();

    System.out.println("이름:");
    name1 = KeyInput.nextLine();

    System.out.println("이메일:");
    email1 = KeyInput.nextLine();

    System.out.println("암호:");
    password1 = KeyInput.nextLine();

    System.out.println("사진:");
    photo1 = KeyInput.nextLine();

    System.out.println("전화:");
    tell1 = KeyInput.nextLine();

    long currentMillis =  System.currentTimeMillis();
    now1 = new Date(currentMillis);


    System.out.println();



    //2번회원

    System.out.println("번호:");
    no2 = KeyInput.nextInt();
    KeyInput.nextLine();

    System.out.println("이름:");
    name2 = KeyInput.nextLine();

    System.out.println("이메일:");
    email2 = KeyInput.nextLine();

    System.out.println("암호:");
    password2 = KeyInput.nextLine();

    System.out.println("사진:");
    photo2 = KeyInput.nextLine();

    System.out.println("전화:");
    tell2 = KeyInput.nextLine();

    currentMillis =  System.currentTimeMillis();
    now2 = new Date(currentMillis);


    System.out.println();


    //3번회원
    System.out.println("번호:");
    no3 = KeyInput.nextInt();
    KeyInput.nextLine();

    System.out.println("이름:");
    name3 = KeyInput.nextLine();

    System.out.println("이메일:");
    email3 = KeyInput.nextLine();

    System.out.println("암호:");
    password3 = KeyInput.nextLine();

    System.out.println("사진:");
    photo3 = KeyInput.nextLine();

    System.out.println("전화:");
    tell3 = KeyInput.nextLine();

    currentMillis =  System.currentTimeMillis();
    now3 = new Date(currentMillis);


    System.out.println();

     //4번회원
    System.out.println("번호:");
    no4 = KeyInput.nextInt();
    KeyInput.nextLine();

    System.out.println("이름:");
    name4 = KeyInput.nextLine();

    System.out.println("이메일:");
    email4 = KeyInput.nextLine();

    System.out.println("암호:");
    password4 = KeyInput.nextLine();

    System.out.println("사진:");
    photo4 = KeyInput.nextLine();

    System.out.println("전화:");
    tell4 = KeyInput.nextLine();

    currentMillis =  System.currentTimeMillis();
    now4 = new Date(currentMillis);


    System.out.println();

    //5번회원
    System.out.println("번호:");
    no5 = KeyInput.nextInt();
    KeyInput.nextLine();

    System.out.println("이름:");
    name5 = KeyInput.nextLine();

    System.out.println("이메일:");
    email5 = KeyInput.nextLine();

    System.out.println("암호:");
    password5 = KeyInput.nextLine();

    System.out.println("사진:");
    photo5 = KeyInput.nextLine();

    System.out.println("전화:");
    tell5 = KeyInput.nextLine();

    currentMillis =  System.currentTimeMillis();
    now5 = new Date(currentMillis);

    System.out.println();




    KeyInput.close();



    System.out.println("-----------------");
    System.out.printf("%d, %s, %s, %s,%s\n" , no1, name1, email1, tell1, now1.toString());
    System.out.printf("%d, %s, %s, %s,%s\n" , no2, name2, email2, tell2, now2.toString());
    System.out.printf("%d, %s, %s, %s,%s\n" , no3, name3, email3, tell3, now3.toString());
    System.out.printf("%d, %s, %s, %s,%s\n" , no4, name4, email4, tell4, now4.toString());
    System.out.printf("%d, %s, %s, %s,%s\n" , no5, name5, email5, tell5, now5.toString());


  }

}
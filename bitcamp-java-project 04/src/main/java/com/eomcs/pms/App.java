package com.eomcs.pms;

import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    //콘솔에서 사용자의 입력을 처리하는 도구를 준비한다
     //키보드:System.in (input stream)
     //in put stream 에서 data를 읽어 적절한타입으로 리턴하는도구 :scanner
   java.util.Scanner KeyInput = new java.util.Scanner(System.in);//괄호안에 입력을받아처리함 
    //자바에서는 리모콘 기능 없이 직접다룰수 없다
    System.out.println("[회원]");
    System.out.println("번호:");
    int no = KeyInput.nextInt();//nextInt 는 입력값중에서 숫자만 가져간다
    KeyInput.nextLine(); //안쓰면 버려진다 숫자뒤에 남아있는 값 읽기고다음으로 넘기기
    System.out.println("이름:");
    String name= KeyInput.nextLine();
    System.out.println("이메일:");
    String email = KeyInput.nextLine();
    
    //날자를 알수있다
    long currentMillis =  System.currentTimeMillis(); //1970-1-1 00:00:00
    java.sql.Date now = new java.sql.Date(currentMillis);
    
    
    String regDay = KeyInput.nextLine();
    System.out.println("암호:");
    String password = KeyInput.nextLine();
    System.out.println("사진:");
    String picture = KeyInput.nextLine();
    System.out.println("전화:");
    String tell = KeyInput.nextLine();
    
    KeyInput.close();
    
    
    
    System.out.println("-----------------");
    System.out.printf("번호: %d\n" , no);
    System.out.printf("이름: %s\n" , name);
    System.out.printf("이메일: %s\n" , email);
    System.out.printf("가입일: %s\n " , now.toString());
    
    
    
    
    
    
  }

}
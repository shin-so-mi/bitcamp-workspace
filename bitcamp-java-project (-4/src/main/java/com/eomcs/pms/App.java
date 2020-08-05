package com.eomcs.pms;
//클랫스의 패키지정보를 미리 선언하여 컴파일에게 알려준다
import java.util.Scanner;
import java.sql.Date;

//낱개의 변수를 사용하여 여러회원정보를 처리하기
public class App {

  public static void main(String[] args) {
   
   Scanner KeyInput = new Scanner(System.in);//괄호안에 입력을받아처리함 
    //자바에서는 리모콘 기능 없이 직접다룰수 없다
    System.out.println("[회원]");
    //최대 5명의 회원정보를 입략받는 변수를선언
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
    
    System.out.println(for (int i = 0; i <count; i++) {
         System.out.printf("%d, %s,%s, %s,%s\n",
         no[pcount], ptitle[pcount] ,pcontent[pcount],pstartDate[pcount],pendDate[pcount]);
        
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
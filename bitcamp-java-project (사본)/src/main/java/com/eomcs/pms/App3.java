package com.eomcs.pms;

import java.util.Scanner;

public class App3 {

  public static void main(String[] args) {
    
    
    java.util.Scanner KeyInput = new java.util.Scanner(System.in);
   
    System.out.println("[작업]");
    
    System.out.print("프로젝트명?: "); 
    String no = KeyInput.nextLine();
    
    System.out.print("번호?: ");
    String str = KeyInput.nextLine();
    int nou = Integer.parseInt(str);
    
    System.out.print("내용?: "); 
    String content = KeyInput.nextLine();  

    System.out.print("상태?: "); 
    String state = KeyInput.nextLine(); 
    
    System.out.print("종료일: ");
    java.sql.Date endDate = java.sql.Date.valueOf(KeyInput.nextLine());
    
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
    
     
    System.out.println("-------------");     System.out.printf("프로잭트: %s\n" , no);
     System.out.printf("번호: %s\n" , nou);
     System.out.printf("내용: %s\n" , content);
    System.out.printf("종료일: %s\n" , endDate.toString());
    System.out.printf("상태: %s\n" , state);
     
   
    
    
    
    
    
    
  }
}

package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;
//명령 프롬프트를 출력한다
//명령어를 입력받아 출력한다
//
public class App {

  public static void main(String[] args) {
    Scanner KeyInput = new Scanner(System.in);

    final int LENGTH = 5;
    int[] no = new int[LENGTH];
    String[] name = new String[LENGTH];
    String[] email = new String[LENGTH];
    String[] password = new String[LENGTH];
    String[] photo = new String[LENGTH];
    String[] tel = new String[LENGTH];
    Date[] now = new Date[LENGTH];
    long currentMillis = 0;
    int count = 0;

    // 프로잭트
    final int PLENGTH = 100;
    int[] pno = new int[PLENGTH];
    String[] ptitle = new String[PLENGTH];
    String[] pcontent = new String[PLENGTH];
    Date[] pstartDate = new Date[PLENGTH];
    Date[] pendDate = new Date[PLENGTH];
    String[] powner = new String[PLENGTH];
    String[] pmember = new String[PLENGTH];
    int pcount = 0;


    loop:
    while (true) {
    System.out.print("명령");
   String command = KeyInput.nextLine();

   switch (command.toLowerCase()) {
     case "/member/add":
       System.out.println("회원등록");
       System.out.print("번호: ");
       no[count] = KeyInput.nextInt();
       KeyInput.nextLine();


       System.out.print("프로젝트명: ");
       name[count] = KeyInput.nextLine();

       System.out.print("이메일: ");
       email[count] = KeyInput.nextLine();

       System.out.print("비밀번호: ");
       password[count] = KeyInput.nextLine();

       System.out.print("사진: ");
       photo[count] = KeyInput.nextLine();

       System.out.print("날자: ");
       tel[count] = KeyInput.nextLine();


       break;
     case "/member/list":
       System.out.println("회원목록");
       for (int i = 0; i <count; i++) {
         System.out.printf("%d, %s,%s, %s,%s\n",
         no[pcount], ptitle[pcount] ,pcontent[pcount],pstartDate[pcount],pendDate[pcount],powner[pcount],pmember[pcount]);
         System.out.print("번호: ");
         no[pcount] = KeyInput.nextInt();
            for (int i = 0; i < count; i++) {
              System.out.printf("%d ,%s,%s,%s,%s\n" , no[i], title[i],startDate[i],endDate[i],owner[i]);
            }
         KeyInput.nextLine(); //버리는효과

         System.out.print("프로젝트명: ");
         ptitle[pcount] = KeyInput.nextLine();

         System.out.print("내용: ");
         pcontent[pcount] = KeyInput.nextLine();

         System.out.print("시작일: ");
         pstartDate[pcount] = java.sql.Date.valueOf(KeyInput.nextLine());

         System.out.print("종료일: ");
         pendDate[pcount] = java.sql.Date.valueOf(KeyInput.nextLine());

         System.out.print("만든이: ");
         powner[pcount] = KeyInput.nextLine();

         System.out.print("팀원: ");
         pmember[pcount] = KeyInput.nextLine();

       tcount++;
       break;
       case "/project/list":
         System.out.println("작업 목록");
         for (int i = 0; i < count; i++) {
           String stateTitle;
           switch (state[i]) {
             case "0":
               stateTitle = "신규";
               break;

           }
         }


           System.out.printf("%d ,%s,%s,%s,%s\n" ,
               tno[i], tcontent[i],tstartDate[i],tendDate[i],tatate[i],tworker[i]);

     case "exit":
     case "quit":
       System.out.println("안녕");
       break loop;
       default:
       System.out.println("실행할수 없는 명령입니다");

       }

   }



    }
    KeyInput.close();

   System.out.println("종료");


  }
}

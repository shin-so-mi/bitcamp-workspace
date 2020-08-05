package com.eomcs.pms;




import java.sql.Date;
import java.util.Scanner;

public class App1 {
 static final int LENGTH = 5;
 static int[] no = new int[LENGTH];
 static String[] name = new String[LENGTH];
 static String[] email = new String[LENGTH];
 static String[] password = new String[LENGTH];
 static String[] photo = new String[LENGTH];
 static String[] tel = new String[LENGTH];
 static Date[] now = new Date[LENGTH];
 static long currentMillis = 0;
 static int count = 0;

  // 프로잭트
 static final int PLENGTH = 100;
 static int[] pno = new int[PLENGTH];
 static String[] ptitle = new String[PLENGTH];
 static String[] pcontent = new String[PLENGTH];
 static Date[] pstartDate = new Date[PLENGTH];
 static Date[] pendDate = new Date[PLENGTH];
 static String[] powner = new String[PLENGTH];
 static String[] pmember = new String[PLENGTH];
 static int pcount = 0;

 static Scanner KeyInput = new Scanner(System.in);
  public static void main(String[] args) {


    loop:

    while (true) {

   String command = promptString("명령:");

   switch (command) {
     case "/member/add":
       addMember();
       break;
     case "/member/list":
       listMember();
        break;
     case "/project/add":
       addProject();
       break;
       case "/project/list":
         listProject();
       break;
       case "exit":
       case "quit":
         System.out.println("안녕");
         break loop;
       default:
         System.out.println("실행할수 없는 명령입니다");

           }
    }










    KeyInput.close();
  }



  static void addMember() {
  System.out.println("회원 등록");

    no[count] = promptInt("번호 ");
    name[count] = promptString("이름:");
    email[count] = promptString("이메일:");
    password[count] = promptString("비밀번호:");
    photo[count] = promptString("사진:");
    tel[count] = promptString("전화");

    count++;
  }
  static void listMember() {
    System.out.println("회원목록");
    for (int i = 0; i <count; i++) {
      System.out.printf("%d, %s,%s, %s,%s,%s\n",
      no[count], name[count] ,email[count],password[pcount],photo[pcount],tel[pcount]);
    }
  }

  static void addProject() {
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

  pcount++;
  }
  static void listProject() {
    for (int i = 0; i < pcount; i++) {
    System.out.printf("%d, %s, %s, %s, %s\n", // 출력 형식 지정
        pno[i], ptitle[i], pstartDate[i], pendDate[i], powner[i]);
    }
  }
  static String promptString(String title) {
    return KeyInput.nextLine();
  }
  static int promptInt(String title) {
    return Integer.parseInt(promptString(title));

  }
  }


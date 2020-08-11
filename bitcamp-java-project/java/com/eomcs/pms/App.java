package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

public class App {



  // 회원 데이터



  static class Task {
    int no;
    String content;
    Date deadline;
    String owner;
    int status;


  static final int TLENGTH = 100;
  static Task[] tasks = new Task[TLENGTH];
  static int tsize;

  public static void main(String[] args) {

    loop:
      while (true) {
        String command = Prompt.inputString("명령> ");

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
          case "/task/add":
            addTask();
            break;
          case "/task/list":
            listTask();
            break;
          case "quit":
          case "exit":
            System.out.println("안녕!");
            break loop;
          default:
            System.out.println("실행할 수 없는 명령입니다.");
        }
        System.out.println(); // 이전 명령의 실행을 구분하기 위해 빈 줄 출력
      }


  }





  static void addTask() {
    System.out.println("[작업 등록]");
    Task t  = new Task();
    t.no = promptInt("번호? ");
    t.content = promptString("내용? ");
    t.deadline = promptDate("마감일? ");
    t.status = promptInt ("상태?\n0: 신규\n1: 진행중\n2: 완료\n> ");
    t.owner = promptString("담당자? ");

    tasks[tsize++] = t;
  }

  static void listTask() {
    System.out.println("[작업 목록]");

    for (int i = 0; i < tsize; i++) {
      Task t = tasks[i];

      String stateLabel = null;
      switch (t.status) {
        case 1:
          stateLabel = "진행중";
          break;
        case 2:
          stateLabel = "완료";
          break;
        default:
          stateLabel = "신규";
      }
      // 번호, 작업명, 마감일, 프로젝트, 상태, 담당자
      System.out.printf("%d, %s, %s, %s, %s\n", // 출력 형식 지정
          t.no, t.content, t.deadline, stateLabel, t.owner);

  }
  }

}

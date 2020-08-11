package com.eomcs.pms;

import java.sql.Date;
import com.eomcs.util.Prompt;


public class MemberHandler {
  static class Member {
    int no;
    String name;
    String email;
    String password;
    String photo;
    String tel;
    Date registeredDate;

  }

  static final int LENGTH = 100;
  static Member[] member = new Member[LENGTH];
  static int size;

  static void addMember() {
    Member m = new Member();
    System.out.println("[회원 등록]");

    m.no = Prompt.inputInt("번호? ");
    m.name = Prompt.inputString("이름? ");
    m.email = Prompt.inputString("이메일? ");
    m.password = Prompt.inputString("암호? ");
    m.photo = Prompt.inputString("사진? ");
    m.tel = Prompt.inputString("전화? ");
    m.registeredDate = new java.sql.Date(System.currentTimeMillis());
    member[size++] = m;
  }

  static void listMember() {
    System.out.println("[회원 목록]");
    for (int i = 0; i < size; i++) {
      Member m = member[i];

      System.out.printf("%d, %s, %s, %s, %s\n", // 출력 형식 지정
          m.no, m.name, m.email, m.tel, m.registeredDate);
    }
  }
}

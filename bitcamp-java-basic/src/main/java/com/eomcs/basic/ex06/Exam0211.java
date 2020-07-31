package com.eomcs.basic.ex06;

public class Exam0211 {
public static void main(String[] args) {
// int 정수타입, 문자열 ,특별한 상수 가능하다
persnal member = persnal.ADMIN;
switch (member) {
  case ADMIN:
    System.out.println("조회만 가능합니다");
    break;
  case ONE:
    System.out.println("글작성 가능 합니다");
    break;
  case GUEST:
    System.out.println("다른회원의 글을 변경 삭제 할수 있");




}












}


enum persnal {
  GUEST, ONE, ADMIN
}







}

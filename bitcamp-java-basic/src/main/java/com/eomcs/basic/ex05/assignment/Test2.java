package com.eomcs.basic.ex05.assignment;

import java.util.Scanner;

//# 과제1 :4바이트정수 값을 입력받은후에
//다음과 같이 첫바이트로 부터 끝 바이트까지 16진수로 순서대로 출력해라
//실행
//입력  2864434397
//aa
//bb
//cc

public class Test2 {

  public static void main(String[] args) {
  
 int value = 0xaabbccdd;//10101010_10111011_11001100_11011101.
 int a , b, c, d;
 
 System.out.println(Integer.toHexString(value >> 24 &0xff));
//    11111111_11111111_11111111_10101010 =ffffffaa
 // & 00000000_00000000_00000000_11111111
 //-----------------------------------
 //   00000000 00000000 00000000 10101010 = 000000aa
 
 
 
 

  System.out.println(Integer.toHexString(value >> 16 & 0xff));
  System.out.println(Integer.toHexString(value >> 8 & 0xff));
  System.out.println(Integer.toHexString(value & 0xff));



}
}
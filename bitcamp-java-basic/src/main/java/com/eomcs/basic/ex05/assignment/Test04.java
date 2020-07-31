package com.eomcs.basic.ex05.assignment;

import java.util.Scanner;

//# 과제1 : 다음int 변수에 들어있는 값을
//각 자릿수의 10진수 값을 역순으로 출력하라
//실행
//값  23459876
//6
//7
//8
//9
//5
//4
//3

public class Test04 {

  public static void main(String[] args) {
 int value = 23459876;


//코드를 완성하시오 
 while (value > 0) {
   
   System.out.println(value % 10);
   value = value / 10; // 2345987
 }
           System.out.println(value % 10);
           value = value / 10; // 234598
           System.out.println(value % 10);
           
           System.out.println(value % 10);
           value = value / 10; // 234598
           
           System.out.println(value % 10);
           value = value / 10; // 23459
           
           System.out.println(value % 10);
           value = value / 10; // 2345
           
           System.out.println(value % 10);
           value = value / 10; // 234
           
           System.out.println(value % 10);
           value = value / 10; // 23
           
           System.out.println(value % 10);
           value = value / 10; // 2
          



}
}
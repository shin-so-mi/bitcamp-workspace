package com.eomcs.basic.ex07;

import java.util.ArrayList;

public class Exam0413 {
//stack 과 heap 메모리영역
 public static void main(String[] args) throws Exception {
ArrayList list = new ArrayList();




   while (true) {
   list.add(createArray());

 Thread.currentThread().sleep(2000);
}




 }

 static int[] createArray() {
   System.out.print(".");
 return new int[10_000_000];

 }

















}
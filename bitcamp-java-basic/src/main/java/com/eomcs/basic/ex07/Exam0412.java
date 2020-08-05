package com.eomcs.basic.ex07;

public class Exam0412 {
//stack 과 heap 메모리영역
 public static void main(String[] args) {

 int[] arr;

 arr = m1(5);

for (int i = 0; i < arr.length; i++) {
  System.out.println(arr[i]);
}



 }



 static int[] m1(int size) {
   int[] arr = new int[size]; //메소드 호출이 끝나더라도 사라지지 않는다
  for (int i = 0; i <arr.length; i++) {
    arr[i] =100+i;
  }
   return arr;














 }
}
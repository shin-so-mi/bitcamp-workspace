package com.eomcs.basic.ex07.assignment;
//메인메서드 이외에는 수행후 사라진다
public class test02 {

  static int[] getArray() {
     int[] arr = new int[] {100, 200, 300};
    return arr;

  }
  public static void main(String[] args) {
    int[] arr;
    arr = getArray();
    System.out.println(arr[1]);

  }











}
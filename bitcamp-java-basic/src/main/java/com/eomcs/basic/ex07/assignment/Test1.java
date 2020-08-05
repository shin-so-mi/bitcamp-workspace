package com.eomcs.basic.ex07.assignment;

public class Test1 {
  public static void main(String[]args) {
    int[][] arr = new int[6][6];


    /*
     for (int i = 1; i <= 5; i++) {

      for (int j = 1; j <= 5; j++) {
        arr[i][j] = (i / j) * (j / i);

      }
    }
*/
    for (int i = 0; i < 6; i++) {
      arr[i][i] = 1;
    }













    System.out.println("==============================");


    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= 5; j++) {
        System.out.printf("%d" , arr[i][j]);
      }
      System.out.println();
    }




  }




}

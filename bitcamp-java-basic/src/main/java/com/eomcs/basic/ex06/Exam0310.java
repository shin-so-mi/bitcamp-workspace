package com.eomcs.basic.ex06;
//반복문 while
public class Exam0310 {
public static void main(String[] args) {

  //While의 조건문장에서 조건이 참인 경우 문장을 계속 실행한다
int count, sum;



   count = 0;
   sum = 0;

while (count < 100) {
 count++;
 if (count > 50)
   continue;
 sum += count;

}

System.out.printf("%d, %d\n" , count, sum);








}
}
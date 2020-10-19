package com.eomcs.concurrent.ex07;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exam0320 {
static class MyRunnable implements Runnable {
  int millisec;

  public MyRunnable(int millesec) {
    this.millisec = millisec;
  }
 @Override
public void run() {
   try {
     System.out.printf("%s 스레드 실행중..\n",
         Thread.currentThread().getName());

      Thread.sleep(millisec);
      System.out.printf("%s 스레드 종..\n",
          Thread.currentThread().getName());
   } catch (Exception e) {
     System.out.printf("%s 스레드 실행중 오류발생\n",
         Thread.currentThread().getName());
   }
 }
}
public static void main(String[] args) {
  ExecutorService executorService = Executors.newFixedThreadPool(3);

  executorService.execute(new MyRunnable(6000));

  System.out.println("main() 종료");

}
}

//스레드풀은 execute() 를 호출한 순서대로 작업큐에 작업을 보관한다
//






























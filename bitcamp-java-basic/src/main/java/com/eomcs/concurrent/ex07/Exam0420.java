package com.eomcs.concurrent.ex07;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exam0420 {
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
  executorService.execute(new MyRunnable(3000));
  executorService.execute(new MyRunnable(9000));
  executorService.execute(new MyRunnable(2000));
  executorService.execute(new MyRunnable(4000));


  executorService.shutdown();
  executorService.execute(new MyRunnable(4000));
  System.out.println("main() 종료");

}
}



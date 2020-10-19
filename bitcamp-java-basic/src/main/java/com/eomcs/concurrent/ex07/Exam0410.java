package com.eomcs.concurrent.ex07;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exam0410 {
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
  executorService.execute(new MyRunnable(2000));
  executorService.execute(new MyRunnable(4000));
  executorService.execute(new MyRunnable(5000));



  List<Runnable> tasks = executorService.shutdownNow();
  for(Runnable task : tasks) {
    System.out.println(((MyRunnable)task).millisec);
  }


  executorService.execute(new MyRunnable(4000));
  System.out.println("main() 종료");

}
}

//shutdown은 진행중인 작업을 완료하고


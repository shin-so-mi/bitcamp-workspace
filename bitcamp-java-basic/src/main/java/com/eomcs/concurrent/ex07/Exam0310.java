package com.eomcs.concurrent.ex07;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Exam0310 {

  static class MyRunnable implements Runnable {
    int millisec;

    public MyRunnable(int millisec) {
      this.millisec = millisec;
    }

    @Override
    public void run() {
      try {
        System.out.printf("%s 스레드 실행 중...\n",
            Thread.currentThread().getName());

        Thread.sleep(millisec);

        System.out.printf("%s 스레드 종료!\n",
            Thread.currentThread().getName());
      } catch (Exception e) {
        System.out.printf("%s 스레드 실행 중 오류 발생!\n", Thread.currentThread().getName());
      }
    }
  }
  public static void main(String[] args) throws Exception {
    ExecutorService executorService = Executors.newFixedThreadPool(3);

    // execute()와 같다.
    // => 단 작업의 종료 상태를 확인할 수 있는 Future 객체를 리턴한다.
    //
    Future<?> future1 = executorService.submit(new MyRunnable(2000));
    Future<?> future2 = executorService.submit(new MyRunnable(4000));
    // ?는 객체가 어떤타입이던 상관이 없다

    // Future.get()
    // => 요청한 작업이 완료될 때 까지 기다린다.(peding)
    // => 요청한 작업이 완료되면 null을 리턴한다.
    //
    if (future2.get() == null)
      System.out.println("두 번째 작업이 끝났음");

    if (future1.get() == null)
      System.out.println("첫 번째 작업이 끝났음");

    System.out.println("main() 종료!");
  }
}



























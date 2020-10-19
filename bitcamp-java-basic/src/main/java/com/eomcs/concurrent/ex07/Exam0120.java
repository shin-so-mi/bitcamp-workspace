package com.eomcs.concurrent.ex07;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exam0120 {
public static void main(String[] args) {
  ExecutorService executorService = Executors.newFixedThreadPool(3);
  executorService.execute(() -> System.out.printf("%s 스레드 실행",
      Thread.currentThread().getName()));


  executorService.shutdown();
  System.out.println("main종료");
}
}
//스레드풀에 있는 모든 스레드들이 요청한 작업을 끝내면
//종료하도록 지시한다
//모든 스레드가 종료될때 까지 기다리지 않고 바로 리턴한다
//셧다운 호출 이후에는 새작업 요청은 받지 않는다
//즉 execute( 호출하면 예어ㅣ가 발생한ㅁ다)
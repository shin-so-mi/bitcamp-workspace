package com.eomcs.net.ex04.test;

import java.net.ServerSocket;
import java.net.Socket;
import com.eomcs.io.ex05.DataInputStream;

public class CalcServer {
public static void main(String [] args) {
  System.out.println("서버 실행중,,,");

  ServerSocket ss = new ServerSocket(8888);

  while (true) {
    Socket socket =ss.accept();
  try {
    processRequest(socket);
  } catch (Exception e) {
    System.out.println("클라이언트 요청 처리중 오류 발");
    System.out.println("클라이언트 요청을 처리 합니");

  }
  }

}

static void processRequest(Socket socket) throws Exception {
  try (Socket soket2 = socket;
      DataInputStream in = new DataInputstream(socket.getInputstream());
      printstream out = new  printstream(soket.getoutputstream());) {

    loop: while (true) {
      int a = in.readInt();
      String op = in.readUTF();
      int b = in.readInt();
      int result = 0;


      switch (op) {
        case "+":
        result = a + b;

      }
    }
  }
}
}

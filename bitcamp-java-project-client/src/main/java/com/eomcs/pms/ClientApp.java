
package com.eomcs.pms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import com.eomcs.util.Prompt;

//stateful
// ->  서버와 연결하여 간단한 메세지 주고받기
public class ClientApp {
    public static void main(String[] args) {
     if (args.length != 2) {
       System.out.println("프로그램 사용");
       System.out.println(" java - cp ... clientApp 서버주소 포트번호");
       System.exit(0);
     }
     //클라이언트가 서버에 스탑 명력을 보내면 다음변수를  true로 변경한다
     boolean stop = false;
      try (Socket socket = new Socket(args[0],Integer.parseInt(args[1]));
          PrintStream out = new PrintStream(socket.getOutputStream());
          BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {



        while (true) {
        String input = Prompt.inputString("명령> ");
        out.println(input);
        out.flush();

        receiveResponse(in);


        if (input.equalsIgnoreCase("quit")) {
          break;
        } else if (input.equalsIgnoreCase("stop")) {
        break;
        }
        }

      } catch (Exception e) {
        e.printStackTrace();
      }

      if (stop) {
        ///서버를 멈추기 위해 그냥 접속했다가 끊는다
        try (Socket socket = new Socket(args[0], Integer.parseInt(args)[1])) {

        }
      }
}
    private static void receiveResponse(BufferedReader in) throws Exception {
      while (true) {
        String response = in.readLine();
        if (response.length() == 0)
          break;
        System.out.println(response);
      }
}
//반복해서 클라이언트의 요청을 처리한다
//
}






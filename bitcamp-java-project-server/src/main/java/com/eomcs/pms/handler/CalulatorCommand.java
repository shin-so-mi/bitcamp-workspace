package com.eomcs.pms.handler;

import java.io.BufferedReader;
import java.io.PrintWriter;
import com.eomcs.pms.domain.Board;
import com.eomcs.util.Prompt;

// Command 규칙에 따라 클래스를 정의한다.
public class CalulatorCommand implements Command {



  @Override
  public void execute(PrintWriter out, BufferedReader in) {
    try {
      out.println("[계산기]");

      Board board = new Board();
      int input =Prompt.inputInt("계산식(예: 5 * 3)", out, in);
      String[] arr = input.split("");
      if (arr.length != 3) {
        out.println("계산식이 옳지 않습니다");
        out.println("계산식 예 : 15 * 45");
        return;
      }

      int a = Integer.parseInt(arr[0]);
      String op = arr[1];
      int b = Integer.parseInt(arr[2]);
      int result = 0;

      switch(op) {
        case "+": result = a + b; break;
        case "-": result = a - b; break;
        case "/": result = a / b; break;
        case "*": result = a * b; break;

        default:

        out.println("계산식이 옳지 않습니다");
        return;

      }


      out.println("게시글을 등록하였습니다.");

    } catch(Exception e) {
      out.printf("작업 처리 중 오류 발생! - %s\n", e.getMessage());
    }
  }
}

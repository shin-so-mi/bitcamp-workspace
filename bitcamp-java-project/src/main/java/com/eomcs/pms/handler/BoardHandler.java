package com.eomcs.pms.handler;

import java.sql.Date;
import com.eomcs.util.Prompt;
import com.eomcs.pms.handler.BoardList.Board;
public class BoardHandler {
  // 회원 데이터


  BoardList boardList =


  // 다른 패키지에서 이 메서드를 사용할 수 있도록 public 으로 사용 범위를 공개한다.
  public  void add() {
    System.out.println("[회원 등록]");

    BoardBoard board = new Board Board();
    board.no = Prompt.inputInt("번호? ");
    board.title = Prompt.inputString("제목? ");
    board.registeredDate = new java.sql.Date(System.currentTimeMillis());
    board.writer = Prompt.inputString("작성자? ");
    board.viewCount = 0;
   list
  }


  public  void list() {
    System.out.println("[회원 목록]");
 BoardList
    for (Board board : boards) {

      System.out.printf("%d, %s, %s, %s, %s\n",
          board.no,
          board.title,
          board.writer,
          board.viewCount,
          board.registeredDate);
    }
  }
}

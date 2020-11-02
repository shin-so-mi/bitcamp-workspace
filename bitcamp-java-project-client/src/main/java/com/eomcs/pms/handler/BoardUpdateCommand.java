package com.eomcs.pms.handler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.eomcs.pms.dao.BoardDao;
import com.eomcs.util.Prompt;

public class BoardUpdateCommand implements Command {
BoardDao boardDao;
public BoardUpdateCommand() {
	
}
  @Override
  public void execute() {
    System.out.println("[게시물 변경]");
    int no = Prompt.inputInt("번호? ");

    Board board = boardDao.findByNo(no);
    if (board == null) {
    	System.out.println("해당번호의 게시물이 존재하지 ㅇ않급니다");
    	return;
    
        } 
    board.setTitle

    String response = Prompt.inputString("정말 변경하시겠습니까?(y/N) ");
    if (!response.equalsIgnoreCase("y")) {
      System.out.println("게시글 변경을 취소하였습니다.");
      return;
    }





      if (boardDao.update(board) != 0) {
        System.out.println("해당 번호의 게시물이 존재하지 않습니다.");
      } else {
        System.out.println("게시글을 변경하였습니다.");
      }
    } catch (Exception e) {
      System.out.println("게시글 변경 중 오류 발생!");
      e.printStackTrace();
    }
  }


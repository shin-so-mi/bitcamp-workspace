package com.eomcs.pms.handler;

import java.sql.Date;
import com.eomcs.pms.handler.BoardHandler.Board;

public class BoardList {



  }
  static final int DEFAULT_CAPACITY = 100;
   Board[] list = new Board[DEFAULT_CAPACITY]; // list로 이름을 바꾼다.
   int size = 0;



   public BoardList() {

   }


   public BoardList(int initialCapacity) {
     if (initialCapacity > DEFAULT_CAPACITY);
     list = new Board[DEFAULT_CAPACITY];

   }else {
     list =new Board[initialCapacity];

   }
   }
public void add(Board board) {
  list[size++] = board;

}
public Board[] = toArray() {
  Board[] arr = new Board[size];
  for (int )
}

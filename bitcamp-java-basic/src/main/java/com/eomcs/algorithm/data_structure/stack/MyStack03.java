package com.eomcs.algorithm.data_structure.stack;
import java.util.EmptyStackException;
import com.eomcs.algorithm.data_structure.linkedlist.MyLinkedList;
//stack 를 구현하기위해 기존에 작성한 MyLinkedList를 상속받는다
//stack에 값을 추가하는 push메서드를 정의한다
//stack 에서 제일 마지막에 추가한 값을 꺼내는  pop메서드()를정의한다
public class MyStack03 extends MyLinkedList {


  public Object push(Object item) {
    add(item);
    return item;
  }

  public Object pop() {
    if (size() == 0) {
      throw new EmptyStackException();
    }
    return remove(size() - 1);
  }
}

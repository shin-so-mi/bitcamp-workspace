package com.eomcs.somi;
//1 값을 담을 노드 클래스를 설계한다
public class LinkedList {

  // 첫 번째 노드와 마지막 노드의 주소를 담을 필드를 추가한다
  // 목록 크기를 저장할 필드를추가한다
  // 목록의 값을 추가하는 add() 메서드를 정의한다
  // 목록에서 값을 조회하는 get() 메서드를 정의한다
  // 목록에서 특정 인덱스 위치에 값을삽입하는 add(int ,Object) 메서드를 정의한다
  //    Node의 생성자를 추가한다.
  // 목록에서 특정 인덱스의 갑을 제거하는 remove 메서드를 정의함다

  Node first;

  Node last;

  int size;

  static class Node {
    //용도
  //node 클래스는 목록에서  각항목의 값을 보관하는 객체로 역할을 수행한다
    //static클래스 ?
    // 여러개의 MyLinkedList 객체가 공유하는 클래스 이므로
    // static으로 node 클래스를설계한다

    Object value;
    Node next;

  }
 public boolean add(Object e) {
   Node node = new Node();
   node.value = e;

   if (first ==null) {
     first = node;

   }else {
     last.next = node;
   }
   last = node;

   size++;
     return true;

   }
    public Object get(int index) {
      if (index < 0 || index >= this.size) {
        throw new IndexOutOfBoundsException("인덱스가 유효 하지 않습니당");

      }
      Node cursor = this.first;
      for (int i = 1; i <= index; i++) {
        cursor = cursor.next;
      }
      return cursor.value;

      }
    public void add (int index, Object element) {
      if (index < 0 || index > this.size) {
        throw new IndexOutOfBoundsException("인덱스가 유효하지 않습 닏");

      }
      Node node = new Node(element);
      size++;

      if (index == 0) {
        node.next =  first;
        first = node;
        return;

      }
      Node cursor = this.first;
      for (int i = 1; i <= index -1; i++) {
        cursor = cursor.next;
      }
          node.next = cursor.next;
          cursor.next = node;
           if (node.next == null) {
             last = node;

           }

    }

    public Object remove(int index) {
      if (index < 0 || index >= this.size) {
        throw new IndexOutOfBoundsException("인덱스가 유효 하지 않습니다");

      }
      size--;

      if (index == 0) {
        Node old = first;
        first = old.next;
        old.next = null;
        return old.value;

      }
    }
}




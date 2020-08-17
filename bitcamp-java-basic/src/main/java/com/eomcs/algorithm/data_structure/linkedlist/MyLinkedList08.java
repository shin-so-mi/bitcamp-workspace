package com.eomcs.algorithm.data_structure.linkedlist;

// 1) LinkedList 클래스 정의
// 2) 값을 담을 노드 클래스를 설계한다.
// 3) 첫 번째 노드와 마지막 노드의 주소를 담을 필드를 추가한다.
//    목록 크기를 저장할 필드를 추가한다.
// 4) 목록에 값을 추가하는 add() 메서드를 정의한다.
// 5) 목록에서 값을 조회하는 get() 메서드를 정의한다.
// 6) 목록에서 특정 인덱스 위치에 값을 삽입하는 add(int, Object) 메서드를 정의한다.
//    - Node의 생성자를 추가한다.
// 7) 목록에서 특정 인덱스의 값을 제거하는 remove메서드를 정의한다
// 8) 목록에서 특정 인덱스의 값을 바꾸는 set(int,Object) 메서드를 정의한다.
public class MyLinkedList08 {

  // 값을 찾을 때는 첫 번째 노드부터 따라간다.
  Node first;

  // 값을 추가할 때는 마지막 노드에 연결한다.
  Node last;

  // 목록 크기를 보관한다.
  int size = 0;

  // 용도?
  // - Node 클래스는 목록에서 각 항목의 값을 보관하는 객체로 역할을 수행한다.
  // 스태틱 클래스?
  // - 여러 개의 MyLinkedList 객체가 공유하는 클래스이므로
  //   스태틱으로 Node 클래스를 설계한다.
  static class Node {
    Object value;
    Node next;

    public Node() {}

    public Node(Object value) {
      this.value = value;

      //node 클래스를 선언한다
    }
  }

  public boolean add(Object e) {  //새로노드를 만드는것
    Node node = new Node();
    node.value = e;

    if (first == null) {    // 첫번째 에 node값을 넣고 값이 있는경우에(else) 다음으로넘어간다
      first = node;
    } else {
      last.next = node;
    }
    last = node;

    size++;

    return true;
  }

  public Object get(int index) {
    if (index < 0 || index >= this.size) {
      throw new IndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }

    Node cursor = this.first;
    for (int i = 1; i <= index; i++) {
      cursor = cursor.next;
    }
    return cursor.value;
  }

  public void add(int index, Object element) {
    if (index < 0 || index > this.size) {
      throw new IndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }

    Node node = new Node(element);

    size++;

    if (index == 0) {
      node.next = first;
      first = node;
      return;
    }

    Node cursor = this.first;
    for (int i = 1; i <= index - 1; i++) {
      cursor = cursor.next;
    }

    node.next = cursor.next;  //커서는 바로전 을 가르킨다 next 값은 node를 넣어라

    cursor.next = node;


    if (node.next == null) {
      last = node;


    }
  }
  public Object remove(int index) {
    if (index < 0 || index > this.size) {
      throw new IndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }

    size--;

    if (index == 0) {
      Node old = first;
      first = old.next;
      old.next = null; //가비지가 다른 인스턴스를 가리키지 않게 한다.

      return old;
    }
    Node cursor = this.first;
    for (int i = 1; i <= index - 1; i++) {  //전꺼찿기
      cursor = cursor.next;
    }
    Node old = cursor.next; //현재커서의 Next 가

    cursor.next = old.next; //현재커서가다음을 찿고 또다음으로감
    old.next = null;


   if (cursor.next == null) {
     last = cursor;
   }

    return old.value;

}
  public Object get(int index, int element) {
    if (index < 0 || index >= this.size) {
      throw new IndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
    }

    Node cursor = this.first;
    for (int i = 1; i <= index; i++) {
      cursor = cursor.next;
    }
    Object old = cursor.value;
    cursor.value = element;
    return cursor.value;
  }
}




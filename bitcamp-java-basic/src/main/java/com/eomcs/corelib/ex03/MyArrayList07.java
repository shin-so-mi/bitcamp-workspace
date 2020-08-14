package com.eomcs.corelib.ex03;
//test1
//인스턴스/객체(의 주소)를 담을 레퍼런스배열을 준비한다
//인스턴스를 추가하는 add()메서드 정의
//특정 인덱스의 인스턴스를 리턴하는 get() 메서드를 정의
//인스턴스를 특정위치에 삽입하는 add(int ,Object) 메서드를추가한다
//특정위치의 항목을다른 인스턴스로 교체하는 set(int object)메서드를 정의한다
//특정위치의 항목을 제거하는 리무브 메서드를 정의한다
//test2
//Add()할때 배열의 크기를 넘는경우, 배열의크기를 늘린다.

public class MyArrayList07 {
//1,쥬소를담을 배열을 준비한다
 static Object[] elementData = new Object[5];
 static int size;

  static public boolean add(Object e) {
    if (size == elementData.length) {
      grow();
    }
    elementData[size++] = e;
return true;


  }
static private void grow() {
  System.out.println("오호라 배열을 늘리자");
  Object[] newArray = new Object[elementData.length + elementData.length >> 1];
  for (int i = 0; i < elementData.length; i++) {
    newArray[i] = elementData[i];
  }
  elementData = newArray;
}

  static public void add(int index,Object element ) {
    for (int i = size; i > index; i--) {
      elementData[i] = elementData[i-1];

    }
    elementData[index] = element;
    size++;
  }



  static public Object get(int index) {
    return elementData[index];
  }

  static public Object set(int index,Object element) {
    Object old = elementData[index];
    elementData[index] = element;
    return old;

  }

static public Object remove(int index) {
  Object old = elementData[index];
    for (int i = index; i < size - 1; i++) {
      elementData[i] = elementData[i +1];

    }
    size--;
  return old;
}










}

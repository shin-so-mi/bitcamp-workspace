package com.eomcs.corelib.ex03;
//인스턴스/객체(의 주소)를 담을 레퍼런스배열을 준비한다
//인스턴스를 추가하는 add()메서드 정의
//특정 인덱스의 인스턴스를 리턴하는 get() 메서드를 정의

public class MyArrayList03 {
//1,쥬소를담을 배열을 준비한다
 static Object[] elementData = new Object[5];
 static int size;

  static public boolean add(Object e) {
    elementData[size++] = e;
return true;


  }





  static public Object get(int index) {
    return elementData[index];
  }
}
package com.eomcs.corelib.ex03;

import java.util.Arrays;

//test1
//인스턴스/객체(의 주소)를 담을 레퍼런스배열을 준비한다
//인스턴스를 추가하는 add()메서드 정의
//특정 인덱스의 인스턴스를 리턴하는 get() 메서드를 정의
//인스턴스를 특정위치에 삽입하는 add(int ,Object) 메서드를추가한다
//특정위치의 항목을다른 인스턴스로 교체하는 set(int object)메서드를 정의한다
//특정위치의 항목을 제거하는 리무브 메서드를 정의한다
//test2
//Add()할때 배열의 크기를 넘는경우, 배열의크기를 늘린다.
//add로 임의의 위치에 삽입할떄 배열의 크기가 적으면 늘린다
//get을 호출할때 인덱스의 유효 여부를 검사한다
//유효하지 않는 인덱스는 예외를 발생시칸다
//9)get(int) 으로 유효하지않은 인덱스의 값을 꺼낼때 예외를발생시칸다
//10 리무브를 수행한다음에 맨끝에 남아잇는 주소를 null로 설정하여
//인스턴스의 레퍼런스 카운트를 한개줄인다 0이되먄 가비지
//Set을 호출할떄 인덱스가 유혀하지 않으면 예외를 발생시킨다
//test3
//여러개의 목록을 동시에 관리할수 있도록
//myarrayList 에 선언된 레퍼런스 배열을 스테틱 대신 인스턴ㅁ스로 전환한댜ㅏ
//개별적으로관리해야할 데이터는 인스턴스변수를 사용해야한다
//14 ArrayList 인스턴스를 생성할떄 배열의 초기 크기를 설정할수 있도록 생성자를 추가한다
//15  ArrayList 인스턴스를 생성할떄 초기크기를 지정하지않고 생성할수 있도록
//16 배열크기를 지정할떄 기본크기보다 큰 값이 되도록 생성자를 변경한다
//17 배열의 기본크기를 직접 숫자로 지정하지않고 상수를 사용하여 ㅈㅣ정한다
//18배열의 크기를 늘릴때 자바에서 제공하는 Arrays를  사용하여 처리한다
public class MyArrayList18 {
//1,쥬소를담을 배열을 준비한다
private static final int DEFAULT_CAPACITY =5;
 private Object[] elementData;
 int size;

 public MyArrayList18() {
   elementData = new Object[DEFAULT_CAPACITY];
 }
 public MyArrayList18(int initialCapacity) {
   if (initialCapacity < DEFAULT_CAPACITY) {
     elementData = new Object[DEFAULT_CAPACITY];

   }else {


   elementData = new Object[initialCapacity];
   }
 }
   public boolean add(Object e) {
    if (size == elementData.length) {
      grow();
    }
    elementData[size++] = e;
return true;


  }
 private void grow() {
  System.out.println("오호라 배열을 늘리자");
  int newCapacity= elementData.length + (elementData.length >> 1);
 elementData = Arrays.copyOf(elementData, newCapacity);
 /*
  Object[] newArray = new Object[elementData.length + (elementData.length >> 1)];
  for (int i = 0; i < elementData.length; i++) {
    newArray[i] = elementData[i];
  }
  elementData = newArray; */
}

   public void add(int index,Object element ) {
    if (size == elementData.length) {
      grow();
    }
    if (index < 0 || index > size) {
      throw new ArrayIndexOutOfBoundsException("인덱스가 유효하지않습니다");
    }



    for (int i = size; i > index; i--) {
      elementData[i] = elementData[i-1];

    }
    elementData[index] = element;
    size++;
  }



   public Object get(int index) {
    if (index < 0 || index >=size) {
      throw new ArrayIndexOutOfBoundsException("인덱스가 유효하지않습니다");
    }
    return elementData[index];
  }

   public Object set(int index,Object element) {
    if (index < 0 || index >=size) {
      throw new ArrayIndexOutOfBoundsException("인덱스가 유효하지않습니다");
    }

    Object old = elementData[index];
    elementData[index] = element;
    return old;

  }
 public Object remove(int index) {
  Object old = elementData[index];

    for (int i = index; i < size - 1; i++) {
      elementData[i] = elementData[i +1];

    }
    size--;
    elementData[size] = null;
    //쓰지않는 주소를 제거하여
    //가비지가 될수있게한다
  return old;

}

}














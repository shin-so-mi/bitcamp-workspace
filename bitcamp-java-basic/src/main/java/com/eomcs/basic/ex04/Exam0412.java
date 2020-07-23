//변수에 값 할당
//변수가 가리키는 메모리값을 저장하는 것
//문법
//변수명 = 변수,리터럴
//용어
//= 할당 연산자 ( assigment operator)
//l-value =왼쪽에 있는 변수를 가리킨다
//r-value = 오른쪾에 있는 변수나 리터럴을 가르킨다
//의미
// 오른쪽에 지정된 값을 변수가 가리키는 메모리에 저장

package com.eomcs.basic.ex04;



public class Exam0412 {
  public static void main(String[] args) {
 
   //4바이트 정수 리터럴 ==> byte,short 변수
   // 4바이트 리터럴인경우 메모리크기에 상관없이 저장할수 있다면
    //byte short 메모리에 값을 저장해도 컴파일 오류가 나지 않는다
    byte b;
    short s;
    
    //8바이트 정수 리터럴 
    // 8바이트 리터럴인경우 값이 크고 작음에 상관없이
    //바이트, 쇼트, 인트 메모리에 값을 저장하면 오류가 뜬다(8바이트보다 작은 메모리라서)
     
  }
  
}

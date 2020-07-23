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

//변수에 값 변경

public class Exam0170 {
  public static void main(String[] args) {
    int age;
    
    age = 20;
    
    //할당 연산자를 이용하면 언제든 해당 메모리에 다른 값을 저장할수 있다
    age = 30;
  }
  
}

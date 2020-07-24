package com.eomcs.basic.ex04;
 //문자변수
public class Exam0431 {
public static void main(String[] args) {
    
    //문자
  char c;
   c = 0;
   c =65535;
   
   //char(2byte) 크기의 메모리 범위를 초과하면 뭄법 오류이다
   //c = -1;
   //c = 65536; (초과했기떄문에)
   

    
      int a = 0x23;
      for (int i = 1; i < 5; i++) {
        
        System.out.println(a + i);
    }
    
  }
  
  
}


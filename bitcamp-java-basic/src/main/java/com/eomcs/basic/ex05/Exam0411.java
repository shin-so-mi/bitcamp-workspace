package com.eomcs.basic.ex05;


    
  public class Exam0411 {
    public static void main(String[] args) {
      
      int i = 0x27a130ff;
      int a, b, c, d;
      System.out.println(Integer.toHexString(i));
      
     // 00100111_10100001_00110000_11111111 => 27a130ff
       
        a = i >> 24;
        
        System.out.println(Integer.toHexString(a));
      // 앞쪽 숫자 27만 나온다 맨앞에 00100111만 출력하려면
      // 뒤에 24칸을 가야 저부분만 남는다
        
        b = (i >> 16) & 
      
      System.out.println(Integer.toHexString(b));
     
      
      
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
  }





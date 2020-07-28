        
        package com.eomcs.basic.ex04;
        
        public class Exam0810 { //클래스 선언 
        
        //클래스 블록 => 클래스 정의
           
        static int x;
        
        
        
        public static void main(String[] args) { //메서드 선언
         //메서드 블록 = 메서드정의 
        
        
        
        int a;
        int x; //같은블럭에 소속된 로컬변수가 아니라면 같은이름으로 변수를 선언 할 수 있다
        
        
        //int a; 
        // 같은 블록에 이름이 같은 변수를 중복 선언 할수 없다
        {//로컬블록
          //int a; //바깥블록에 선언된 변수와 같은 이름으로 변수 선언 안ㄷ굄
          int b;
        }
        {  //int b; 같은이름 안됨
          int c;
          int d;
        }
          
          
          
          
          
          
          int i;
          for (i = 0; i < 10; i++) {
            System.out.println(i);
          }
          System.out.println(i);
        
          
        
          for (int k = 0; k < 10; k++) {
            System.out.println(k);
          }
          //접근 불가  System.out.println(k);
        
          
          
        int age = 20; 
        int m = 0;
        if (age > 19) {
          m = 200;
          int n = 300;
        }
          System.out.println(m);
          //System.out.println(n); 문법 오류
          
          
          
        }
        
        } 
  
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

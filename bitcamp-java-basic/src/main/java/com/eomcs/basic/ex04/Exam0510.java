      package com.eomcs.basic.ex04;
      
      public class Exam0510 {
      public static void main(String[] args) {
       int[] p = new int[3]; //c 언어 : malloc (sizeof(int) * 3)
      //p 
       // int  배열의 주소를 담는 변수이다
       //보통 레퍼런스라거 부른다
       //new int[3]
       //int변수를 연속해서 3개 획보한다
       
       //배열의 개수 알아내기
       System.out.println(p.length);
       
       //배열의 주소가 없느 상태에서 사용하지 말라
       //int[] x;
       //System.out.println(x.length);
       //배열의 값저장
       p[0] = 100;
       p[1] = 200;
       p[2] = 300;
       System.out.printf("%d, %d, %d\n", p[0], p[1], p[2]);
       //p[3] = 400;실행 예외
       //p[-1] = 500; (runtime exception)
       
       int sum = 0;
       for (int i = 0; i < p.length; i++) {
         sum = sum + p[i];
         
       }
       System.out.println(sum);
       //배열 레퍼런스르 선언하는방법
       int[] p2;//자바에 주로 사용하는방식
       int p3[];//c언어방식도 사용가능
        
       p2 = p; // p레퍼런스에 저장된 주소를p2레퍼런스에 저장한다
       
       p2[1] = 1000;
       System.out.println(p[1]);
       
       p = new int[4];
       p[1] = 2000;
       System.out.printf("%d, %d\n", p[1], p2[1]);
       
       
       //new명령어로 확보한 메모리는 인스턴스라 한다
       //인슽턴스의 주소를 저장하는 변수를 레퍼런스라한다
       
       //자바는 primitive type 을 제외한 모든변수는 레퍼런스이다
       byte b;
       int i;
       char c;
       float f;  
       
       //레퍼런스변수의 주소값을 0으로 초기화 하기
       //p2 = 0; 이렇게 직접적으로 초기화 안됨
      p2 = null; //주소변수(레퍼런스)를 0으로 포기화 시키려면 null을 사용한다(주소를 0으로 초기화함)
        
       
        //System.out.println(p2[0]);//null pointer Exception >run time
       
       int k1;
      //System.out.println(k1); //변수를 초기화 시키짚 않고 사용하면 컴파일 오류\
      int[] k2 = new int[3];
      
      //new명령으로 메모리를 준비할때 
      //모든메모리는 0으로 자동 초기화된다
      
      System.out.println(k2[0]);
      System.out.println(k2[1]);
      System.out.println(k2[2]);
       
       
       // 배열 생성후 즉시 초기화 하기
       int[] k3 = new int[] {100, 200, 300};
       //{}안에 값을 넣을수 있는 int 배열을 3개 만든후 그 배열의 값을넣는다\
       //배열의 개수를 지정해서는 안된다
       
       int[] k4;
       k4 = new int[] {10, 20};
       
       int[] k5 = {11, 12, 13};//new int[] {1, 2, 3};
       int[] k6;
      
       
       //k6 = {111, 222, 333}; //변수선언 없이 할때  생략 불가
      
        
       int[] x1 = new int[3];
       int[] x2 = new int[4];
       int[] x3 = x1;
       x2 = x1;//x2가 가리켯던 int[4] 배열 메모리의 주소를 잃어버려 더이상 사용 할수 없다
               //이렇게 주소르 잃어버려 사용할수 없다 이러한 메모리를 가비지라한다
             //언제 가비지를 메모리에서 해제시킬지 모른다
       //(인스턴스를 가르키는레퍼런스가 없어짐 메모리 사용 불가 확보만함)>쓰레기통
       //dangling pointer 라부른다
       
       //garbage collector 
       //쓰레기를 찿아 해제시킨다
       //1.메모리부족
       //2. cpu한가할때
       //system.gc(); 가능하다면 빠른시일내에 가비지를 수집해줄것을 요구
       //gc()를호출한다해서 바로가비지 컬렉터가 동작하는것은 아니다.
       //그요구를 수용할지 여부는 jvm의 판단에 달려있다
       //따라서 호출한다고 바로 실행된다고 생각 하지 아놓는다
       
     
 
      }
      }
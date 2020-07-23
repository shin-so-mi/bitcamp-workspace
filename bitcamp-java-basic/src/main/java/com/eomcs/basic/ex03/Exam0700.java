
    
    package com.eomcs.basic.ex03;
    //이스케이프 문자 =문자제어코드
    //화면에 출력하는 문자가 아니라 문자 출력을 제어하는 문자이다
    //제어 문자

    //  \n -Line Feed(LF), 0x0a
    //  \r -carrage REturn(CR), 0x0d
    //  \f -form feed , 0x0c
    //  \t -Tap,0x09
    //  \b -Backapace, 0x08
    //  \' - single quote, 0x27
    //  \" - Double quote,0x22
    //  \\ -Backslash, 0x5c



    public class Exam0700 {
      public static void main(String[] args) {
        System.out.println("Hello,world");
        System.out.println("Hello,\nworld");  //줄바꿈 문자
        System.out.println("Hello,\rworld");  //커서를 처음으로 돌리는 문자
           //커서란 문자를 출력할때 위치를 가리키는 것


        
        System.out.println("Hello,\b/b/bworld"); //커서를 뒤로 한칸 이동하는 문자
        System.out.println("Hello,\tworld");     //탭공간을 추가시키는 문자
        System.out.println("Hello,\"w\"orld");   //문자를 출력시키는 문자
        System.out.println("Hello,'w'orld");     



      }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  }
}

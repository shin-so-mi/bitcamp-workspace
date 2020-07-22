//Ex0340.java
//주제 :  부동소수점의 정규화 = 2진수로 바꾸기

//부동소숫점의 정규화 = 2진수로 바꾸기

package com.eomcs.basic.ex03;



class Exam0410 {
    public static void main(String[] args) {
      //자바는 문자를 메모리에 저장할때 unicode규칙에 따라
      //2바이트로 저장한다
      
      System.out.println('A'); //0x0041
      System.out.println('가');
      System.out.println('\u0041');//유니코드 값을 직접 지정
      
      System.out.println('\u4eba');
      // 그냥 
      System.out.println(0x41); 
}
}
    //문자를 메모리로 저장하려면
    //2진수로 바꿀수 있어야 한다
    //문자를 2진수로 바꾸는 규칙을 문자집합이라고 한다
    //ASKII
    //영어 대소문자 숫자 특수문자등
    // 'A' => 100_0001 = 0x41
    // 'B' => 100_0010 = 0x42
    
    // 한글은 정의 되어 있지 않다
    // - ISO-8859 -1 8비트 
    //   ASKII 문자 +유럽문자
    //- EUC-KR(16비트)
    //한글 2350자에 대한규칙
    //'가' =>10110000_10100001 = 0xb0a1
    // 현재 통용되는 한글음절 11172자를  모두 표기할수 없다
    
    // unicode(16비트)
    //영어 한글 모두 2바이트로 표현
    //모든 국가의 문자르 담고 있다
    //- 'a' =>0x0041
    //- 'b' =>0x0042
    //- '1' =>0x0031
    //영어를 2바이트로 표현하기떄문에 비효율적이다
    //한글은 새로 정의 했기 때문에 euc-k
    //-utf -8(8비트~16비트 niversal Coded Character Set + Transformation Format 
    //UNICODE를 문자에따라 1~4바이트로 변환한 규칙이다
    //ISO-8859-1(영어 숫자 특수문자) :1바이트로 표현한다
    //-'A' = 0x42
    //'b' =0x43
    //'1'= 0x31
    //한글:3바이트로 표현한다
    //1110xxxx 10xxxxxx 10xxxxxx
    //'가' =>10101100_00000000(unicode) ->0xac00

    // 문자에 따라 바이트 크기가 다르다
    //기존의 ISO-8850-1 은 1바이트로 변환한다
    //
    

  //  폰트
//  1 rester 폰트
//크기를 늘리면 계단현상 발생
// 2  vector 폰트
//크기를 늘려도 깔끔하게 출력
//폰트를 명령어로 저장한다
//그릴때마다 명령어를 실행해야 하기 때문에 출력속도가 느리다


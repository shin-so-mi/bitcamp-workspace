//Ex0340.java
//주제 :



package com.eomcs.basic.ex03;



class Exam0340 {
    public static void main(String[] args) {
        //4바이트 메모리에 부동소수점 저장하기---------
    System.out.println("1-------------");
    System.out.println(999.9999f);
    System.out.println(999999.9f);
    System.out.println(9.999999f);
      //메모리 크기를 넘는 값은 반올림 처리 되어 저장된다(4바이트가 이값을 담기엔 작다)
      //4바이트 메모리는 최대 7자리 부동소수점을 저장할수 있다
      //초과하는 경우 반올림처리더ㅣ거나 잘린다
    System.out.println("2-------------");
    System.out.println(999.99994f);
    System.out.println(9999999.4f);
    System.out.println(9.9999994f);

    System.out.println("3-------------");
    System.out.println(987654321.1234567F);
    System.out.println(98765432112345.67F);
    System.out.println(9.876543211234567F);


    //8바이트 메모리에 부동소수점 저장하기
    System.out.println("4-------------");
    System.out.println(987654321.1234567);
    System.out.println(98765432112345.67);
    System.out.println(9.876543211234567);

    
    //8바이트 메모리에느 최대 16자리의 부동소수점을 
    //저장할수있다
    //초과하면 반올림처리되거나 
    System.out.println("5-------------");
    System.out.println(987654321.12345678);
    System.out.println(9876543211234567.8);
    System.out.println(9.8765432112345678);

    

    
   
     //유효자릿수 
     //- 소숫점을 제외한 숫자의개수 
     //
     //4바이트 메모리에는 최대 7자리까지저장할수 읶다
     //8바이트 메모리에는 최데 16자리까지 저장할수 있다
     //초과하는 수는 반올림 처리 되거나 잘린다
     //유효자릿수라 하더라도 100%정확하지는 않다
     //왜냐  IEEE 754 규격에 따라 2진수로 전환할때
     //일부 값은 완전히 정확하게 변환되짚 않는 경우도있ㄷㅏ




     //부동소숫점 의 일부는 정확하게 2진수는 변환할수 없다
    System.out.println("6-------------");
    System.out.println(7 * 0.1);  
     //예상값 = 0.7

    }
    }
          
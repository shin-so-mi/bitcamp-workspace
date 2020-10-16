package com.eomcs.basic.ex05;

//# 비트 연산자 & 를 이용하여 % 연산 구현하기
//
public class Exam0351 {
  public static void main(String[] args) {

    System.out.println(57 % 2);
    System.out.println(57 & 0b0000_0001);
    // % 연산은 나누기 연산을 수행해야 한다.
    // 나누기 연산은 여러 번의 계산을 수행하게 된다.
    // 그에 비해 & 비트 연산은 한 번만 하면 된다.
    // 결론?
    // - 짝수인지 홀수 인지 알아내거나
    // - 2의 나머지를 구하고 싶다면 & 비트 연산을 수행하는 것이 빠르다.
    //
    // 어떤 값에 대해 2로 나눈 나머지 값을 구하고 싶다면,
    // & 연산자를 이용하여 그 값의 하위 1비트 값만 추출하면 된다.
    // 예)
    //    0011 0110 (54)
    //  & 0000 0001 (뒤의 1비트의 값을 추출)
    // --------------
    //    0000 0000 추출된 값은 0이다. 즉 나머지가 없다.
    //
    //    0011 0101 (53)
    //  & 0000 0001
    // --------------
    //    0000 0001 (나머지는 1이다)



    System.out.println(57 % 4);
    System.out.println(57 & 0b11);
    // 어떤 값에 대해 4로 나눈 나머지 값을 구하고 싶다면,
    // & 연산자를 이용하여 그 값의 하위 2비트 값만 추출하면 된다.
    // 주의!
    // => & 연산자를 사용해서 나머지 값을 구하려면
    //    나누는 값이 2의 제곱수여야 한다.
    // => 즉 2의 제곱수로 나눈 나머지 값을 구하는 경우에는
    //    % 대신 비트 연산자 &를 사용하면 계산 속도가 빠르다.
    // 권고
    // => 너무 고민 말고 그냥 % 사용하라.
    // => 다른 개발자가 이해하기 편할 것이다.
    // => 그럼에도 불구하고 이 연산자의 응용법을 익히는 이유는
    //    가끔 오픈소스나 고급 개발자의 코드에서
    //    이런 코드를 만나기 때문이다.

    System.out.println(57 % 8);
    System.out.println(57 & 0b111);

    System.out.println(57 % 16);
    System.out.println(57 & 0b1111);

  }
}


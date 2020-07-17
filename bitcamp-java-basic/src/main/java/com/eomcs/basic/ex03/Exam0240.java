package com.eomcs.basic.ex03;






public class Exam0240 {
    int a = 0xaaaaaaaa;
    int b = -0xaaaaaaaa;
    public static void main(String[] args) {


    System.out.println(5 - 3);
    System.out.println(5 + (-3));
    //0000 0011 <= +3 2진수
    //1111 1101 <= -3 2의보수
    //1000 0011 <= -3 sign-Magnitude
    //0111 1100 <= -3 Excess-K(bias) = -3 +127 = 124
    // K= 2**(비트수 - 1) - 1
    //  = 2**(8 - 1) - 1
    //  = 2**7 - 1
    //  = 128 - 1
    //  = 127
    






    //0111 1011 <= +123 2진수
    //1000 0101 <= -123 2의보수
    //1000 0011 <= -123 sign-Magnitude
    //0000 0010 <= -123 Excess-K(bias) = -123 +127 = 124


    //10101010 10101010 10101010 10101010 <= +aaaaaaaa 2진수
    //01010101 01010101 01010101 01010110 <= -123 2의보수
    //55 55 55 56 <= 16진수
    //













    }
}

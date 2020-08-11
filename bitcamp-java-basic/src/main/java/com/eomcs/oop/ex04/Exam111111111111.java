package com.eomcs.oop.ex04;

public class Exam111111111111 {
public static void main(String[] args) {
  String s1 = new String("hello");
  //s1 인스턴스의 값을 조회하는 메서드  사용
 // 따라서 이 메서드를 호출하려면 반드시 String 인스턴스의 주소를 주어야함
  char c = s1.charAt(1);
  System.out.println(c);

 ///비교
  System.out.println(s1.compareTo("hello"));
//두문자열을 연결하여 새 문자열을 만들자
String s2 = s1.concat(", world");
System.out.println(s1);
System.out.println(s2);
// 두 인스턴스에 들어있는 문자열이 같은지 비교할때
System.out.println(s1.equals("aaa"));
System.out.println(s1.equals("hello"));

String s3 = new String("abc가각");




Integer i1 = Integer.valueOf(100);
Integer i2 = Integer.valueOf(200);
Integer i3 = Integer.valueOf(300);

System.out.println(i2.compareTo(i1));
System.out.println(i2.compareTo(i3));

}
}
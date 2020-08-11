package com.eomcs.oop.ex04;

import java.util.Calendar;
import java.util.Date;

public class Exam0210 {
public static void main(String[] args) throws Exception {

  String s1 = new String("hello");
  String s2 = new String("ABC가각");
  //인스턴스메소드
  //static non 메서드
  //인스턴스 주소를 가지고 호출해야한다
  //this 라는 내장변수가 있다
  //특정 인스턴스의 변수를 다루는 메서드


 char c1 = s1.charAt(1); //특정인스턴스의 변수를 다룸
  System.out.println(c1);

char c2 = s2.charAt(1);
System.out.println(c2);


System.out.println(s1.compareTo(s2)); //이것도 인스턴스메소드
//


System.out.println(s1.contains("ll"));

System.out.println(s2.contains("ll"));
System.out.println(s1.equals(s2));  //s1에 들어잇는 문자열과 파라미터로받은 문자열을 비교

byte[] bytes = s2.getBytes(); //jvm은 utf16으로 저장한다  os기본문자표
//리눅스나 맥 인경우는 41,42,43,ea,b0 80,ea,b0,81
//             윈도우   41,42,43 b0,a1,b0,a2

for (byte b : bytes) {
  System.out.println(Integer.toHexString(b & 0xff));//& 를해야 fff가 안붙는다

}


bytes = s2.getBytes("ms949");


for (byte b : bytes) {
  System.out.println(Integer.toHexString(b & 0xff));//& 를해야 fff가 안붙는다

}
System.out.println("========================");
 String s3 = String.format("%s님 방가방가!", "홍길동");
 System.out.println(s3);


 String s4 = String.join("," ,"홍길동" ,"임꺽정", "유관순");
 System.out.println(s4); //주어진 파라미터 값만 있으면 됨  static 매소드




 String s5 = String.valueOf(true);   //문자열을 리턴한다
                                     // 문자열을 담고있는 스트링 인스턴스 주소를 담는다
 String s6 = String.valueOf(100);
 String s7 = String.valueOf(3.14f);
 System.out.printf("%s,%s, %S\n",s5,s6,s7);


 System.out.println(Math.abs(-100));
 System.out.println(Math.ceil(-3.28));
 System.out.println(Math.floor(-3.28));
 System.out.println(Math.round(3.14));
 System.out.println(Math.abs(-100));
 System.out.println(Math.pow(2,7));  //2의몇승

Date d1 = new Date();
System.out.println(d1.getYear() + 1900);
System.out.println(d1.getMonth()+ 1);
System.out.println(d1.getDate());


long millis = Date.parse("sat, 12 Aug 1995 13:30:25 GMT");
System.out.println(millis);

java.sql.Date d2 = java.sql.Date.valueOf("2020-08-10"); //class메소드
System.out.println(d1.getYear() + 1900);
System.out.println(d1.getMonth()+ 1);
System.out.println(d1.getDate());

long curr = System.currentTimeMillis();
Date d3 = new Date(curr);
System.out.println(d1.getYear() + 1900);
System.out.println(d1.getMonth()+ 1);
System.out.println(d1.getDate());

System.out.println("====================");

Calendar cal =Calendar.getInstance();

System.out.println(cal.get(2) + 1);
System.out.println(cal.get(5));
System.out.println(cal.get(7));
System.out.println(cal.get(4));
System.out.println(cal.get(10));
System.out.println(cal.get(11));
System.out.println(cal.get(12));
System.out.println(cal.get(13));


System.out.println(cal.get(Calendar.YEAR));
System.out.println(cal.get(Calendar.MONTH) + 1);
System.out.println(cal.get(Calendar.DATE));
System.out.println(cal.get(4));
System.out.println(cal.get(10));
System.out.println(cal.get(11));
System.out.println(cal.get(12));
System.out.println(cal.get(13));


//int -> Integer ,byte-> Byte , short -> short, long -> Long
Integer i1 = new Integer(100);
Integer i2 = new Integer(200);

System.out.println(i1.toString());
System.out.println(i2.toString());
System.out.println(i1 == i2);

Integer i3 = Integer.valueOf(100);//static method
Integer i4 = Integer.valueOf(100);

System.out.println(i1.toString());
System.out.println(i2.toString());
System.out.println(i3 == i4);


}



}

















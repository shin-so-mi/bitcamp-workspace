package com.eomcs.basic.ex07;

public class Exam0210 {
public static void main(String[] args) {
  m1();





  m2("홍길동"); //메서드 호출
  //m2(100);
  //int r = m2("홍길동");


  String message = m3();
  System.out.println(message);
  //m2();


  message = m3();
  System.out.println(message);

  message = m4("홍길동");
  System.out.println(message);

  message = m5("홍길동" , 20 ,false);
System.out.println(message);

 m6("홍길동", 100, 90, 80);
 m7("홍길동",new int[] {100,});
 m7("홍길동",new int[] {100,});
 m7("홍길동",new int[] {});
 System.out.println("===================================");
 m8("홍길동", 100, 90, 80, 70);
 m8("홍길동", 100, 90);
 m8("홍기롱ㄹ");
////int aver = m6("홍길동", 100, 90,80, 70,60);

   m10(new int[] {100,90,80}, new String[] {"국어", "영어","수학"},"홍길동");


//2+3+7=?
   int sum = 0;



   System.out.println(plus(plus(plus(2,3 ), 7),4));



}


static void m1() {
  System.out.println("hello");
}
static void m2(String name) {
  System.out.println(name + "님 반갑습니다");
}

static String m3() {
  return "ㅇ";


}
static String m4(String name) {
  return name + "반갑습니다";
}
static String m5(String name, int age, boolean working) {
  return age + "살" + name + "님은 현재 재직상태가" + working +"입니다";
}

static void m6(String name, int a, int b, int c) {
  int sum = a + b + c;
  int ever = sum / 3;
  System.out.printf("%s: %d,(%d)\n", name, sum, ever);
}



static void m7(String name,int[] scores) {
  int sum = 0;

  for (int i = 0; i < scores.length; i++) {
    sum += scores[i];
  }

  int ever = 0;
  if (scores.length > 0) {
    ever = sum / scores.length;
    }

  System.out.printf("%s: %d,(%d)\n", name, sum, ever);
}





static void m8(String name,int... scores) {
  int sum = 0;
  for (int i = 0; i < scores.length; i++) {
    sum += scores[i];
  }

  int ever = 0;
  if (scores.length > 0) {
    ever = sum / scores.length;
    }

  System.out.printf("%s: %d,(%d)\n", name, sum, ever);
}






//static void m9(int... scores, String name) {
  //가변파라미터는 무조건 맨 끝에 와야한다
  //이것 암기


//가변파라미터 중간에다른타입의  변수가 오더라도
//가변 파라미터를 한개 초과하여 둘수 ㅇ없다
//static void m9(String...titles, String name,int...scores2) {

//가변파라미터는 여러개 선언할수 옶다
//m9(100.90,80);


static void m10(int[] scores, String[] titles, String name) {
  if (scores.length != titles.length) {
    System.out.println("과목수와 점수가 개수가 다릅니다");
    return;

  }

  for (int i= 0; i < scores.length; i++)  {
    System.out.printf("%s = %d 점 \n" , titles[i],scores[i]);
  }


}

static int plus(int a, int b) {
  return a + b;

}
}


//void 리턴타입
//m1 메서드명
//() 아규먼트명 (파라미터변수)

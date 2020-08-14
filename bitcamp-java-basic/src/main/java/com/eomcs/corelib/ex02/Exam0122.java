// String - String.equals() vs Object.equals()
package com.eomcs.corelib.ex02;

public class Exam0122 {

  static class Member {
    String name;
    int age;

    public Member(String name, int age) {
      this.name = name;
      this.age = age;
    }
  }

  public static void main(String[] args) {

    Member m1 = new Member("홍길동", 20);
    Member m2 = new Member("홍길동", 20);

    // 비록 m1과 m2는 같은 값을 갖고 있지만 인스턴스가 다르다.
    System.out.println(m1 == m2); // false

    // Member는 Object에서 상속 받은 equals()를 오버라이딩 하지 않았다.
    // 따라서 단순히 인스턴스가 같은지를 비교할 것이다.
    System.out.println(m1.equals(m2)); // false
  }



  static class Memeber2 {
    String name;
    int age;

    public Member2 (String name, int age) {
      this.name = name;
      this.age = age;

    }
  }
  public static void main(String[] args) {
    Member2 n1 = new Member2("홍길동", 20);
    Member2 n2 = new Member2("홍길동", 20);


    System.out.println(n1.equals(n2));
    System.out.println(n1 == n2 ); 인스턴스주소 가 다르다
  }

}





















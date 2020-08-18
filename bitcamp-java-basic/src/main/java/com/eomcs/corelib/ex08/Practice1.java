package com.eomcs.corelib.ex08;

import java.util.HashMap;

public class Practice1 {
  static class MyKey {
    String major;
    int no;
    public MyKey(String major, int no) {
      this.major = major;
      this.no = no;

    }

    @override

    public String thString() {
      return "MyKey [major=" + major + ", no=" + no + "]";
    }
  }
public static void main(String[] args) {
  Member v1 = new Member("홍길동", 20);
  Member v2 = new Member("임꺽정", 30);
  Member v3 = new Member("유관순", 16);
  Member v4 = new Member("안중근", 30);
  Member v5 = new Member("윤봉길", 25);

   MyKey k1 = new MyKey("컴공",1 );
   MyKey k2 = new MyKey("컴공", 2);
   MyKey k3 = new MyKey("컴공", 3);
   MyKey k4 = new MyKey("컴공", 4);
   MyKey k5 = new MyKey("컴공", 5);


   HashMap map = new HashMap();
   map.put(k1, v1);
   map.put(k2, v2);
   map.put(k3, v3);
   map.put(k4, v4);
   map.put(k5, v5);



   System.out.println(map.get(k1));
   System.out.println(map.get(k2));
   System.out.println(map.get(k3));
   System.out.println(map.get(k4));
   System.out.println(map.get(k5));

   //같은 값을 갖지만 인스턴스가다른 key
   MyKey k6 = new MyKey("컴공", 3);
   // 하지만 인스턴스는 다르다

  System.out.println(k3 == k6);
  System.out.println(k3.equals(k6));


}
}

package com.eomcs.corelib.ex03;

public class MyArrayListTest2 {
public static void main(String[] args) {

  MyArrayList.add("aaa");
  print();
  MyArrayList.add("bbb");
  print();
  MyArrayList.add("ccc");
  print();
  MyArrayList.add("ddd");
  print();
  MyArrayList.add("eee");
  print();
  MyArrayList.add("fff");
  print();
  MyArrayList.add("ggg");
  print();
  MyArrayList.add("hhh");
  print();


  MyArrayList.add(8, "iii");
  print();


Object old = MyArrayList.remove(5);
print();
System.out.println(old);
MyArrayList.set(0,"xxx");
print();
  System.out.println(MyArrayList.get(7));
}

static void print() {
  for(int i = 0; i < MyArrayList.size; i++) {
    String str = (String) MyArrayList.get(i);
    System.out.print(str+ ",");
  }
System.out.println();
}




}

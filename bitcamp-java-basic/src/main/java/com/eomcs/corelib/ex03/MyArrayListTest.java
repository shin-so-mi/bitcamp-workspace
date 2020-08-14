package com.eomcs.corelib.ex03;

public class MyArrayListTest {
public static void main(String[] args) {

  MyArrayList.add("aaa");
  MyArrayList.add("bbb");
  MyArrayList.add("ccc");

  MyArrayList.add(1, "xxx");
  print();
  Object old = MyArrayList.set(2,"yyy");
   print();
   System.out.println(old);
    old = MyArrayList.remove(1);
    print();
    System.out.println(old);
}

static void print() {
  for(int i = 0; i < MyArrayList.size; i++) {
    String str = (String) MyArrayList.get(i);
    System.out.print(str+ ",");
  }
System.out.println();
}




}

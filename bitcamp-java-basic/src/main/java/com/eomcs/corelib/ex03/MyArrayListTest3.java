package com.eomcs.corelib.ex03;

public class MyArrayListTest3 {
public static void main(String[] args) {
 MyArrayList list1 =new MyArrayList();
  list1.add("aaa");
  list1.add("bbb");
  list1.add("ccc");
  list1.add("ddd");
  list1.add("eee");
  MyArrayList list2 =new MyArrayList();
  list2.add("fff");
 list2.add("ggg");
  list2.add("hhh");



  list1.add("iii");
  print(list1);
print(list2);

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


public int size() {
  return this.size;
}

}

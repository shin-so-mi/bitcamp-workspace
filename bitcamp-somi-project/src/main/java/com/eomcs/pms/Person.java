package com.eomcs.pms;

class Person {
String name;
int age;

 Person() {
	 this("나", 1);
 }
	
 Person(String name, int age) {
	 this.name = name;
	 this.age = age;
	 
 }
}
 class CallAnotherConst {
	public static void main(String[] args) {
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
		}
}
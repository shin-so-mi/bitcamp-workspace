package com.eomcs.oop.ex05.a;

public class Car {
  public String model;
  public String maker;
  public int capacity;

  public Car() {}
//오버로딩
  public Car(String model, String maker, int capacity) {
    this.model = model;
    this.maker = maker;
    this.capacity = capacity;

  }
}



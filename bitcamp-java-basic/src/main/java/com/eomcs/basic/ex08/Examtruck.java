
package com.eomcs.basic.ex08;

public class Examtruck {
static class Engine implements Cloneable{
int cc;
int valve;

public Engine(int cc, int valve) {
  this.cc = cc;
  this.valve = valve;

}



@Override

public String toString() {
  return "Engine [cc=" +cc+ ", valve="+valve+"]";

}
}
static class Car implements Cloneable {
  String maker;
  String name;
  String engine;

  public Car(String maker, String name, Engine engine) {
    this.maker = maker;
    this.name = name;
    this.engine = engine;

  } @Override

  public String toString() {
    return "Car [maker=" + maker + ", name="
+name + ", engine=" + engine + "]";
    }
  @Override

  public Car clone() throws CloneNotSupportedException {
    return (Car) super.clone();

  }
}

public static void main(String[] args) throws Exception{
  Engine engine = new Engine(3000,16);
  Car car = new Car("비트자동","비트비", engine);
  // 자동차 복제
  Car car2 = car.clone();
  System.out.println(car == car2);
  System.out.println(car);
  System.out.println(car2);


  car.engine.cc =2000;
  System.out.println(car2.engine.cc);
}





























}


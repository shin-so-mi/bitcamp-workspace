package com.eomcs.basic.ex08;

public class Examvehicle {

  //인스턴스를 복제할수 있게 하려면
  //object에서 제공하는 clone()을 호출할수 있어야 한다

  //clone을 오버라이딩 한다
  // public으로 호출 하면된다

  static class Score {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;

    public Score() {}

    public Score(String name, int kor, int eng, int math) {
      this.name = name;
      this.kor = kor;
      this.eng = eng;
      this.math = math;
      this.sum = this.kor + this.eng + this.math;
      this.aver = this.sum / 3f;
    }

      @Override
      @override
      public String toString() {
        return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", sum="
            + sum + ", aver=" + aver + "]";

      }











  }


















}

package test1;

//# 메서드 : 사용 전
//
public class Exam0110 {
  public static void main(String[] args) {
//과제: 단위행렬을 출력하시오

    int[][] arr = new int[5][5];

    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= 5; j++) {
        System.out.printf("%d" , arr[i][j]);

      }
      System.out.println();
    }

}
}
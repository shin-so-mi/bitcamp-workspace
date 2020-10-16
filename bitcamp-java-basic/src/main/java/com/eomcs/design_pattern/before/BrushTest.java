package com.eomcs.design_pattern.before;

import java.util.Scanner;
import com.eomcs.design_pattern.after.BrushPool;

public class BrushTest {



    public static void main(String[] args) {
         BrushPool brushPool = new BrushPool();
        Scanner keyboard = new Scanner(System.in);

        while (true) {
          System.out.print("패턴");
          String pattern = keyboard.nextLine();
          System.out.print("선길이");
          int length = Integer.parseInt(keyboard.nextLine());
          if (length < 0)
            break;
          //사용자가 입력한 패턴의 브러쉬를 브러시풀에서 꺼내 슨다
          //매번 생성하지않기 때문에 가비지생성이 줄어든다
          //이것이flypattern을 사용하눈 이유이다

          Brush brush = brushPool.getBrush(pattern);
          brush.draw(length);
        }
        keyboard.close();
    }
}

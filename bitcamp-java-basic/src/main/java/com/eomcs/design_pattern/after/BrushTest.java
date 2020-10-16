package com.eomcs.design_pattern.after;

import java.util.Scanner;

public class BrushTest {



    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        while (true) {
          System.out.print("패턴");
          String pattern = keyboard.nextLine();
          System.out.print("선길이");
          int length = Integer.parseInt(keyboard.nextLine());
          if (length < 0)
            break;
            // 사용자가 입력한 패턴의 브러시 객체를 생성한다
          //매번 생성하고 쓰고 버린다
          //가비지가계ㄱ속 생성되는 문제가 있다
          //해결책은 생성한 객체를 보관하여 재사용 ㅎ하면 된다
          Brush brush = new Brush(pattern);
          brush.draw(length);
        }
        keyboard.close();
    }
}

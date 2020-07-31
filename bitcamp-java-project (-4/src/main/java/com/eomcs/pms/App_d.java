package com.eomcs.pms;

// 클래스의 패키지 정보를 미리 선언하여 컴파일러에게 알려준다.
import java.sql.Date;
import java.util.Scanner;

// 1) 낱개의 변수를 사용하여 여러 회원 정보 처리하기
// 2) 조건문을 사용하여 입출력 제어하기
// - 필요한 만큼만 입력 받고 출력하고 싶다.

//3 배열을 사용하여 여러 개의 값을 다루기
//배열을 사용하면 간단하게 여러개의 변수를 선언할수잇다
// 반복문을 사용하여 여러개의 값을 다루기
// 반볻문을 사용하면 같은코드르 중복해서 작성할 필ㅇ요가엊다
//배열개수를 
//상수를 사용하여 값응ㄹ 초기 값으로 ㅂ변경하지 못하게 막기
//  변수는 중간에 값을 바꿀수 있기떄문에 값을 바꾸지 말아야 하는경우
//상수(항상같은값)로선언(final)
//메서드를 사용하여 코드를 분리핟하기
//메서드를 사영하면 기능별로 코드를 별도의 블럭으로 분리할수 있다
//작은단위로 코드가 분리되면 분리하기쉽다
public class App_d {
 static int count = 0;
 static final int MAX_LENGTH = 5;
 int[] no = new int[MAX_LENGTH];
 String[] name = new String[MAX_LENGTH];
 String[] email = new String[MAX_LENGTH];
 String[] password = new String[MAX_LENGTH];
 String[] photo = new String[MAX_LENGTH];
 String[] tell = new String[MAX_LENGTH];
 Date[] now = new Date[MAX_LENGTH];
 Scanner keyInput = new Scanner(System.in);
 
  public static void main(String[] args) {

    System.out.println("[회원]");
    inputmembers(); //별도의 블럭으로 분리한 코드를 실행 (메소드)
      
    
    System.out.println("---------------------------");
    
    printMembers();

 
    
    long currentMillis = 0;
    int count = 0;
    for (int i = 0; i < 5; i++) {
      count++;
      System.out.print("번호? ");
      no[i] = keyInput.nextInt();
      keyInput.nextLine();
      
      System.out.print("이름? ");
      name[i] = keyInput.nextLine();
      
      System.out.print("이메일? ");
      email[i] = keyInput.nextLine();
      
      System.out.print("암호? ");
      password[i] = keyInput.nextLine();
      
      System.out.print("사진? ");
      photo[i] = keyInput.nextLine();
      
      System.out.print("전화? ");
      tell[i] = keyInput.nextLine();
      
      currentMillis = System.currentTimeMillis(); // 1970-1-1 00:00:00 에서경과된 밀리초
      now[i] = new Date(currentMillis);
      System.out.println();
      
      
      System.out.print("계속 입력하시겠습니까?(y/N) ");
      String response = keyInput.nextLine();
      if (response.equalsIgnoreCase("y") == false) {
        
        
   
    }
    
    if (response.equals("y") || response.equals("Y")) {
      count = count + 1;
    
      // 2번 회원 입력
      System.out.print("번호? ");
      no[1] = keyInput.nextInt();
      keyInput.nextLine();

      System.out.print("이름? ");
      name[1] = keyInput.nextLine();

      System.out.print("이메일? ");
      email[1] = keyInput.nextLine();

      System.out.print("암호? ");
      password[1] = keyInput.nextLine();

      System.out.print("사진? ");
      photo[1] = keyInput.nextLine();

      System.out.print("전화? ");
      tell[1] = keyInput.nextLine();

      currentMillis = System.currentTimeMillis(); // 1970-1-1 00:00:00 에서경과된 밀리초
      now[1] = new Date(currentMillis);
      System.out.println();

      System.out.print("계속 입력하시겠습니까?(y/N) ");
      response = keyInput.nextLine();

      if (response.equalsIgnoreCase("y")) {
        count = count + 1;

        // 3번 회원 입력
        System.out.print("번호? ");
        no[2] = keyInput.nextInt();
        keyInput.nextLine();

        System.out.print("이름? ");
        name[2] = keyInput.nextLine();

        System.out.print("이메일? ");
        email[2] = keyInput.nextLine();

        System.out.print("암호? ");
        password[2] = keyInput.nextLine();

        System.out.print("사진? ");
        photo[2] = keyInput.nextLine();

        System.out.print("전화? ");
        tell[2] = keyInput.nextLine();

        currentMillis = System.currentTimeMillis(); // 1970-1-1 00:00:00 에서경과된 밀리초
        now[2] = new Date(currentMillis);
        System.out.println();

        System.out.print("계속 입력하시겠습니까?(y/N) ");
        response = keyInput.nextLine();

        if (response.equalsIgnoreCase("y")) {
          count += 1; // count = count + 1;

          // 4번 회원 입력
          System.out.print("번호? ");
          no[3] = keyInput.nextInt();
          keyInput.nextLine();

          System.out.print("이름? ");
          name[3] = keyInput.nextLine();
          
          System.out.print("이메일? ");
          email[3] = keyInput.nextLine();

          System.out.print("암호? ");
          password[3] = keyInput.nextLine();

          System.out.print("사진? ");
          photo[3] = keyInput.nextLine();

          System.out.print("전화? ");
          tell[3] = keyInput.nextLine();

          currentMillis = System.currentTimeMillis(); // 1970-1-1 00:00:00 에서경과된 밀리초
          now[3] = new Date(currentMillis);
          System.out.println();

          System.out.print("계속 입력하시겠습니까?(y/N) ");
          response = keyInput.nextLine();

          if (response.equalsIgnoreCase("y")) {
            count++; // count = count + 1

            // 5번 회원 입력
            System.out.print("번호? ");
            no[4] = keyInput.nextInt();
            keyInput.nextLine();

            System.out.print("이름? ");
            name[4] = keyInput.nextLine();

            System.out.print("이메일? ");
            email[4] = keyInput.nextLine();

            System.out.print("암호? ");
            password[4] = keyInput.nextLine();

            System.out.print("사진? ");
            photo[4] = keyInput.nextLine();

            System.out.print("전화? ");
            tell[4] = keyInput.nextLine();

            currentMillis = System.currentTimeMillis(); // 1970-1-1 00:00:00 에서경과된 밀리초
            now[4] = new Date(currentMillis);
            System.out.println();
            

          }


        }


      }
    }

    keyInput.close();

    System.out.println("---------------------------");
    System.out.printf("%d, %s, %s, %s, %s\n", no[i], name[i], email[i], tell[i], now[i].toString());
    
        }
    
    
    
    
    static void inputMember() {
      Scanner KeyInput = new Scanner(System.in);
      currentMillis = System.currentTimeMillis();
      
      
      
    }
    
    static void printMember() {
      
    }
    
    
      }
    
  }











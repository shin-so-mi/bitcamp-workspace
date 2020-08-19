# 16 - UI 코드와 데이터 처리 코드를 분리하기

객체지향 프로그래밍을 할떄 다음두가지를 명심해야한다

-lowcoupling
-High Conhesion
(관계도 낮추기)
의존클래스의 변경에 둔감-> 코드변경이 줄어든다)

 **응집력강화 란?
 한클래스가 너무 다양한 역할을 수행하면 클래스 코드가 커지고
 클래스의 코드가 커지고 변경샇항이 잦아지기 때문에 유지보수에 좋지 않다
 그래서 가능한 클래스가한개의 역할만 수행하게 만드는 것이 유지보수에 좋다
 역할을 작게 쪼개게 되면  해당클래스를 다른 프로젝트에서 재사용하기 쉽다
 
 
 이번 훈련의 목표는 응집력 강화를 연습해보는것이다
 기존의 핸들러클래스는 사용자에게 출력하고 사용자의 입력을 받는
 즉 사용자와 소통하는 역할을 수행할 쁀만 아니라 
 사용자가 입력한 데이터를 관리하는 일도 수행한다
 이번 훈련에서는 핸들러의 역할을 더 작게 쪼게어 전문화 시킬것이다
 즉 사용자의 소통을 담당하는 유아이역할클래스과 데이터 처리를 담당하는 dao역할 클래스로 분리할것이다
 이렇게 분리하게되면 추후 데이터 처리 부분을 다른클래스로 교체하기쉬워진다
 예를들어 지금으 데이터를 배열에 보관하고 있지만
 나중에는 파일이나 dbms에 보관하는 클래스로 교체 하기가 쉬워진다
 또한 지금은 cli 방식으로 유아이를 처리하고 있지만 나중에는 웹으로 처리하는 클랫로 교체하기가 쉬워진다
 .                                                                                          
## 훈련 목표

- 캡슐화 기법을 이용하여 데이터 처리 코드를 별개의 클래스로 분리할 수 있다.
- 배열 복제를 통해 배열의 크기를 늘릴 수 있다.
- 역할에 따라 클래스를 분리하는 방법과 이점을 이해한다.  


 ## 훈련내용 
 BoardHandler 클래스를 ui 처리와 데이터 퍼리 역할자로분리한다
 

## 실습

### 작업1) BoardHandler에서 데이터 처리 코드를 분리하라.

- LessonList.java
    - `LessonHandler`에서 데이터 처리 코드를 이 클래스로 옮긴다.
    - 수업 데이터 배열을 리턴하는 toArray() 메서드를 정의한다.
    - 수업 데이터를 저장하는 add() 메서드를 정의한다.
    - 기본 생성자와 배열의 초기 크기를 설정하는 생성자를 정의한다.  
- LessonHandler.java
    - `LessonList` 클래스를 사용하여 데이터를 처리한다.
2단계
Board 클래스를 패키지멤버 클래스로 정의하면 관리하기가쉽다

### 작업2) MemberHandler에서 데이터 처리 코드를 분리하라.

- BoardList.java
    - `MemberHandler`에서 데이터 처리 코드를 이 클래스로 옮긴다.
    - 회원 데이터 배열을 리턴하는 toArray() 메서드를 정의한다.
    - 회원 데이터를 저장하는 add() 메서드를 정의한다.
    - 기본 생성자와 배열의 초기 크기를 설정하는 생성자를 정의한다.  
- MemberHandler.java
    - `MemberList` 클래스를 사용하여 데이터를 처리한다.

### 작업3) BoardHandler에서 데이터 처리 코드를 분리하라.

- BoardList.java
    - `BoardHandler`에서 데이터 처리 코드를 이 클래스로 옮긴다.
    - 게시물 데이터 배열을 리턴하는 toArray() 메서드를 정의한다.
    - 게시물 데이터를 저장하는 add() 메서드를 정의한다.
    - 기본 생성자와 배열의 초기 크기를 설정하는 생성자를 정의한다.  
- BoardHandler.java
    - `BoardList` 클래스를 사용하여 데이터를 처리한다.

## 실습 소스 및 결과

- src/main/java/com/eomcs/lms/handler/LessonList.java 추가
- src/main/java/com/eomcs/lms/handler/MemberList.java 추가
- src/main/java/com/eomcs/lms/handler/BoardList.java 추가
- src/main/java/com/eomcs/lms/handler/LessonHandler.java 변경
- src/main/java/com/eomcs/lms/handler/MemberHandler.java 변경
- src/main/java/com/eomcs/lms/handler/BoardHandler.java 변경
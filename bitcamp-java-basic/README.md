# /src/main/java 폴더
10/19
 use-case 식별방법

 1.액터가  개발할 시스템을 사용하여 처리하는 업무
 2. 한 사람이 한번에 한 순간에 수행하는 업무
    예) 매일 보내는 일 
      - 메일 임시 보관하기
      - 메일 보내기
3. 카운트가 가능한 단위로 업무를  쪼갠다
* 개발단위
분석 - 설계 -구현

업무가 아닌데도 use-case 로 식별되는경우
    예) 게시글 등록
       - 게시글 변경
       -게시글 삭제
개발  필요성에 의해 use-case로 분류한다
다른 use-case들의 관리를 쉽게하기위해 추출
개발 편의성

use-case 통합
게시글 조회
게시글 등록     =>   게시글관리  (서로 관련된 업무인 경우 관리의 편의성을 위해 한개의  USE-CASE 로 합치기도 한다)
게시글 변경                      단, 합친 USE-CASE는 2주~6주 범위에서 개발 하여야한다


USE-CASE DIAGRAM 2
 비회원 -> 회원가입 ---> 주소검색 -> 카카오 주소검색  
비회원  -> 회원가입 주소검색 <---- 주소검색(확장) -> 주소검색




스레드

클라이언트의 접속요청)서버 -> 스레드풀꺼내서 스레드풀에 보관 -> 


DBMS
액터가 앱에 데이타를 요청 -> DBMS는 데이터를 저장하고 조회,변경,삭제 ,데이터간의 관계를 제어->결함이 생기지 않게 제어(무결성)

DBMS와 SQL
DBMS :서버 <- (요청)클라이언트 요청을 명령하는 문볍= SQL
모든DBMS가  SQL표준을 완벽히 지원하지 못한다
DBMS마다 지원하는 SQL버전도 다르다
같은 DBMS라도 버전마다 지원하는 SQL버전이 다르다
같은 밴더에 같은 DBMS라해도 
버전마다 사용 할 수있는 문법이 차이가난다
전용 문법이 다르기때문에 동작이 안될 수 있다
 DBMS 전용 문법은  DBMS 성능을 극한으로이용->
 표준SQL을 사용하면 이런이점을 누릴수가 없다



SQL과 개발현실
sQL표쥰이 있지만 오라클버전에 따라 제작성 해야한다





부모테이블을 삭제하려면  참조 테이블을 먼저 삭제 하고 삭제가능하다
delete from test2 where bno = 5; //참조테이블 먼저지움
delete from test2 where no = 5; //부모테이블 지우기가능

exERD다운받기
exerd  모델링 툴
 exerd다운로드 이클립스플로그인으로다운
 주소를 복사 이클립스로가서
이클립스 > 헬프 > install software들어간다
이름을 정하고 주소복사를 붙힌다


프로젝트 구성
현황> 문제점>해결방안>이점>주요기능설명>



natural join dept d = 같은 컬럼끼리 묶는다
inner join on=  기존컬럼의 값이 일치할때만 조인
join using = 조인 할 기준컬럼을 지정

left outer =조인이 안되더라도 왼쪽데이터를출력한다
*outer =확장

옵티마이징 = 속도를 높히는것이 목표라서 코드를 간결하게 한다
리팩토링 =코드가 추가되더라도 유지보수가 쉽게 만그는것

dbms
 문제점
 함수 사용법이 다르다
 이름 파라미터 리턴타입
 디비엠에ㅡ마다 따로 작성해야한다


odbc api   (c나 C++)
소프트웨어 표준 규격
일종의껍데기르 만듬
개발자의 지시 > odbc 번역 > 다른언어

jdbcapi - (자바에서만 사용)
java sql
가장속도가 느리다


1. Type 1

JDBC - OJDBC Bridge Driver

표준 드라이버 호출들을 대응되는 ODBC 호출로 변환하고, 운영 시스템이 ODBC(Open Database Connectivity) 라이브러리를 통해 ODBC 데이터 소스로 전송한다
JDBC > ODBC > ODBC Driver 순으로 호출로 변환한다
클라이언트에 ODBC 드라이버 + JDBC 드라이버 둘 다 있어야 한다 => 비효율적, 제한적
시스템이 여러 단계를 거쳐 DB 호출을 전달할 뿐 아니라 JDBC 기능은 어떤 ODBC 드라이버라도 다룰 수 있는 것으로만 제한된다
=> 동적으로 드라이버를 다운로드 하는 환경에서는 사용이 어려움
ex 엑셀 파일을 읽고쓸때는 type1 을 사용
클라이언트(pc) 에 odbc driver + jdbc driver 둘다 설치 되어잉ㅆㄱ어야한다
2. Type 2

Native-API Driver : OCI Driver(Partly Java Driver)
일부가 자바로 되어 있는 JDBC 드라이버 (= 자바 드라이버를 사용하여 특정 업체의 API와 통신함)
Type1에서 ODBC API 변환 단계가 생략된 것을 제외하고는 비슷하다
API를 통해 결과를 돌려줄 때, JDBC 드라이버는 JDBC 표준을 따르는 결과를 만들어 프로그램으로 리턴
> 클라이언트에 설치된 로컬 드라이버(DB 만든 벤더가 제공하는 타 형태의 드라이버)가 필요
> oracle, DB2 등 DBMS 벤더들이 제공하는 API를 다시 호출
하게 되는데, Type1과 마찬가지로 클라이언트의 컴퓨터에 정적으로 드라이버를 설치하여 DB와 연동하는 환경에 적합하다
3. Type 3

Net-Protocol Driver (All Java Driver)
완전한 자바 기술. 코드로 이루어진 JDBC 드라이버
JDBC API 표준에 의해 만들어졌기 때문에  DBMS 종류에 관계 없이 사용이 가능하다
DBMS와 독립적인 Net-Protocol을 사용하여 미들웨어 계층의 서버와 통신하고, 이 때 미들웨어 서버는 게이트웨이 역할을 한다
4가지 타입 중 가장 융통성이 뛰어난 타입이기 때문에 동적으로 다운로드 되는 Applet 같은 환경에 더욱 적합하다
클라이언트가 정적으로 이루어졌다고 해도 Type3 사용시 유지보수가 쉬워진다
특별한 요구 사항이 필요한 경우 빼고는 Type3이 적절하다

dbms 에 상관없이 jdbc driver 로 사용
배포및 관리가 편하다
단, 실행속도 느리다

* middleware 

4. Type4  (실무에서 사용)
Native-Protocol Driver (thin Driver)
완전한 자바 기술. 코드로 이루어진 JDBC 드라이버를 의미한다
별도 다운로드가  필요하다 함수호출을 안하기때문에 순수 자바 라고 한다

* Type 3과의 차이점

DBMS 벤더가 표준을 기준으로 기능을 추가/삭제하여 독자적인 형태로 만든 타입이다
> 특정 DBMS에 의존적인 반면, 해당 DBMS만이 제공하는 기능을 사용 가능한 장점이 있다
> 4가지 Type의 드라이버 중 DB에 가장 효율적으로 접근하는 방법을 제공한다
> 추가로 설치해야 할 라이브러리 미들웨어가 필요 없어 배포하기에도 가장 손쉬운 방법으로 제공한다
> 클라이언트가 동적인 환경에서 특정 DBMS만이 제공하는 기능들을 사용할 경우 적합하다


jdbc 프로그래밍
java.sql.driver 구현체를
driver mannager 객체에 등록driver 구현을관리)
java.sql.drivermannager 로 통해
dbms 와 연결
bitcamp-java-basic 
com.somcs.jdbc 0310번 복습하기

 class.forName 뜻알기


 driver manager 의 자동등록

 driver manager > jdbc,drivers 시스템 프포피티에 등록된 클래스를 샐설 >등록
    *jar 파일에서 META-INF/services/java.sql.driver 파일을 찿는다
이 파일에 적혀있는 클래스의 인스턴스를 생성 > 등록
 이것을 드라이버 메니저가 한다


dbms 에서 sql보내기
app드라이브 메니저에게  getCinnection()달라고호출
드라이브매니저는 mariadbconnection 에 retuern 
mariadbconnection dbms에 연결

cli라고한다

sql  삽입공격
사용자가 입력한 sql문을가지고 만들면 안된다
검수조을 모두 기록한것(시큐어코딩가이드)
쿠키는 하드디스크에 저장시킨다 (가뵤ㅕ운 암호화를 하긴한다)
절대 사용자아이디암호를 저장하면안되ㅏ고 노출되어도 상관없는것을 쿠키로 저장한다




statement 
sql문법+ 값 =sql문장(dbms에 맞춰 가공) >> 가공된 sql을 dbms에 전송한다

preparedstatement
sql문법 > sql 문장 > 가공된 sql에다가 + 값을 첨부하기때문에 sql을 조작할 수 없다

기술면접에서)
statement                                  preparedstatement
sql삽입공격이 가능하다       vs                 불가능
(값과함께 sql문장을 만들기 때문)

binaryData입력
(붉가능하다                                      가능  (sql문과 값이 분리되어잇기때문에)
sql문과 값을 묶어서 문자열로 표현하기에)


실행속도 
한번에 반복하여 실행할경우                           일단 sql 문을 dbms프로토콜에 맞춰 가공해 둔다음
매번 sql문을 dbms프로토콜에 맞게 가공(parcing)        값과 함께 보내기에 한번에여러번 반복할경우 statement 보다 빠르다
느릴수있다
























 값을 가지고 문자열로 직접 SQL 문을 만들기                SQL 문장과 값이 분리되어 있기 때문에 작성하거나 읽기 쉽다.
  때문에 작성하거나 읽기 힘들다.                                                                                                                              dbms의 게시글을 저장ㅎ라테이블을 만든다
    
    
     테이블을 먼저 생성해준다
                                                                                                                                                          
       create table pms(
      no int,
      title varchar(255) not null,
      content text not null,
      writer varchar(30) not null,
      cdt datetime default now(),
      vw_cnt int default 0
       );
                                                                                                                                                         
    alter table pms_board 
  add constraint pms_board_pk primary key(no);          
  프라이머리 키 설정법
  
         alter table pms_project
       modify column no int not null auto_increment;
           오토 만듬



bitcamp-java-basic ex0310에서 try(con) 가져온다

bitcamp-java-project-client (33b 를변경)
board add handler 에서 try문 추가-> dbms로 바꾸는과정

datahadlerlistener에서 방금수정한 보드부분 없엔다


명령창에 
위의 세가지 추가한뒤 show tables;   desc pms_board;
확인

aaddlist 는 320 try 를사용




alter table pms_project
add constraint pms_project_fk foreign key(owner) references pms_member(no);


```
create table pms_project(
  no int not null,
  title varchar(255) not null,
  content text not null,
  sdt date not null,
  edt date not null,
  owner int not null,
  members varchar(255) not null
);


dbms에선 다대다 관계를 해결할 수없다
이것을 어떻게 처리 할 것 인가>?/

다대다 관계는 1대 다 다수관계로 변환해야한다

다대다관계를 저장하는컬럼은 fk로 지정할수없다
한컬럼에 여러개의 값이 저장되기때문이다




create table pms_member_project(
   member_no int not null,
   project_no int not null
);



alter table pms_member_project
add constraint pms_member_project_fk1 foreign key(member_no) references pms_member(no),
add constraint pms_member_project_fk2 foreign key(project_no) references pms_project(no);


alter table pms_project
add constraint pms_project_pk primary key(no);
















# 37-a. 데이터 관리를 DBMS에게 맡기기 : JDBC API 사용하기

이번 훈련에서는,
- **DBMS** 와 **JDBC API** 를 이용하여 데이터를 저장하고 조회하는 것을 배운다.

**데이터베이스(Database)** 는,
- 상호 연관이 있는 데이터의 모임을 가리킨다.
- 여러 사람이 공유하고 사용할 목적으로 통합 관리되는 정보의 집합이다.(wikipedia.org)
- 논리적으로 연관된 데이터를 검색과 갱신이 쉽도록 고도로 구조화한 것이다.
- 목적(wikipedia.og)
  - 데이터 중복 최소화
  - 데이터 공유
  - 일관성, 무결성, 보안성 유지
  - 데이터 접근 용이성
  - 데이터 저장 공간 절약

**데이터베이스 관리 시스템(Database Management System: DBMS)** 은,
- 데이터베이스의 목적을 달성할 수 있도록 편리하고 효율적인 환경을 제공하는 소프트웨어다.

**JDBC(Java Database Connectivity) API** 는,
- 자바 애플리케이션이 DBMS에 연동할 때 사용할 클래스와 호출 규칙을 정의한 라이브러리다
- DBMS 제작자는 *JDBC API* 의 구현체를 제공한다.

**JDBC 드라이버** 는,
- *JDBC API* 규약에 따라 만든 클래스 라이브러리다.
- 각각의 DBMS 제작자가 배포한다.

**JDBC 드라이버** 의 종류,
- Type 1
  - *JDBC-ODBC 브릿지 드라이버(bridge driver)* 라 부른다.
  - *ODBC API* 를 사용하여 DBMS와 연동한다.
  - *ODBC API* 를 제공하는 엑셀이나 액세스 등의 파일 DB에 접근할 때 용이하다.
  - 따라서 이 드라이버를 사용하는 컴퓨터에 ODBC 드라이버가 설치되어 있어야 한다.
  - 여러 계층을 경유하기 때문에 실행 속도가 느리다.
  - **JRE(Java Runtime Environment)** 에 기본으로 포함되어 있다.
- Type 2
  - *네이티브 드라이버(native driver)* 라 부른다.
  - DBMS 제작자가 제공하는 *데이터베이스 API(C/C++) = Vendor API = Native API* 를 호출하여 DBMS와 연동한다.
  - 따라서 이 드라이버를 사용하는 컴퓨터에 *데이터베이스 API* 가 설치되어 있어야 한다.
  - DBMS 제작자가 별도의 써드 파티 업체에서 제공한다.
- Type 3
  - *네트워크 프로토콜 드라이버(network protocol driver)* 라 부른다.
  - *미들웨어* 를 경유하여 DBMS와 연동한다.
  - 따라서 특정 DBMS에 종속되지 않으며, 하나의 드라이버로 여러 DBMS에 접근할 수 있다.
  - C/C++ 함수를 호출하지 않고 *미들웨어 전용 프로토콜* 로 직접 통신하기 때문에 100% 순수 자바 코드로 구현되었다.
  - *미들웨어* 구입 비용이 추가로 든다.
- Type 4
  - *씬 드라이버(thin driver)* 라 부른다.
  - DBMS와 연동할 때 *DBMS 전용 프로토콜* 로 직접 통신한다.
  - DBMS와 직접 통신하기 때문에 실행 속도가 빠르다.
  - 내부적으로 C/C++ 함수를 호출하지 않기 때문에 100% 순수 자바 코드로 구현되었다.
  - 단, 특정 DBMS에 종속된다.
  - DBMS 제작자에서 제공한다.

## 훈련 목표
- **JDBC API** 를 사용하여 **DBMS** 를 사용하는 방법을 배운다.
- **JDBC API** 와 **JDBC 드라이버** 의 관계를 이해한다.
- *JVM* 이 java.sql.Driver 구현체를 로딩하고 구동시키는 원리를 이해한다.
- 프로젝트에 **JDBC 드라이버** 를 추가하는 방법을 배운다.

## 훈련 내용
- 데이터를 파일에서 읽고 파일로 쓰는 기존 코드를 JDBC API를 사용하는 코드를 변경한다.


## 실습

### 1단계 - 프로젝트에 JDBC 드라이버를 설정한다.

- build.gradle 변경
  - mvnrepository.com 또는 search.maven.org에서 mariadb jdbc driver를 검색한다.
  - 라이브러리 정보를 build.gradle 파일에 설정한다.
  - gradle을 이용하여 eclipse 설정 파일을 갱신한다.
    - `$ gradle eclipse`
    - 다운로드 받지 않은 라이브러리가 있다면 자동으로 서버에서 받을 것이다.
    - 라이브러리 정보가 변경되었다면 해당 라이브러리를 서버에서 받을 것이다.
  - 이클립스 프로젝트를 리프래시 한다.
    - 프로젝트에 mariadb jdbc driver 라이브러리가 추가되었는지 확인한다.

### 2단계 - DBMS에 게시글을 저장할 테이블을 생성한다.

```
create table pms_board(
  no int not null,
  title varchar(255) not null,
  content text not null,
  writer varchar(30) not null,
  cdt datetime default now(),
  vw_cnt int default 0
);

alter table pms_board
  add constraint pms_board_pk primary key(no);

alter table pms_board
  modify column no int not null auto_increment;

```

### 3단계 - DBMS를 이용하여 게시글을 저장하고 로딩한다.

- com.eomcs.pms.listener.DataHandlerListener 변경
  - 게시글 관련 데이터를 파일에서 로딩하고 파일로 저장하는 코드를 제거한다.
- com.eomcs.pms.handler.BoardAddCommand 변경
  - 데이터를 저장할 때 JDBC API를 사용한다.
- com.eomcs.pms.handler.BoardListCommand 변경
  - 데이터를 조회할 때 JDBC API를 사용한다.
- com.eomcs.pms.handler.BoardDetailCommand 변경
  - 데이터를 조회할 때 JDBC API를 사용한다.
- com.eomcs.pms.handler.BoardUpdateCommand 변경
  - 데이터를 변경할 때 JDBC API를 사용한다.
- com.eomcs.pms.handler.BoardDeleteCommand 변경
  - 데이터를 삭제할 때 JDBC API를 사용한다.
- com.eomcs.pms.App 변경
  - BoardXxxCommand 변경에 맞춰 소스 코드를 정리한다.

### 4단계 - DBMS에 회원 정보를 저장할 테이블을 만들고, 이 테이블을 사용하여 회원 정보를 관리한다.

```
create table pms_member(
  no int not null,
  name varchar(30) not null,
  email varchar(50) not null,
  password varchar(50) not null,
  photo varchar(255),
  tel varchar(20),
  cdt datetime default now()
);

alter table pms_member
  add constraint pms_member_pk primary key(no);

alter table pms_member
  modify column no int not null auto_increment;
```

- com.eomcs.pms.listener.DataHandlerListener 변경
  - 회원 관련 데이터를 파일에서 로딩하고 파일로 저장하는 코드를 제거한다.
- com.eomcs.pms.handler.MemberXxxCommand 변경
  - 데이터를 저장하고 조회, 변경, 삭제할 때 JDBC API를 사용한다.
- com.eomcs.pms.App 변경
  - MemberXxxCommand 변경에 맞춰 소스 코드를 정리한다.

### 5단계 - DBMS에 프로젝트 정보를 저장할 테이블을 만들고, 이 테이블을 사용하여 프로젝트 정보를 관리한다.

```
create table pms_project(
  no int not null,
  title varchar(255) not null,
  content text not null,
  sdt date not null,
  edt date not null,
  owner varchar(30) not null,
  members varchar(255) not null
);

alter table pms_project
  add constraint pms_project_pk primary key(no);

alter table pms_project
  modify column no int not null auto_increment;
```

- com.eomcs.pms.listener.DataHandlerListener 변경
  - 프로젝트 관련 데이터를 파일에서 로딩하고 파일로 저장하는 코드를 제거한다.
- com.eomcs.pms.handler.ProjectXxxCommand 변경
  - 데이터를 저장하고 조회, 변경, 삭제할 때 JDBC API를 사용한다.
- com.eomcs.pms.App 변경
  - ProjectXxxCommand 변경에 맞춰 소스 코드를 정리한다.

### 6단계 - DBMS에 작업 정보를 저장할 테이블을 만들고, 이 테이블을 사용하여 작업 정보를 관리한다.

```
create table pms_board(
  no int not null,
  content text not null,
  deadline date not null,
  owner varchar(30) not null,
  status int default 0
);

alter table pms_board
  add constraint pms_task_pk primary key(no);

alter table pms_board
  modify column no int not null auto_increment;




alter table pms_project
add constraint pms_board_fk foreign key(writer) references pms_member(no);

forEach 반복문대신호푸출



트렌젝션: 따로따로 해도 도ㅣ는것이 있는반면
묶여있어야하는 경우가 있다 주문할때 결제실패할경우 취소되어야하는것과 같은기능
여러기능을 하나의작업으로 묶는 과정을트렌젝션이라한다





    퍼시스턴스 프레임워크
    수정 ,삭제 변경,다루는 클래스 및 설정파일들집합
      jdbc프로그래밍 하는것을 퍼시스턴스 프레임워크가 대신해준다
      jdbc api를 호출하는 자바코드를 클래스로 만들어 제공하는것을 의미한다 
      1 sql Maper
      자바코드 -> framwork ->jdbc api -> dbms
       장점: dbms에 맞춰서 하기떄문에 성능을 극한으로 끌어올릴수 있다
      2 or MApper
      자바코드 -> framework ->jdbc api 
               |
          프레임워크 전용 질의문법
   -마이바티스







or Mapper 의 문제점
어뎁터가 없으면 안된다

    xml 에서------------------
     <![CDATA[    //
    select 
      board_id,
      title, 
      contents, 
      created_date,
      view_count 
    from x_board
    where board_id < #{haha}    // < 표시가 문법으로 오해할수잇게하는경우  <![CDATA[     ]]>   사용
    ]]>




마이바티스에서
set을 사용하면 콤마를 자동제거한다

-sql 주석  /* */ 이주석까지 포함한다
xml주석  <!-- -->

프록시 디자인 패턴





## mysql 서버에 접속하기
로컬 MySQL 서버에 접속
> mysql -u root -p
> Enter password: 암호입력

원격 MySQL 서버에 접속
> mysql -h 서버주소 -u root -p
> Enter password: 암호입력

## mysql root 암호 변경
> alter user 'root'@'localhost' identified by '1111';

## MySQL 사용자 추가
> CREATE USER '사용자아이디'@'서버주소' IDENTIFIED BY '암호';

로컬에서만 접속할 수 있는 사용자를 만들기:
> CREATE USER 'study'@'localhost' IDENTIFIED BY '1111';
  => 이 경우 stidu 사용자는 오직 로컬(서버를 실행하는 컴퓨터)에서만 접속 가능한다.
  => 다른 컴퓨터에서 실행하는 MySQL 서버에 접속할 수 없다는 것을 의미한다.

원격에서만 접속할 수 있는 사용자를 만들기:
> CREATE USER 'study'@'%' IDENTIFIED BY '1111';
  => 이 경우 study 사용자는 원력에서만 접속 가능하다.

## MySQL 사용자 목록 조회
> select user from 데이터베이스명.테이블명;
> select user from mysql.user;

## MySQL 데이터베이스 생성
> CREATE DATABASE 데이터베이스명
  DEFAULT CHARACTER SET utf8
  DEFAULT COLLATE utf8_general_ci;

> CREATE DATABASE studydb
  DEFAULT CHARACTER SET utf8
  DEFAULT COLLATE utf8_general_ci;


  
## MySQL 사용자에게 데이터베이스 사용 권한 부여
> GRANT ALL ON 데이터베이스명.* TO '사용자아이디'@'서버주소';
> GRANT ALL ON studydb.* TO 'study'@'localhost';










pms 12 
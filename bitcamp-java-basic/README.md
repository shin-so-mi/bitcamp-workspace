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





서블릿  api 
메서드규칙에 따라서어풀리케이션 서버를 만들거나 서버에서 실행되는 프로그램을 만들거나
어플리케이션 서버 <=> 어플리케이션
우리는  톰켓서버가 실행하는 서블릿을 만든다 (자바를통해)
자바 EE구현체 서버 (큰 기술집합
웹기술(서블릿,jsp) ,분산 ,관리보안기술

서블릿컨데이너 <=> 자바이이구현체
톰켓서버는 다불가능하지만 제우스는 전부가능하다



오늘한것
서블릿 에노테이션으로 배포하는방법

엑스엠엘로 배포하는방법 


서블릿의 원리

서블릿 인터페이스를 구현해서만들어야한다
5개의 메서드를 전부 구현해야한다
5개는 너무귀팒으니까
 제네릭 서블릿을 만들엇다
 제네릭 서블릿을 상속받은 http 서블릿을 상속받ㅇ사용한다

 그래야만 관련된 프로토콜 기능을 다룰수가 있다

 결론 do get을 바로 호출하는것은아니다(http 를 통해서 이기에)

01 
서블릿 
필터 리스너 
서블릿을 만드는방법을 나옴

02 
옵저버 패턴 
바뀔때마다 보고하는것




이미지출력을 위해 했을떄
 화면에 뜨지않고 다운로두가 뜨면  오타가 분명하다!
 마인 타입확인하기!
 어떤타입인지




* JDK설치 순서 및 필요도구 

1.JDK 
  - [GraalVM] 
  
2.Main IDE
  - [Eclipse]

3.보조 IDE
  - [VScode]
  - Sublime
  
  ----------------------------------- 여기서 부터는 패키지관리자(리눅스 apt/apt-get, 윈도우 scoop,쪼꼴렛뜨)를 이용
  
4.형상관리시스템(Software Configure Manigement System)
  - [git]

5.Build Tool
  - [Gradle]
  
6.DBMS
  - [MariaDB]

7.Application sever 
  - [Tomcat]
  
 - 다운로드 사이트
(openJDK.java.net, graalvm.org,mingw,VisualStudio(편집기), Eclipse.org, tomcat.apache.org, mariaDB)



************************************************************************************************************
************************************************************************************************************


[Visual Studio 설치]
- jdk.java.net 접속한다.(JDK설치)
- java se 11 > windows java development kit
- 다운로드 후 더블 클릭하여 설치한다.
- Extensions dptj hexdump for VScode 설치
- Sublime Text 필요시 설치(https://www.sublimetext.com/) 

[JDK 설치] 
- graalvm 다운로드 및 압축 해제
  > graalvm.org>graalvm-ce-java11-windows-amd64-20.1.0.zip
- OS에 JDK 설치 경로를 등록
  - OS 환경변수 설정창 열기 (#시스템환경변수편집)
  - JAVA_HOME이라는 이름으로 JDK 설치 경로 등록 
- OS에 JDK 도구 폴더 등록
  - PATH 라는 환경변수에 java.exe, javac.exe 등이 있는
  폴더를 등록해두면 아무곳(디렉토리)에서나 실행할 수 있다.
  (C:\devtools\graalvm-ce-java11-20.1.0\bin)

-----------------------------------------------------------------------------------------------------------------------------

  # 시스템 환경 변수 편집
       - 환경 변수 설정
         (제어판>시스템환경변수편집>시스템변수>PATH>환경변수편집>새로만들기>경로지정(C:\devtools\graalvm-ce-java11-20.1.0\bin))
       - 환경 변수 확인( PowerShell )
         java.exe -version : 설치가 잘 되었는지 버전 확인
         echo $env:JAVA_HOME : 설치가 잘 되었는지 경로 확인
         echo $env:PATH : 설치가 잘 되었는지 경로 확인

   **[시스템 환경변수 설정]**

      [bitcamp(프로젝트폴더?)에 대한 사용자 변수]
      - path : c:\User\bitcamp\scoop\app\nodejs\current\bin
          c:\User\bitcamp\scoop\app\nodejs\current
          c:\User\bitcamp\scoop\shim

      [시스템 변수]
      - JAVA_HOME : C:\devtools\graalvm-ce-java11-20.1.0
      - Path : C:\devtools\graalvm-ce-java11-20.1.0\bin
          C:\devtools\apache-tomcat-9.0.37\bin
          C:\program Files\MariaDB 10.5\bin
          C:\program Files (x86)\mingw-64\i686~~~~~~~

----------------------------------------------------------------------------------------------------

[Eclipse IDE(Integrated Development Environment) 설치]
- 다운로드 및 설치
- 이클립스 실행
    - 워크스페이스 디렉토리 설정
    - c:\Users\bitcamp\eclipse-workspace
- 이클립스 IDE 설정
    - Window > Preferences 메뉴 선택
    - General > Editors > Text Editors 선택
        - 탭 크기 : 2 (Displayed tab width)
        - 탭 대신 공백 삽입 (Insert spaces for tabs)
        - 한 줄 100칸 (Print margin column;)
        - 공백 문자를 특수 기호로 표시하기 (Show whitespace characters)
    - General > Workspace 선택
        - Text file encoding : UTF-8
    - Java > Installed JREs 선택
        - graalvm-ce-java11 [add > Standard VM]
    - Java > Code Style > Formatter 선택
        - https://github.com/google/styleguide 사이트 방문
        - eclipse-java-google-style.xml 파일 다운로드
        - import 버튼 클릭 > 이 파일을 import 한다.
          
    
[scoop 패키지 매니저 설치]
- scoop.sh 사이트 방문
- 안내에 따라 설치한다. (#인터넷,PowerShell.txt 참조)
- https://log-laboratory.tistory.com/14 참고

   [fileshell 환경]
    iwr -useb get.scoop.sh | iex 입력
   안되면 Set-ExecutionPolicy RemoteSigned -scope CurrentUser 입력
 - 명령어 
    scoop, scoop list, scoop search git, scoop install git

[git 형상관리도구 설치]
- scoop install git 실행
- git --version 설치 확인

[gradle 빌드도구 설치]
- scoop install gradle 실행
- gradle --version 설치 확인

[Tomcat 설치]
- c:\devtools 폴더에 압축을 푼다.
- PATH 환경변수에 bin 폴더를 추가한다. (아래 환경변수 설정 참고)

[MariaDB 설치]
- 다운로드 및 설치
- 사용자 생성
- 데이터베이스 생성
- 사용자가 사용할 데이터베이스의 권한 설정
- 테이블 생성
- 예제 및 마스터 데이터 입력

[Compiler 설치]
- http://mingw-w64.org/doku.php/download/mingw-builds 사이트 방문
- Souceforge 클릭하여 mingw-w64-install.exe 파일 다운로드 및 설치
- PATH 환경변수에 bin 폴더를 추가한다.
- gcc -v 설치 확인


[작업 폴더를 git 서버에 업로드 하기]
- github.com 에 회원 가입 및 로그인
- git 저장소 생성
- 로컬 작업 폴더를 git 저장소로 준비하기
    - > git init : .git 이 생성된다.
- git 저장소에 백업하지 않을 대상을 설정하기
    - .gitignore 파일에 작성한다.
    - 직접 대상을 지정하는 것은 번거롭다.
    - gitignore.io 사이트의 도움을 받는다. 또는 다른 작업파일에서 복사붙여넣기
- 현재 작업 파일을 백업 관리 대장에 등록하기 
    - > git add .  <= 현재 폴더 및 모든 하위 폴더 포함
    - > git status : 포함이 제대로 됐는지 확인
- 사용자 정보 설정하기
  > git config --global user.name KimYuah : 이름 지정
  > git config --global user.email www0157@naver.com : 이메일 지정
  > git config --list : 사용자 정보가 제대로 설정되었는지 확인
- 백업 관리 대장에 등록되어 있는 파일을 백업하기
    - > git commit -m "초기 백업" : 초기백업이라는 백업정보로 commit 됨
    - .git/ 디렉토리에 변경 내용이 저장된다.
- 업로드할 서버 저장소의 위치를 설정한다.
    - > git remote add origin https://github.com/eomjinyoung/bitcamp-20200713.git
- 로컬 저장소에 백업한 것을 서버에 업로드하기
    - > git push -u origin master : github 로그인(ID, PW)창이 나오면서 업로드 된다.
    
    
[강사님 강의자료 내PC에 가져오기]
*https://github.com/eomcs
*https://github.com/eomjinyoung : 원하는 경로 설정(PS C:\Users/bitcamp/git)
> pwd : 현재 경로 확인
> dir : 현재 경로 내용 확인
> git clone https://github.com/eomjinyoung/bitcamp-20200713.git
 : git clone git파일주소 -> 사이트의 git파일을 설정한 경로에 가져오기
> dir : 현재 경로에 가져왔는지 확인
> cd bitcamp-20200713 : 업데이트 된 폴더로 이동
> git pull : 업데이트 된 내용 가져오기

--------------------------------------------------------------------------------------------------

[데이터베이스 사용하기]
- mysql -u root -p : 로컬 mySQL 서버에 접속  
 > Enter password : 지정한 암호(1111) 입력하면 접속 됨
   #> CREATE USER 'study'@'localhost' IDENTIFIED BY '1111'; : 로컬에서만 접속할 수 있는 사용자를 만들기
   #> select user, host from mysql.user; : MySQL 사용자 목록 조회
   #> CREATE DATABASE studydb
      CHARACTER SET utf8
     COLLATE utf8_general_ci; : 데이터베이스 생성 
- show databases; : 데이터베이스가 제대로 설정되었는지 확인
- quit or exit : 나가기
 - mysql -u study -p : 지정한 데이터베이스 접속
 - use studydb; : 기본으로 사용할 데이터베이스 지정하기
   ( MariaDB [(none)]> 에서 MyriaDB [studydb]로 바뀜)
 - show tables; : 생성된 테이블 확인








************************************************************************************************************
************************************************************************************************************





★★★★★★★★리눅스개발환경만들기★★★★★★★★ 리눅스 14번



[리눅스 설치]

- USB 드라이브 만들기
  - RUFUS 3.11 Uhttps://rufus.ie/
    - 파티션 방식 GPT 설정 
    - 대상시스템 UEFI 설정
    - 파일시스템 NTFS 설정
- msinfo32 > bios모드확인 후
  UEFI로 되어있으면 rufus의 파티션방식을 GPT 레거시로 되어있으면 mbr 
- 디스크 파티션 나누기, 최소 50GB 이상, 
  변경 후 화살표 위아래 한두번만 클릭하면 저절로 값에맞게 변경해줌

---------------------------------------------------------------------------

# sudo : 슈퍼유저 do , 관리자권한으로 실행하라

[비주얼스튜디오]
- code_1.47.2-1594837870_amd64.deb (리눅스에서는 deb가 설치파일)
https://code.visualstudio.com에서 다운로드

* git 설치까지 다 하면 워크스페이스추가한 후 워크스페이스 저장
(git, bitcamp-workspace,bitcamp-java-project 등)

----------------------------------------

[깃 설치하기 1]
sudo apt list
sudo apt search git
sudo apt install git

#apt : 패키지관리자 , 윈도우에서 scoop과 같은 역할

--------------------------------- 

[한글 설정 ]
- 한글 입력이 안되는 경우 (된다고해도 통일)
터미널창에서 > sudo apt-get install uim uim-byeoru
메뉴에서 input 친 후 uim 설정하기

---------------------------------

[jdk 설치하기]
sudo apt install openjdk-11-jdk

java -version : 자바 버전 확인
javac -version	: 자바 컴파일러 버전확인
echo $JAVA_HOME : 환경변수 확인
which javac : javac 위치확인
ls -al /usr/bin/javac : 리스트 
cd etc 
cd alternatives/
ls -al
usr : 기본적으로 운영체제
[https://linuxize.com/post/install-java-on-ubuntu-20-04/#installing-openjdk-8 참고]
pwd : 경로 확인
sudo apt update
sudo apt install openjdk-8-jdk : jkd 8버전 설치
javac -version : 버전 확인
sudo update-alternatives --config java : 위치정보가 나옴(자동), 엔터치면 현재 상태선택 [엔터선택함]
sudo nano /etc/environment :
- 엔터친 후 사이에 JAVA_HOME="/usr/lib/jvm/java-11-openjdk-amd64" 입력
- (컨트롤=^) ^o 누른 후 엔터
  (검색해서하세요 그때그때 달라지니까)
nano란 편집기, 에디터같은것.
source /etc/environment : 자바 홈 세팅
echo $JAVA_HOME : 확인

---------------------------------------------------------------------------

[GRADLE 설치하기] - gradle-6.5.1-bin.zip

 sudo apt install gradle : 설치
 [https://gradle.org/install/ 참고] 버전 6.5.1
 
 sudo mkdir /opt/gradle : 관리자 권한 획득하여 opt/gradle 폴더 생성
 sudo unzip -d /opt/gradle gradle-6.5.1-bin.zip : /opt/gradle 경로에 zip파일풀기
 cd /opt/gradle/gradle-6.5.1/ : 경로이동
 ls : 압축 풀렸는지 확인
 cd 홈폴더로간다
 sudo nano /etc/environment : 환경설정수정
 > JAVA_HOME="usr/lib/jvm/java-11-openjdk-amd64"
 PATH="/opt/gradle/gradle-6.5.1/bin:/usr/local/sbin:/usr/local/bin:/usr/sbin:/us" 
 >ctrl+o 수정한 내용 저장 후 엔터 나가기
 source /etc/environment : 환경설정 수정
 gradle --version : 6.5.1 버전이 맞는지 체크 
 gradle --version : 버전 확인 4.4.1로 되어있음. 6.5.1을 쓴다
https://gradle.org/ 들어가서 다운로드 누르고 binery 선택 후 다운
버전 낮은거 설치했을 때 
sudo apt remove gradle : gradle 제거

-----------------------------------------------------------------------------

[git 설치하기 2]

깃허브에 있는 워크스페이스 가져오기
git clone https://github.com/KimYuah/bitcamp-workspace.git
git clone http://github.com/KimYuah/bitcamp-java-project.git
ls -l : 잘 받아졌는지 확인

mkdir git : git 폴더만들기 (읽기전용eomcs받을때)
pwd : print working directory 현재경로확인
git clone https//github.com/eomjinyoung/bitcamp-20191202.git 다운로드
다운로드 폴더로 이동 후
mkdir /opt/gradle 입력 > 안되면 sudo mkdir /opt/gradle : 디렉토리생성
sudo unzip -d /opt/gradle gradle-6.5.1-bin.zip : 알집파일 풀기
cd /opt/gradle/gradle-6.5.1
ls

cd 홈으로 돌아온 후
 sudo nano /etc/environment: 환경변수 전체적 추가
 /opt/gradle/gradle-6.5.1 삽입
 (ex : PATH="/opt/gradle/gradle-6.5.1/bin:/usr/local/sbin:/usr/local/bin:/usr/sbin:/us) 
 저장 후 엔터 
 source /etc/environment 입력 후 gradle --version 확인

 - 추가 클론 (총 8개)
 * cd git 입력 후
 - git clone https//github.com/eomjinyoung/bitcamp-20191202.git 앞에서 다운로드 했음
 - git clone https://github.com/eomcs/eomcs-docs.git
 - git clone https://github.com/eomcs/eomcs-java-basic.git
 - git clone https://github.com/eomcs/eomcs-java-project-2020.git
 - git clone https://github.com/eomcs/eomcs-java-web.git
 - git clone https://github.com/eomcs/eomcs-java-web-library.git
 - git clone https://github.com/eomcs/eomcs-java-webmvc.git
 - git clone https://github.com/eomjinyoung/bitcamp-20200713.git

 * ls -l 입력 후 전부 받아졌는지 확인
 
 
-----------------------------------------------------------------------------

[이클립스]

http://eclipse.org/ 들어가서 daum kakao 선택 후 다운로드
- 오른쪽마우스 클릭 후 현재 폴더에 압축풀기 실행
- 두번째메뉴 IDE enterprise 선택 java 11 버전 확인 후 인스톨

- 이클립스 실행할 때 이클립스>jee-2020-06>eclipse>eclipse 들어가서 실행


-----------------------------------------------------------------------------

[톰캣]

http://tomcat.apache.org/ 들어가서 9버전 누르고 zip 파일 다운




------------------------------------------------------------------------------
 
 [Shell] 
 리눅스 현재 쉘 $ Shell
 * Shell script => bon again shell, Gshell, omyshell
 
 * zsh 설치 : ( https://tutorialpost.apptilus.com/code/posts/tools/using-zsh-oh-my-zsh/ 참고)
  - sudo apt install zsh : zshell을 설치
  - sudo -s : 관리자권한으로 명령을 시작하겠다 $에서 #으로 바뀜
  - chsh -s /bin/zsh root : 루트 기본 shell zsh로 변경, z쉘은 %로 시작
  - chsh -s /bin/zsh username(=>bitcamp) : : 사용자 기본 shell zsh로 변경
  # chsh => change the shell, : 쉘을 바꾸겠다.
  - echo $SHELL : shell 확인
  
  * oh-my-zsh 설치	 
  - sudo apt install curl : oh-my-zsh 설치
  - sh -c "$(curl -fsSL https://raw.githubusercontent.com/robbyrussell/oh-my-zsh/master
    /tools/install.sh)" : curl 
 
 * JAVA_HOME을 찾는 방법과 JAVA_HOME, PATH 추가 방법
  - echo $JAVA_HOME : JAVA_HOME 변수설정확인
  - sudo update-alternatives --config java 
    : /usr/lib/jvm/java-11-openjdk-amd64 까지 경로 복사
  - nano .zshrc : 터미널에 입력 후
    맨위에 export JAVA_HOME="/usr/lib/jvm/java-11-openjdk-amd64" : 자바홈 추가
  - PATH 설정도 안돼있을 경우
    : 주석 없앤 후 export PATH=$JAVA_HOME/bin:$HOME/bin:/usr/local/bin:$PATH 변경
  - 이후 JAVA_HOME을 PATH 위로 옮긴다. 저장(ctrl+o) 후 나가기(ctrl+x)
  
  # nano 파일명 : 편집하고 싶은 파일 변경  
  # Tree : 지정한 폴더의 하위 폴더들과 파일들을 한번에 보여준다
   - 트리 설치 방법 : sudo apt install tree

  # rm -rf bitcamp-java-project : 해당 프로젝트 지우기
   : rm 지운다
   :-f 따라가서 지운다
   :-rf 반복해서 따라가서 지운다
   
  # mkdir bitcamp-java-project : 프로젝트 생성
  # gradle init : 해당 경로에 들어가서 입력해야함.
  # resources 안에 아무것도 없으면 업로드가 안된다. README.md 만들어주기
  # gradle run : run이라는 task를 실행한 결과
  # gradle build : distribution에 tar와 zip파일이 생성된다. 
  # tree : 만들어졌는지 확인
  
  * shellscript file : 프로젝트안에 build안에 distributions안에 bin 폴더 안에 있다.
    
-----------------------------------------------------------

 [ gradle 파일받았을 때 실행 하는 방법 ]
  # cd build : 빌드 경로로 들어감
  # ls : distributions 있는 지 확인
  # cd distr* : 디스트리뷰션 경로로 들어감
  # tar -xvf *.tar : 설치
  # ls : tar, zip 파일 있는지 확인 
  # cd bin : 빈 경로로 들어감
  # ./bitcamp-java-project : Hello world 가 출력되는 걸 확인할 수 있다. 

  # gradle 프로젝트 이클립스에서 실행하기
   - 해당 프로젝트 경로로 이동
   - gradle eclipse
   - 인식이 안될 경우 id eclipse 추가한다
   - import할 때 gradle 디렉토리에서 불러오기
 ---------------------------------------------------- 

* 저장소 안에 저장소 만들면 안된다. (=> bitcamp-workspace가 저장소이다.)

* bitcamp-workspace = 저장소
  - bitcamp-java-basic = 각각 문법에 대해 자세하게 예제로 배우기
  - bitcamp-java-project = 문법 적용한 것 응용하여 구현해보기, 버전 업하면서 끝까지간다.
  - bitcamp-web = 예제

* gradle 에서 이클립스 도구툴을 만들 수 있다.
------------------------------------------------------

[이클립스 설정]
*이클립스 띄울 때
home - Users - eclise-workspace

*이클립스 폰트설정 
- d2coding < 설치
- windows > preferences > appearance > colors and font 
      > basic > text font > edit누른 후> D2coding 레귤러
      * D2coding 압축해제 후 d2coding 폴더에서 2가지 ttf설치

- eclipse java google style fommater 
다운로드- (https://raw.githubusercontent.com/google/styleguide/gh-pages/eclipse-java-google-style.xml)      

* No projects are found to import
: 프로젝트 폴더에 이클립스 용 프로젝트 정보 파일이 있어야만 임포트 할 수 있다.
  이클립스 정보 파일이 없을 경우 gradle 도구를 이용하여 프로젝트 폴더에 이클립스가 사용할 설정파일을 만든다.
  해결 방법
  - build.gradle파일의 플러그인[]안에 'eclipse' 플러그인을 추가한다.
    ex) id 'eclipse'
  - 터미널에서 gradle eclipse 실행

* window > showview > navigator 탐색기 있는 그대로 보여준다.
  - ex.gradle, bin, setting 폴더 같은 것들, 작업자에게 필요없는 폴더들을 보여준다.

*화이트스페이스 = 블랭크를 눈에 보여주는 것, 엔터,탭,스페이스 다 포함

*벡터폰트 = 트루타입폰트, 출력속도가 느리다
*비트맵폰트 = 출력속도가 빠르다,래스터

* 'A' => 10진수 65 , 16진수 0041 
  - 'A' + 1 = 66
      ↖ A라는 값에 유니코드(2바이트)를 리턴한다. UTF-8은 3바이트


* 자동완성 자동입력 키가 달라서 바꿔줌
windows > preferences > general > keys > content 찾아서 binding ctrl+space 로 바꿈




* 이클립스 즐겨찾기 추가하기
터미널창에서 명령어 입력
(sudo ln -s /opt/eclipse/eclipse /usr/bin) - 꼭 해야하는지 잘 모르겠음.
nano ~/.local/share/applications/프로그램명.desktop

[Desktop Entry]
Comment=Eclipse
Terminal=false
Name=Eclipse
Exec=/path/to/your/version/eclipse/eclipse
Type=Application
Icon=/path/to/your/version/eclipse/icon.xpm
StartupWMClass=Eclipse

어플리케이션에서 이클립스 검색 후 즐겨찾기 추가




* 이클립스 저장할 때 자동 정렬 하기
- window > preferences > java > Editor > Save actions > configure 버튼을 누른 후
  Code Organizing 탭에서 Correct Identation 체크 후 apply




** 이클립스에서 마우스 갖다댔을 때 설명이 안 나올 경우 (source attached)
 - 워크스페이스 오른쪽클릭 > properties > JAVA build path > library 탭 > java rmi > 
    source attachment 확인
 - 터미널에서 sudo apt-get install openjdk-11-source 입력
 - window > preferences > java > installed JREs > java open jdk 선택 후 Edit 
   > External location > external fiel 선택 > 자동경로 생성되거나 안되면 src.zip 선택 후 apply



* 클래스 인식이 안될 때 - 네비게이터가서 빈파일들어가서 해당 클래스파일 있는지 확인 없을 때
1) cd bitcamp-workspace/bitcamp-java-project : 해당경로로 이동
2) gradle clean : 원래 있던 빌드 지우기
3) gradle cleanEclipse : 이클립스 설정 파일지우기
4) gradle Eclipse : 다시 생성
5) 이클립스 돌아와서 리프레시
6) 네비게이터 가서 빈파일에 클래스 생성됐는지 확인



* ExERD 다운로드
    이클립스 -> help -> install new software -> add 버튼클릭 -> exerd 대충이름지정 -> 웹사이트(http://en.exerd.com/), 영어버전
    -> eXERD v3.X(이클립스플러그인)http://exerd.com/update/3.x 주소복사 -> 이클립스돌아와서 로케이션에 입력 후 add 
    -> Contact ~ software(체크하면속도가느리다) 체크박스선택해제 -> 추가한 거(exerd) 체크박스선택 후 계속 next -> 동의 후 finish -> 의견 묻는 창 나오면 무조건 yes




---------------------------------------------------------------------------------------------------------------





[ mariaDB 설치 ] _Linux_ 강의61 파일에도 설명있다. 먼저 볼 것.
> sudo apt update
> sudo apt install mariadb-server
> sudo systemctl status mariadb
  - end 뜨면 q를 누르면 화면에서 나가진다.
> mysql -V

    -> 여기서 Access denied for user 'root'@'localhost' 에러 발생하면, 

  > sudo mysqld_safe --skip-grant-tables
   : 안전모드로 서버 일단 실행 함.

> ( 새 창 열어서 )
> 창2 : sudo mysql -u root -password
> 창2 : MariaDB [(none)]> UPDATE mysql.user SET plugin = 'mysql_native_password' WHERE user = 'root' AND plugin = 'unix_socket';
> 창2 : MariaDB [(none)]> FLUSH PRIVILEGES;
> 창2 : MariaDB [(none)]> exit
> 창2 : (MariaDBdptj exit 되면)
> 창2 : ps -el | greb mysql

EX)
4 5   0     9710      9709      0      80      0 -      652 -        pts/0  ~~~~~
4 5   126   9830      9710      0      80      0-      443929 -
> 창2 : sudo kill 9830
> 창2 : sudo kill 9710 (현재 포트를 다 죽인다.)

> (원래의 창으로 돌아와서)
> service mariadb Start
 : 정상적으로 mariaDB가 실행되는지 확인한다.
> sudo mysql -u root -q
 : 정상적으로 mysql 계정 접속이 되는지 확인한다.
 => MariaDB [(none)]>



---------------------------------------------------------------------------------------------------------------


[톰캣 설치]
https://tomcat.apache.org/ 
- 9.0.40버전 binary~ zip파일 다운로드 

[리눅스]
 - 사용자폴더 > server > 아파치 4.0 > bin~~~ 압축푼다
 - 시작할 때 ./startup.sh
 - 실행이 되지 않으면 권한을 줘야한다.
   chmod 754 *.sh
 - ls -al 명령으로 권한 확인 가능
 - 설치가 잘됐는지 확인
   브라우저에서 확인한다. http://localhost:8080/
   고양이가 뜨는지 확인.
 - 끝낼 때 ./shutdown.sh

[윈도우]
 - 사용자폴더 > server > 아파치 4.0 > bin~~~ 압축푼다
 - 해당 폴더에 들어가서 startup.bat 파일을 연다.
 - 설치가 잘됐는지 확인
   브라우저에서 확인한다. http://localhost:8080/
   고양이가 뜨는지 확인.(startup.bat파일을 닫으면 안된다. 닫으면 종료)
 - 종료할 때는 startup.bat 파일을 그냥 닫으면 된다. 
   또는  shutdown.bat 누르면 그 즉시 종료


* 톰캣 서버의 위치를 이클립스에 등록
 - 이클립스 메뉴 > Window > Preferences > Server > runtime environments > add 버튼 클릭 
   다운로드한 아파치 버전 선택 > 아파치디렉토리등록 > jre(Workbench~) >  피니쉬


* 톰캣 서버 실행환경 구축. 새 서버 등록하기
  - 콘솔창에서 서버탭이 안보이면 window > show view > servers .
  - No servers  are available. Click~~~~~~~ 누른다.
  - server name을 입력한다. (study project server)
  - 피니쉬를 누르면 프로젝트 익스플로러에 servers가 생성된다
  - servers 뷰에서 스타트 버튼을 눌러 서버를 실행시켜본다. 

* 이클립스 프로젝트폴더를 웹 프로젝트로 전환하기
  - 해당 프로젝트의 build.gradle 파일들어가서 
     plugins에 id 'eclipse-wtp' 와 id 'war'를 추가한다.
  - search.maven.org 홈페이지로 들어간 후 서치에서 javax.servlet-api 검색한다.
    최신버전으로 들어가서 gradle groovy DSL 코드 복사한다.
    (현재 4.0.1버전 implementation 'javax.servlet:javax.servlet-api:4.0.1')
  - 해당 프로젝트의 builde.gradle 파일 들어가서 dependencies 에 붙여넣는다.   
    이 때 implementation -> compile로 바꾼다.
    ex)
     // servlet-api 라이브러리
     compile 'javax.servlet:javax.servlet-api:4.0.1' (버전따라 계속 바뀐다)
  - 커맨드 창에서 gradle cleanEclipse 로 깨끗하게 설정파일을 지운 후
    gradle eclipse 한다.(=이클립스 웹 프로젝트와 관련된 설정파일생성하고 의존 라이브러리를 가져오는것)
  - 이클립스에서 refresh 하면 아이콘에 지구본이 붙는다. 
    그때 부터는 웹 프로젝트가 된다.

* 웹 프로젝트를 톰캣 실행 환경에 등록
- 이클립스 > Server 뷰 >  해당 서버 선택 후 오른쪽클릭 
  > add and remove 선택 > 지구본 붙은거 확인하고 클릭해서 add 하고 피니쉬
- 리스타트
  (만약 콘솔창에서 에러뜨면 에러난 것. 내용을 잘봐라.
   started라고 떴다고해서 제대로 실행된 것이 아니다. 콘솔창 확인!)


------------------------------------------------------------------------------------------------------------------


* 팀프로젝트!!! *

 1) Github에서 팀원 중 한명이 공유할 리파지토리를 먼저 생성한다.
    - Add a README file
    - Add .gitignore 선택 (새로 고침해도 Create 생성안되면 체크 해제)
 2) 맨 마지막 줄 마스터 세팅 들어가서 main으로 업데이트 한다.
    (리파지토리를 잘못 만들었을 경우 세팅스에서 삭제한 후 다시 생성)
 3) 리파지토리를 생성한 후 settings에서 Manage access 탭 선택
   - Invite a collabora 클릭해서 협력자(ID) 초대한다.
 4) 리파지토리를 컴맨드창에서 git clone으로 리파지토리를 복제한다.
 5) 리파지토리 폴더를 자바 프로젝트 폴더로 만들기
    - 컴맨드창에서 해당 프로젝트 들어간 후 gradle init
    - 다른 프로젝트에서 .ignore 파일 복사하여 리파지토리 폴더에 복사붙여넣기
 6) 초기 프로젝트 파일을 서버에 올리기
    - 'git add .' : 백업할 목록 작성
    - 'git commit -m "초기프로젝트"' : 작업 내용 백업
    - 'git push' : 서버에 업로드
    - 'git pull' : 나머지 팀원들은 서버에 업로드 한 내용으로 로컬 저장소를 갱신한다.
 7) gradle build script 파일 변경
    - eclipse 설정 파일을 생성할 수 있도록 gradle 플러그인 설정
 8) 이클립스 IDE로 프로젝트를 import 하기
    - 'gradle eclipse' : 이클립스용 설정 파일 생성 (각자 해당 프로젝트 경로에 들어가서 실행해야한다.)
 9) 팀 프로젝트 이클립스에서 당겨오기
    - 공유하고 있는 프로젝트에서 오른쪽마우스버튼 누른 후 contextBox에서 Team > pull
 10) 이클립스에서 add, commit 하는 방법 
    - 공유하고 있는 프로젝트에서 오른쪽마우스버튼 누른 후 contextBox에서 Team > commit 
    - push and commit : 로컬에 백업하고 서버에 까지 올리는 것
    - commit : 로컬에만 백업하는 것.
    - unstaged changes : git add . 랑 같다. staged changes로 옮기는 것.
    - staged changes : 추가된 것.
    - commit message : git commit -m "백업" 과 같다.
    - push : git push 와 같다. preview 누른 후 깃ID, 토큰암호 입력하면 서버에 올라간다.
 11) 오리지날 암호를 보호하기위해 임시적으로 특정상황에서 쓸 암호를 설정
    - your profile > settings > personal access tokens > New personal access token > repo 체크 > 토큰 생성
      주의!!!! 토큰은 한번 발급되면 재발급 안됌 조심. 기존 토큰 알 수 있는 방법이 없으니 메일에 꼭 저장해놓을 것
 12) 이클립스 토큰으로 푸시 안 했을 경우
    - security > secure storage > contents 탭 > git 선택 후 delete > apply and close
    - 혹시 push head가 안나올 경우 git repository에서 오른쪽버튼 git origin 에서 로그인창에서 푸시하면 된다.
 13) 이클립스 동시에 푸시해서 에러가 났을 경우 충돌 해결하는 방법
    - 이클립스에서 pull한다.
      (주의!! pull로 당기려면 내가 먼저 작업하던 걸 commit을 먼저 해야한다. 그 다음에 pull 해야 한다.)
    - 다른 팀원이 먼저 푸시해서 거절되어 에러 떴을 때 코드를 손수 편집한다. 
      ( === 이퀄기준으로 위쪽은 내 것. 아래는 서버에 있는 것.)

         * 편집 후 String cannot be resolved to a type 에러가 떴을 때 비주얼스튜디오랑 충돌돼서 그렇다.
         컴맨드 창에서 gradle cleanEclipse > gradle clean > gradle eclipse > refresh 한다.
         그래도 안 될 경우 project explorer에서 JRE System Library에서 설정파일(ex.java.base가 있는지 확인)이 제대로 되어있는지 확인한다.
         없으면 프로젝트 폴더에 들어가서 .gradle, .settings, bin, .classpath, .project 강제로 지운다.
         컴맨드 창에서 gradle eclipse만 다시 하고 refresh 하면 된다.
         그래도 안 될 경우 window > preferences > java > installed JREs을 눌러 제대로 되어있는지 확인한다.
         잘 되어 있을 경우 java > compiler 가 11버전인지 확인한다.
         잘 되어 있을 경우 프로젝트누르고 properties > java build path > Libraries > jre가 잘 잡혀있는지 확인
         경로 설정이 잘못되어있으면 다시 환경변수 설정을 다시 한다.)
    
    - 충돌 편집한 것을 백업해야한다. add > commit(로컬백업) > push(서버백업)
      (주의! pull할 때도 commit 한 후 pull 해야한다.)
  14) 충돌 해결할 때 보기 편한 방법
    - 프로젝트 선택 후 오른쪽마우스 눌러 컨텍스트창을 띄우고 team > Merge Tool 선택하면 변경한 목록들이 나온다. 
      두 개의 화면으로 나온다. 편하게 편집하면 된다.
      (단, 꺽쇠가 나와야 Merge Tool을 사용할 수 있다.
       꺽쇠가 나오려면 기존 있던 코드를 변경하거나 지워야 나온다.
       그냥 다른 곳에 새로 추가만 하면 꺽쇠는 안 생김. 즉 덧붙이는 게 아니라 충돌이 일어나야 함)
  15) 리파지토리 복제하는 방법 깃허브닷컴에 해당 리파지토리에 가서 FORK를 누른다.

    
   



11-30

get요청
링크를 누르는것이 겟 요쳥이다
웹브라우저가 나를 대신해서 요청한다
입력폼의 타입이 겟인강태에서 값을 집어넣으면 겟요청이다 
post요청하려면 집접 집어넣어야한다
겟이나 포스트는 값을 꺼내는것이 똑같다
보내는건 다르다
 메소드에다가 포스트라고 명시해야한다
 겟요청은 파일을 업로드할수 없다
 파일의 타입은 무조건 file로 해야한다  (type="file")
 
 웹브라우저가(html) 사용하는경로의  슬레시는 무조건 서버 경로이다  
 서블릿안에서 서블릿컨테이너가 사용하는 루트는 컨텍스트 루트이다 (어플리케이션)
 포스트는 헤더정보가 있다
  겟 포스트 둘다 서버에 파일이 보내진,ㅡㄴ게 아니라파일 이름만 보내지는거다
멀티파트 폼데이터 형식으로 보내야 한다
서블릿에서 멀티파트데이터 형식을 처리하지못하는경우는 아파치에서프로그래밍 작성을 제공)
파일을 보내려면 포스트타입으로 인코딩을 멀티 폼 데이터로 작성

서블릿리퀘스트 -> 샌드파일ㅇ업로드 ->

파일을 저장할떄 데이터 베이스에는 원본파일만 저장한다 
원본 에다가 파일의 크기를 다시지정해서 




web-project ex04 servlet 06
     String genre6 = req.getParameter("genre6"); 다른값으로 넘어가는 코드ㅡ

 web-project ex04 servlet 06-2
 String[] genres = req.getParameterValues("genre"); 같은값넘어오게하는 코드 

)




서즐릿 콘텍스트는 (ex 보드서비스,맴버서비스 ,프로잭트 서비스)
전체끝날떄까지 한다

httpsession는 특정 클라이언트 전용 객체를 저장)서블릿을 몇번 실행하더라도 같은고객이면 정보를공유하고싶어서 
servletRequest는 요청을 처리하는동안 공유할객체  (집전화 버스정류장 ,  )


이듀가지를 전부 담고 있는것은 서블렛 콘텍스트이다

리프레시와 서블릿끼리 공유 는 안됌
리퀘스트는 요청이들어올때 생성되고 사라지는
리프레쉬는 그다음서블릿에 대해서 서블릿 요청을  한다 (객체가 새로 만들어지고 응답할때까지 유지되는데 여기서 리프레싀나 리다이랙트 할떄 새로요청이 들어가기때문에 이전서블릿에서 실행한값을 담을수 없다 
)


서블릿끼맃 데이터를공유하고 샆다면 http세션ㄹ에넣는다




출력문작성하는것이 너무번거로워서, jsp가 나타난것이다 개발자 대신 출력문 작성을 해]준다
(print.out이런것을 대신해서 해줌 )
\



jsp는 서블릿을 인터페이스한 자바코드를 만들어서  자바코드안 서비스 메서드를 실행한다 
결론으론jsp 서비스호출

- JSP 엔진의 역할을 JSP 파일을 분석하여 서블릿 클래스를 생성하는 것이다.
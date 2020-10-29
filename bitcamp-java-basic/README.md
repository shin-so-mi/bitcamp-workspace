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

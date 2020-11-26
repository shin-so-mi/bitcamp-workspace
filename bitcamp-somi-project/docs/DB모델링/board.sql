-- 게시글 정보
DROP TABLE IF EXISTS cms_bList RESTRICT;

-- 사원
DROP TABLE IF EXISTS cms_worker RESTRICT;

-- 권한
DROP TABLE IF EXISTS cms_auth RESTRICT;

-- 댓글 정보
DROP TABLE IF EXISTS cms_cmtInfo RESTRICT;

-- 일정
DROP TABLE IF EXISTS cms_calender RESTRICT;

-- 게시판
DROP TABLE IF EXISTS cms_board RESTRICT;

-- 게시글 정보
CREATE TABLE cms_bList (
  bNo      INTEGER     NOT NULL COMMENT '게시글번호', -- 게시글번호
  bNo2     INTEGER     NOT NULL COMMENT '게시판번호', -- 게시판번호
  wNo      INTEGER     NOT NULL COMMENT '사원 번호', -- 사원 번호
  title    VARCHAR(50) NOT NULL COMMENT '제목', -- 제목
  regiDate DATE        NOT NULL COMMENT '등록일', -- 등록일
  vCount   INTEGER     NOT NULL COMMENT '조회수', -- 조회수
  aFile    VARCHAR(50) NULL     COMMENT '첨부파일명', -- 첨부파일명
  content  MEDIUMTEXT  NULL     COMMENT '글내용' -- 글내용
)
COMMENT '게시글 정보';

-- 게시글 정보
ALTER TABLE cms_bList
  ADD CONSTRAINT PK_cms_bList -- 게시글 정보 기본키
    PRIMARY KEY (
      bNo -- 게시글번호
    );

ALTER TABLE cms_bList
  MODIFY COLUMN bNo INTEGER NOT NULL AUTO_INCREMENT COMMENT '게시글번호';

-- 사원
CREATE TABLE cms_worker (
  wNo      INTEGER      NOT NULL COMMENT '사원 번호', -- 사원 번호
  aCode    INTEGER      NOT NULL COMMENT '권한 코드', -- 권한 코드
  wName    VARCHAR(50)  NOT NULL COMMENT '사원이름', -- 사원이름
  email    VARCHAR(40)  NOT NULL COMMENT '이메일', -- 이메일
  wPhoto   VARCHAR(255) NOT NULL COMMENT '사원사진', -- 사원사진
  rank     MEDIUMTEXT   NOT NULL COMMENT '직급', -- 직급
  regiDate DATE         NOT NULL COMMENT '입사일', -- 입사일
  tel      INTEGER      NOT NULL COMMENT '휴대폰번호', -- 휴대폰번호
  gender   INTEGER      NOT NULL COMMENT '성별', -- 성별
  pwd      INTEGER      NOT NULL COMMENT '비밀번호' -- 비밀번호
)
COMMENT '사원';

-- 사원
ALTER TABLE cms_worker
  ADD CONSTRAINT PK_cms_worker -- 사원 기본키
    PRIMARY KEY (
      wNo -- 사원 번호
    );

-- 이메일
CREATE UNIQUE INDEX UIX_cms_worker
  ON cms_worker ( -- 사원
    email ASC -- 이메일
  );

-- 휴대폰번호
CREATE UNIQUE INDEX UIX_cms_worker2
  ON cms_worker ( -- 사원
    tel ASC -- 휴대폰번호
  );

ALTER TABLE cms_worker
  MODIFY COLUMN wNo INTEGER NOT NULL AUTO_INCREMENT COMMENT '사원 번호';

-- 권한
CREATE TABLE cms_auth (
  aCode INTEGER     NOT NULL COMMENT '권한 코드', -- 권한 코드
  name  VARCHAR(50) NOT NULL COMMENT '권한명' -- 권한명
)
COMMENT '권한';

-- 권한
ALTER TABLE cms_auth
  ADD CONSTRAINT PK_cms_auth -- 권한 기본키
    PRIMARY KEY (
      aCode -- 권한 코드
    );

-- 권한 유니크 인덱스
CREATE UNIQUE INDEX UIX_cms_auth
  ON cms_auth ( -- 권한
    name ASC -- 권한명
  );

-- 댓글 정보
CREATE TABLE cms_cmtInfo (
  cCode   VARCHAR(20) NOT NULL COMMENT '댓글 코드', -- 댓글 코드
  bNo     INTEGER     NOT NULL COMMENT '게시글번호', -- 게시글번호
  list    INTEGER     NOT NULL COMMENT '순서', -- 순서
  stage   INTEGER     NOT NULL COMMENT '단계', -- 단계
  content MEDIUMTEXT  NOT NULL COMMENT '내용', -- 내용
  rdt     DATE        NOT NULL COMMENT '등록일', -- 등록일
  wNo     INTEGER     NOT NULL COMMENT '사원 번호' -- 사원 번호
)
COMMENT '댓글 정보';

-- 댓글 정보
ALTER TABLE cms_cmtInfo
  ADD CONSTRAINT PK_cms_cmtInfo -- 댓글 정보 기본키
    PRIMARY KEY (
      cCode -- 댓글 코드
    );

-- 일정
CREATE TABLE cms_calender (
  calCode VARCHAR(20)  NOT NULL COMMENT '일정코드', -- 일정코드
  wNo     INTEGER      NOT NULL COMMENT '사원 번호', -- 사원 번호
  title   VARCHAR(50)  NOT NULL COMMENT '제목', -- 제목
  sdt     DATE         NOT NULL COMMENT '시작일', -- 시작일
  edt     DATE         NOT NULL COMMENT '종료일', -- 종료일
  content MEDIUMTEXT   NOT NULL COMMENT '내용', -- 내용
  place   VARCHAR(255) NULL     COMMENT '장소' -- 장소
)
COMMENT '일정';

-- 일정
ALTER TABLE cms_calender
  ADD CONSTRAINT PK_cms_calender -- 일정 기본키
    PRIMARY KEY (
      calCode -- 일정코드
    );

-- 게시판
CREATE TABLE cms_board (
  bNo   INTEGER     NOT NULL COMMENT '게시판번호', -- 게시판번호
  bName VARCHAR(50) NOT NULL COMMENT '게시판명' -- 게시판명
)
COMMENT '게시판';

-- 게시판
ALTER TABLE cms_board
  ADD CONSTRAINT PK_cms_board -- 게시판 기본키
    PRIMARY KEY (
      bNo -- 게시판번호
    );

-- 게시글 정보
ALTER TABLE cms_bList
  ADD CONSTRAINT FK_cms_board_TO_cms_bList -- 게시판 -> 게시글 정보
    FOREIGN KEY (
      bNo2 -- 게시판번호
    )
    REFERENCES cms_board ( -- 게시판
      bNo -- 게시판번호
    );

-- 게시글 정보
ALTER TABLE cms_bList
  ADD CONSTRAINT FK_cms_worker_TO_cms_bList -- 사원 -> 게시글 정보
    FOREIGN KEY (
      wNo -- 사원 번호
    )
    REFERENCES cms_worker ( -- 사원
      wNo -- 사원 번호
    );

-- 사원
ALTER TABLE cms_worker
  ADD CONSTRAINT FK_cms_auth_TO_cms_worker -- 권한 -> 사원
    FOREIGN KEY (
      aCode -- 권한 코드
    )
    REFERENCES cms_auth ( -- 권한
      aCode -- 권한 코드
    );

-- 댓글 정보
ALTER TABLE cms_cmtInfo
  ADD CONSTRAINT FK_cms_bList_TO_cms_cmtInfo -- 게시글 정보 -> 댓글 정보
    FOREIGN KEY (
      bNo -- 게시글번호
    )
    REFERENCES cms_bList ( -- 게시글 정보
      bNo -- 게시글번호
    );

-- 댓글 정보
ALTER TABLE cms_cmtInfo
  ADD CONSTRAINT FK_cms_worker_TO_cms_cmtInfo -- 사원 -> 댓글 정보
    FOREIGN KEY (
      wNo -- 사원 번호
    )
    REFERENCES cms_worker ( -- 사원
      wNo -- 사원 번호
    );

-- 일정
ALTER TABLE cms_calender
  ADD CONSTRAINT FK_cms_worker_TO_cms_calender -- 사원 -> 일정
    FOREIGN KEY (
      wNo -- 사원 번호
    )
    REFERENCES cms_worker ( -- 사원
      wNo -- 사원 번호
    );
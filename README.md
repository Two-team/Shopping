# Shopping
## 08.27 lim
- 로그인 뷰 페이지 생성 + 로그인 컨트롤러 만드는 중
- DAO 를 안거치고 ServiceImpl 에서 바로 Mapper 로 가는 로직 구상중
- 회원가입이 안만들어진 관계로 테이블 새로 작성함 (임시)
### 작성한 TABLE
회원 테이블 ver2
CREATE TABLE USERS(
	memberId VARCHAR2(100) PRIMARY KEY,
	memberPwd VARCHAR2(1000) NOT NULL,
	memberName VARCHAR2(30) NOT NULL,
	regDate DATE NOT NULL
);

insert into USERS values('test', '1234', 'test', sysdate);
#-------------------------------------------------------------------------------------
## DB 2023-08-25 ver
계정 생성
create user ci identified by 1234;

alter user ci account unlock;

grant resource,connect to ci;

commit;
-----------------------------------------
회원 테이블
CREATE TABLE BOOK_MEMBER(
  memberId VARCHAR2(100) PRIMARY KEY,
  memberPw VARCHAR2(100) NOT NULL,
  memberName VARCHAR2(30) NOT NULL,
  memberAddr1 VARCHAR2(100) NOT NULL,
  memberAddr2 VARCHAR2(100) NOT NULL,
  memberAddr3 VARCHAR2(100) NOT NULL,
  adminCk NUMBER NOT NULL,
  regDate DATE NOT NULL,
  money number NOT NULL,
  point number NOT NULL
);

commit;

insert into book_member values('choikyumin', '1234', 'admin', 'admin', 'admin', 'admin', 'admin', 1, sysdate, 1000000, 1000000);
#-------------------------------------------------------------------------------------

# Shopping
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

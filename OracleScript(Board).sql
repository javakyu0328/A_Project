/*테이블 생성*/
CREATE TABLE tbl_board (
    bno       NUMBER        NOT NULL,
    title     VARCHAR2(50)  NOT NULL,
    content   CLOB,
    writer    VARCHAR2(30)  NOT NULL,
    regDate   DATE DEFAULT SYSDATE,

    PRIMARY KEY (bno)
);


/*시퀀스*//*bno번호 자동 생성*/
create sequence myBoard_seq;

create sequence PROJECT_ID_SEQ start 1 increment 1;
create table PROJECT (PROJECT_ID int4 not null, TITLE varchar(255) not null, primary key (PROJECT_ID));

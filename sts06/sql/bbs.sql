-- h2 database 
create table bbs( 
num number primary key auto_increment, 
sub varchar(10), 
content text, 
nalja date, 
cnt number 
);
insert into bbs (sub,content,nalja,cnt) values ('test4','test',now(),0);
insert into bbs (sub,content,nalja,cnt) values ('test3','test',now(),0);
insert into bbs (sub,content,nalja,cnt) values ('test2','test',now(),0);
insert into bbs (sub,content,nalja,cnt) values ('test1','test',now(),0);
select * from bbs;
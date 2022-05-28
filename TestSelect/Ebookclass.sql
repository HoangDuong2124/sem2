create database if not exists ebookshop;
use ebookshop;
drop table if exists books;
create table books(
    id int primary key ,
    title varchar(50),
    author varchar(50),
    price float,
    qty int

);
insert into books value (1001,'Java for dummies','Dang Kim Thi',11.11,11);
insert into books values (1002,'More Java for dummies','Codelean VN',22.22,22);
insert into books values (1003,'More Java for more dummies','Moohammad Ali',33.33,33);


select  * From books;
Select title, price, qty from books where id = '1001'
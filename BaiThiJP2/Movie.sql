CREATE  DATABASE Movie;
USE Movie;
CREATE  TABLE qlMovie(
    maMovie varchar(10) PRIMARY KEY ,
    nameMovie varchar(50),
    nameDirector varchar(50),
    datePremiere datetime,
    timeMovie int
);

insert into qlMovie values ('MV01','Iron Man','Jon Favreau','2022/03/20 20:00',120);
insert into qlMovie values ('MV02','Spider Man','Jon Watts','2022/02/19 19:00',110);
insert into qlMovie values ('MV03','Super Man','Richard Donner','2022/05/22 19:30',180);
insert into qlMovie values ('MV04','Joker','Todd Phillips','2022/04/29 18:00',150);
insert into qlMovie values ('MV05','The Flash','Andres Muschietti','2022/05/30 22:00',170);

SELECT  * FROM qlMovie
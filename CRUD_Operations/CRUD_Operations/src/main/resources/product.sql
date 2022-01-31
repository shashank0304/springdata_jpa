use springdata_jpa;

create table product (
id int primary key,
name varchar(50),
description varchar(50),
price decimal(8,3)
);
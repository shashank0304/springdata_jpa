use springdata_jpa;

create table product_finders (
id int primary key auto_increment,
name varchar(50),
description varchar(50),
price decimal(8,3)
);
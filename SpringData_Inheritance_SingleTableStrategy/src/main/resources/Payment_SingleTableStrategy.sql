use springdata_jpa;

create table payment_singletablestrategy(
id int primary key auto_increment,
pmode varchar(2),
amount decimal(8,3),
cardnumber varchar(20),
chequenumber varchar(20)

);
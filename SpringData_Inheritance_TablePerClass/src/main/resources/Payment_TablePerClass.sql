use springdata_jpa;

create table card_tableperclass (
id int primary key auto_increment,
amount decimal(8,3),
cardnumber varchar(20)
);

create table cheque_tableperclass (
id int primary key auto_increment,
amount decimal(8,3),
chequenumber varchar(20)
);
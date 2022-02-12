use springdata_jpa;

create table payment_tablepersubclass (
id int primary key auto_increment,
amount decimal(8,3)
);

create table creditcard_tablepersubclass (
id int,
cardnumber varchar(20),
foreign key (id) references payment_tablepersubclass(id)
);

create table cheque_tablepersubclass (
id int,
chequenumber varchar(20),
foreign key (id) references payment_tablepersubclass(id)
);

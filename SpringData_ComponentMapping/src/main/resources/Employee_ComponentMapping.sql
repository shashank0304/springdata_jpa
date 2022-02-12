use springdata_jpa;

CREATE TABLE EMPLOYEE_COMPONENTMAPPING (
id int primary key auto_increment,
name varchar(20),
street_address varchar(20),
city varchar(20),
state varchar(20),
zipcode varchar(20),
country varchar(20)
);
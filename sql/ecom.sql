create table customer
(
code bigint primary key auto_increment,
name char(50) not null,
email_id char(50) not null unique,
password varchar(100) not null,
password_key varchar(100) not null,
date_of_registration date not null
)engine=InnoDB;
create table product
(
code bigint primary key auto_increment,
name char(50) not null unique,
price decimal(10,2) not null,
is_available bool not null
)engine=InnoDB;
create table feed_back
(
id bigint primary key auto_increment,
given_on date not null,
product_code bigint not null,
customer_code bigint not null,
feed_back varchar(200) not null,
foreign key (product_code) refrences product(code),
foreign key (customer_code) refrences customer(code),
)engine=InnoDB;
create table administrator
(
username char(15) primary key,
password varchar(100) not null,
password_key varchar(100) not null
)engine=InnoDB;
create table purchase_order
(
id bigint primary key auto_increment,
order_date date not null,
customer_code bigint not null,
total_amount decimal(10,2) not null,
foreign key (customer_code) refrences customer(code)
)engine=InnoDB;
create table purchase_order_item
(
order_id bigint,
product_code bigint,
quantity int not null,
price decimal(10,2) not null,
primary key (order_id,product_code),
foreign key (order_id) refrences purchase_order(id),
foreign key (product_code) refrences product(code),
)engine=InnoDB;
create table product ( p_id varchar(6) primary key,
MODEL_NUMBER varchar(6) unique ,
NAME VARCHAR(30),
PRODUCT_TYPE VARCHAR(30)
);

create table product_metadata (
p_id varchar(6) primary key,
CANONICAL VARCHAR(100),
DESCRIPTION VARCHAR(255),
KEYWORDS VARCHAR(100),
PAGE_TITLE VARCHAR(255),
SITE_NAME VARCHAR(100)
);

create table PRICING_INFORMATION (
p_id varchar(6) primary key,
CURRENT_PRICE DOUBLE(17),
STANDARD_PRICE DOUBLE(17),
STANDARD_PRICE_NO_VAT DOUBLE(17)
);

create table PRODUCT_DESCRIPTION (
p_id varchar(6) primary key,
SUBTITLE VARCHAR(255),
TEXT VARCHAR(255),
TITLE VARCHAR(50)
);

insert into product(p_id,MODEL_NUMBER,NAME,PRODUCT_TYPE) values('CG7088','BTO93','Nite Jogger Shoes','inline');
insert into product_metadata(p_id,CANONICAL,DESCRIPTION,KEYWORDS,PAGE_TITLE,SITE_NAME) values ('CG7088','//www.adidas.co.uk/nite-jogger-shoes/CG7088.html','Shop for Nite Jogger Shoes - Black at adidas.co.uk! See all the styles and colours of Nite Jogger Shoes - Black at the official adidas UK online store.','Nite Jogger Shoes','adidas Nite Jogger Shoes - Black | adidas UK','adidas United Kingdom');
insert into PRICING_INFORMATION(p_id,CURRENT_PRICE,STANDARD_PRICE,STANDARD_PRICE_NO_VAT) values ('CG7088',119.95,119.95,99.96);
insert into PRODUCT_DESCRIPTION(p_id,SUBTITLE,TEXT,TITLE) values ('CG7088','Modern cushioning updates this flashy 80s standout.','Inspired by the 1980 Nite Jogger, these shoes shine bright with retro style and reflective details. The mesh and nylon ripstop upper is detailed with suede overlays. An updated Boost midsole adds responsive cushioning for all-day comfort.','Nite Jogger Shoes');

insert into product(p_id,MODEL_NUMBER,NAME,PRODUCT_TYPE) values('CG7089','BTO73','Nite Trekking Shoes','inline');
insert into product_metadata(p_id,CANONICAL,DESCRIPTION,KEYWORDS,PAGE_TITLE,SITE_NAME) values ('CG7089','//www.adidas.co.uk/nite-Trekking-shoes/CG7088.html','Shop for Nite Trekking Shoes - Black at adidas.co.uk! See all the styles and colours of Nite Jogger Shoes - Black at the official adidas UK online store.','Nite Jogger Shoes','adidas Nite Jogger Shoes - Black | adidas UK','adidas United Kingdom');
insert into PRICING_INFORMATION(p_id,CURRENT_PRICE,STANDARD_PRICE,STANDARD_PRICE_NO_VAT) values ('CG7089',119.95,119.95,99.96);
insert into PRODUCT_DESCRIPTION(p_id,SUBTITLE,TEXT,TITLE) values ('CG7089','Modern cushioning updates this flashy 80s standout.','Inspired by the 1980 Nite Jogger, these shoes shine bright with retro style and reflective details. The mesh and nylon ripstop upper is detailed with suede overlays. An updated Boost midsole adds responsive cushioning for all-day comfort.','Nite Trekking Shoes');

insert into product(p_id,MODEL_NUMBER,NAME,PRODUCT_TYPE) values('CG7079','BTO83','Nite Trekking Shoes','inline');
insert into product_metadata(p_id,CANONICAL,DESCRIPTION,KEYWORDS,PAGE_TITLE,SITE_NAME) values ('CG7079','//www.adidas.co.uk/nite-Trekking-shoes/CG7088.html','Shop for Nite Trekking Shoes - Black at adidas.co.uk! See all the styles and colours of Nite Jogger Shoes - Black at the official adidas UK online store.','Nite Jogger Shoes','adidas Nite Jogger Shoes - Black | adidas UK','adidas United Kingdom');
insert into PRICING_INFORMATION(p_id,CURRENT_PRICE,STANDARD_PRICE,STANDARD_PRICE_NO_VAT) values ('CG7079',119.95,119.95,99.96);
insert into PRODUCT_DESCRIPTION(p_id,SUBTITLE,TEXT,TITLE) values ('CG7079','Modern cushioning updates this flashy 80s standout.','Inspired by the 1980 Nite Jogger, these shoes shine bright with retro style and reflective details. The mesh and nylon ripstop upper is detailed with suede overlays. An updated Boost midsole adds responsive cushioning for all-day comfort.','Nite Trekking Shoes');

insert into product(p_id,MODEL_NUMBER,NAME,PRODUCT_TYPE) values('CG7019','BTO13','Nite Trekking Shoes','inline');
insert into product_metadata(p_id,CANONICAL,DESCRIPTION,KEYWORDS,PAGE_TITLE,SITE_NAME) values ('CG7019','//www.adidas.co.uk/nite-Trekking-shoes/CG7088.html','Shop for Nite Trekking Shoes - Black at adidas.co.uk! See all the styles and colours of Nite Jogger Shoes - Black at the official adidas UK online store.','Nite Jogger Shoes','adidas Nite Jogger Shoes - Black | adidas UK','adidas United Kingdom');
insert into PRICING_INFORMATION(p_id,CURRENT_PRICE,STANDARD_PRICE,STANDARD_PRICE_NO_VAT) values ('CG7019',119.95,119.95,99.96);
insert into PRODUCT_DESCRIPTION(p_id,SUBTITLE,TEXT,TITLE) values ('CG7019','Modern cushioning updates this flashy 80s standout.','Inspired by the 1980 Nite Jogger, these shoes shine bright with retro style and reflective details. The mesh and nylon ripstop upper is detailed with suede overlays. An updated Boost midsole adds responsive cushioning for all-day comfort.','Nite Trekking Shoes');

insert into product(p_id,MODEL_NUMBER,NAME,PRODUCT_TYPE) values('CG7029','BTO23','Nite Trekking Shoes','inline');
insert into product_metadata(p_id,CANONICAL,DESCRIPTION,KEYWORDS,PAGE_TITLE,SITE_NAME) values ('CG7029','//www.adidas.co.uk/nite-Trekking-shoes/CG7088.html','Shop for Nite Trekking Shoes - Black at adidas.co.uk! See all the styles and colours of Nite Jogger Shoes - Black at the official adidas UK online store.','Nite Jogger Shoes','adidas Nite Jogger Shoes - Black | adidas UK','adidas United Kingdom');
insert into PRICING_INFORMATION(p_id,CURRENT_PRICE,STANDARD_PRICE,STANDARD_PRICE_NO_VAT) values ('CG7029',119.95,119.95,99.96);
insert into PRODUCT_DESCRIPTION(p_id,SUBTITLE,TEXT,TITLE) values ('CG7029','Modern cushioning updates this flashy 80s standout.','Inspired by the 1980 Nite Jogger, these shoes shine bright with retro style and reflective details. The mesh and nylon ripstop upper is detailed with suede overlays. An updated Boost midsole adds responsive cushioning for all-day comfort.','Nite Trekking Shoes');

insert into product(p_id,MODEL_NUMBER,NAME,PRODUCT_TYPE) values('CG1029','BT023','Nite Trekking Shoes','inline');
insert into product_metadata(p_id,CANONICAL,DESCRIPTION,KEYWORDS,PAGE_TITLE,SITE_NAME) values ('CG1029','//www.adidas.co.uk/nite-Trekking-shoes/CG7088.html','Shop for Nite Trekking Shoes - Black at adidas.co.uk! See all the styles and colours of Nite Jogger Shoes - Black at the official adidas UK online store.','Nite Jogger Shoes','adidas Nite Jogger Shoes - Black | adidas UK','adidas United Kingdom');
insert into PRICING_INFORMATION(p_id,CURRENT_PRICE,STANDARD_PRICE,STANDARD_PRICE_NO_VAT) values ('CG1029',119.95,119.95,99.96);
insert into PRODUCT_DESCRIPTION(p_id,SUBTITLE,TEXT,TITLE) values ('CG1029','Modern cushioning updates this flashy 80s standout.','Inspired by the 1980 Nite Jogger, these shoes shine bright with retro style and reflective details. The mesh and nylon ripstop upper is detailed with suede overlays. An updated Boost midsole adds responsive cushioning for all-day comfort.','Nite Trekking Shoes');

insert into product(p_id,MODEL_NUMBER,NAME,PRODUCT_TYPE) values('CG2029','BT623','Nite Trekking Shoes','inline');
insert into product_metadata(p_id,CANONICAL,DESCRIPTION,KEYWORDS,PAGE_TITLE,SITE_NAME) values ('CG2029','//www.adidas.co.uk/nite-Trekking-shoes/CG7088.html','Shop for Nite Trekking Shoes - Black at adidas.co.uk! See all the styles and colours of Nite Jogger Shoes - Black at the official adidas UK online store.','Nite Jogger Shoes','adidas Nite Jogger Shoes - Black | adidas UK','adidas United Kingdom');
insert into PRICING_INFORMATION(p_id,CURRENT_PRICE,STANDARD_PRICE,STANDARD_PRICE_NO_VAT) values ('CG2029',119.95,119.95,99.96);
insert into PRODUCT_DESCRIPTION(p_id,SUBTITLE,TEXT,TITLE) values ('CG2029','Modern cushioning updates this flashy 80s standout.','Inspired by the 1980 Nite Jogger, these shoes shine bright with retro style and reflective details. The mesh and nylon ripstop upper is detailed with suede overlays. An updated Boost midsole adds responsive cushioning for all-day comfort.','Nite Trekking Shoes');

insert into product(p_id,MODEL_NUMBER,NAME,PRODUCT_TYPE) values('CG3029','BT223','Nite Trekking Shoes','inline');
insert into product_metadata(p_id,CANONICAL,DESCRIPTION,KEYWORDS,PAGE_TITLE,SITE_NAME) values ('CG3029','//www.adidas.co.uk/nite-Trekking-shoes/CG7088.html','Shop for Nite Trekking Shoes - Black at adidas.co.uk! See all the styles and colours of Nite Jogger Shoes - Black at the official adidas UK online store.','Nite Jogger Shoes','adidas Nite Jogger Shoes - Black | adidas UK','adidas United Kingdom');
insert into PRICING_INFORMATION(p_id,CURRENT_PRICE,STANDARD_PRICE,STANDARD_PRICE_NO_VAT) values ('CG3029',119.95,119.95,99.96);
insert into PRODUCT_DESCRIPTION(p_id,SUBTITLE,TEXT,TITLE) values ('CG3029','Modern cushioning updates this flashy 80s standout.','Inspired by the 1980 Nite Jogger, these shoes shine bright with retro style and reflective details. The mesh and nylon ripstop upper is detailed with suede overlays. An updated Boost midsole adds responsive cushioning for all-day comfort.','Nite Trekking Shoes');

insert into product(p_id,MODEL_NUMBER,NAME,PRODUCT_TYPE) values('CG6729','BT323','Nite Trekking Shoes','inline');
insert into product_metadata(p_id,CANONICAL,DESCRIPTION,KEYWORDS,PAGE_TITLE,SITE_NAME) values ('CG6729','//www.adidas.co.uk/nite-Trekking-shoes/CG7088.html','Shop for Nite Trekking Shoes - Black at adidas.co.uk! See all the styles and colours of Nite Jogger Shoes - Black at the official adidas UK online store.','Nite Jogger Shoes','adidas Nite Jogger Shoes - Black | adidas UK','adidas United Kingdom');
insert into PRICING_INFORMATION(p_id,CURRENT_PRICE,STANDARD_PRICE,STANDARD_PRICE_NO_VAT) values ('CG6729',119.95,119.95,99.96);
insert into PRODUCT_DESCRIPTION(p_id,SUBTITLE,TEXT,TITLE) values ('CG6729','Modern cushioning updates this flashy 80s standout.','Inspired by the 1980 Nite Jogger, these shoes shine bright with retro style and reflective details. The mesh and nylon ripstop upper is detailed with suede overlays. An updated Boost midsole adds responsive cushioning for all-day comfort.','Nite Trekking Shoes');

insert into product(p_id,MODEL_NUMBER,NAME,PRODUCT_TYPE) values('CG4029','BT423','Nite Trekking Shoes','inline');
insert into product_metadata(p_id,CANONICAL,DESCRIPTION,KEYWORDS,PAGE_TITLE,SITE_NAME) values ('CG4029','//www.adidas.co.uk/nite-Trekking-shoes/CG7088.html','Shop for Nite Trekking Shoes - Black at adidas.co.uk! See all the styles and colours of Nite Jogger Shoes - Black at the official adidas UK online store.','Nite Jogger Shoes','adidas Nite Jogger Shoes - Black | adidas UK','adidas United Kingdom');
insert into PRICING_INFORMATION(p_id,CURRENT_PRICE,STANDARD_PRICE,STANDARD_PRICE_NO_VAT) values ('CG4029',119.95,119.95,99.96);
insert into PRODUCT_DESCRIPTION(p_id,SUBTITLE,TEXT,TITLE) values ('CG4029','Modern cushioning updates this flashy 80s standout.','Inspired by the 1980 Nite Jogger, these shoes shine bright with retro style and reflective details. The mesh and nylon ripstop upper is detailed with suede overlays. An updated Boost midsole adds responsive cushioning for all-day comfort.','Nite Trekking Shoes');



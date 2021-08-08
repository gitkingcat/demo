drop table if exists security;



create table security (
    id BIGSERIAL ,
    email varchar(255) not null ,
    password varchar(255) not null ,
    role varchar(65535) not null ,
    primary key (id) );
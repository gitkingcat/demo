drop table if exists public.security;



create table PUBLIC.security (
    id BIGSERIAL ,
    email varchar(255) not null ,
    password varchar(255) not null ,
    role varchar(255) not null ,
    status varchar(255) not null ,
    primary key (id) );
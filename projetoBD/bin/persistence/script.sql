#postgre
#verbo ser
#coti
drop database bdheranca;
create database bdheranca;
\c bdheranca

create table pessoa(id int primary key,
 nome varchar (50),
 email varchar (50) unique);
 
create table cliente(
  sexo varchar (1) check ( sexo in ('m','f','M','F') ),
  dataNascimento date
)inherits(pessoa);


\dt

 insert into cliente (id,nome,email,sexo,dataNascimento)
 values (10,'ju','ju@gmail.com','f','2000-07-15');
  select * from pessoa;
 select * from cliente; 
 create sequence seq_cliente start with 11;
 select nextval('seq_cliente');
 11
 select currval('seq_cliente');
11













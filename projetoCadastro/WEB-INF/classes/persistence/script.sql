create database rest2;

use rest2;

 create table cliente(id  int primary key auto_increment,
    nome varchar (50),
    email varchar (100) unique,
    ativo int);
    
   create table endereco(id int primary key auto_increment,
   logradouro varchar (50),
   bairro varchar (50),
   cidade varchar (50),
   estado varchar (30),
   cep varchar (15),
   cliente_id int,
   foreign key(cliente_id) references cliente(id)
);

insert into cliente values (1,'gabriela','gabriela@gmail.com',1);
insert into endereco values (100,'Av Rio Branco,185','Centro','Rio de Janeiro',
'RJ','20040007',  1);













   
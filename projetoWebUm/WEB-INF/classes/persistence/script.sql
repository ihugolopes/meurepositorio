drop database if exists bdloginum;
create database bdloginum;
 use bdloginum;
 
 drop table usuario;
   create table usuario(id bigint primary key auto_increment,
   nome varchar (50),
   email varchar (50) unique,
   senha varchar (250)
   );
   
###### 
    

   
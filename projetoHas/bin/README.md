
===================================
ok : 1x0
--Ter 
--A instancia dentro Classe

 class Pessoa{
//Pessoa ter endereco
  private Endereco endereco;
}

class Usuario extends Pessoa{
//  Usuario é um pessoa    

}

--TEr vs ser


==========================================
create database bdrel1;

use bdrel1;

# desconfiar
# porque o id é auto_inrement ...
#Auto_increment (Internet)

drop table endereco;
drop table cliente;


create table cliente(
	idcliente int primary key auto_increment,
 	nome varchar (50),
 	email varchar (50) unique
 	);
 # o email nao pode duplicar devido ao unique

 #drop table endereco;
 # relacionamento um para um
 
#quando botei um para um nao permite duplicar ...

create table endereco(
	idendereco int primary key auto_increment,
  logrodouro varchar (50),
  bairro varchar (50),
  cidade varchar (50),
  estado varchar (2),
  cep varchar (10),
  id_cliente int unique,
  foreign key(id_cliente) references cliente(idcliente)
  );
  
  insert into cliente values (1000,'ju','ju@gmail.com');
  insert into endereco values (null,'Av Rio Branco,185',
  'centro','Rio de Janeiro','RJ','20040007',1000
  );
  insert into endereco values(null, 'av pres vargas, 1000',
  'centro', 'Rio de Janeiro', 'RJ', '20040007', 1000);
  
  
  ========================
  
  
  O Conceito eu vou primeiro no Banco 
  ==relacionamento a Objeto ...
  
  
  mysql ...
  Monogdb (json) --> nosql (Banco mais rápido mundo)
  =============================
  drop database testebd;
  create database testebd;
  use testebd;
   
   create table pessoa(id int primary key,
    nome varchar (50));
  
   create table usuario(idusuario int primary key,
    email varchar (50),
    foreign key(idusuario) references pessoa(id));
  ===========================================
  insert into pessoa values (1000,
  'juliana');
  
   insert into usuario values (1000,'ju@gmail.com.com');
   
   
 select id,nome, email from pessoa p,  usuario u
  where p.id = u.idusuario;  
 +------+---------+------------------+
| id   | nome    | email            |
+------+---------+------------------+
| 1000 | juliana | ju@gmail.com.com |
+------+---------+------------------+
 
 =================
 --Da Show para Herança..
 create database heranca;
 
 \c heranca;
 
  create table pessoa (id int primary key,
  nome varchar (50));
  
  create table usuario (
   email varchar (50)
   )inherits(pessoa);
   
   insert into usuario values (100,'carlos','carlos@gmail.com');
  
  
  
  

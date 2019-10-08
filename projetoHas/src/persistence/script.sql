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
 	email varchar (50) unique);
 	
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
  
  select * from cliente;
  select * from endereco;
  
  
  
  
  
 
 
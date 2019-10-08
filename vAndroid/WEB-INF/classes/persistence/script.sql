drop database bumblebee;
create database bumblebee;

use  bumblebee;

create table produto(idProduto int primary key auto_increment,
 nome varchar (50),
  descricao varchar (255),
 preco double,
 promocao int);
 
  insert into produto values (null, 'livro java OO sem OO', 'Java desOrientado a Objeto ',
  100., 1 );
  insert into produto values (null, 'deitel', 'Enganando com Deitel ',  10., 1 );
  insert into produto values (null, 'aprendendo java em 21 dias', 'Engana Dummy ',5., 1 );
  insert into produto values (null, 'livro de Android', 'Com Eclipse ',1., 1 );
  
  select * from produto;
  
  
  
  
  
  
  

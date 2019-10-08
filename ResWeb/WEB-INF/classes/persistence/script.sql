drop database  if exists bdproduto;

create database bdproduto;
use bdproduto;
create table produto(id int primary key auto_increment,
 nome varchar (50), preco double, imagem varchar (250)
   );
 insert into produto values (null,'redbull', 15,
    'https://mambo.vteximg.com.br/arquivos/ids/187715/172904.jpg');
 insert into produto values (null,'coca-cola', 7,
    'https://static.carrefour.com.br/medias/sys_master/images/images/h83/h46/h00/h00/9586634326046.jpg');
 insert into produto values (null,'mate', 5,
    'https://casafiesta.fbitsstatic.net/img/p/cha-mate-natural-matte-leao-garrafa-300ml-78363/243896.jpg');
insert into produto values (null,'cafe', 5,
'https://vidacarioca.net/wp-content/uploads/2017/08/sofa-cafe-10.jpg');
 
select * from produto;
    
create database testx;

use testx;

--PROPRIETÁRIO
create table proprietario(id bigint primary key auto_increment, nome varchar (50), cpf bigint, rg bigint , data varchar(10));

insert into proprietario values(null, 'hugo', 12345678910, 243435435, '20/02/2001');

select * from proprietario;

--TABELA CARRO
create table carro(cor varchar(20), modelo varchar (20), ano int, chassi varchar (20),
nomeDaMarca varchar (20), velocidadeMaxima int, tetoSolar boolean, numeroDeMarchas int,
cambioAutomatico boolean, volumeDeCombustivel int, numeroDePortas int);

insert into carro values('vermelho', '2019', 2018, 'e23232423f', 'Renault', 130, false, 5, false, 80, 4);

select * from carro;

--TABELA ENDEREÇO
create table endereco(rua varchar(70),  complemento varchar(50), bairro varchar (50), cidade varchar (50), estado varchar (50), cep varchar (50));
insert into endereco values('Avenida Rio Branco, 1258', 'apt. 2C', 'Centro', 'Rio de Janeiro', 'Rio de Janeiro', '23234-434');
select * from endereco;

--------------------
create table login(id bigint primary key auto_increment,
nome varchar (50), email varchar (50) unique, senha varchar
(250)); 

---------------
create table endereco(id int primary key auto_increment,
logradouro varchar (50), bairro varchar (50), cidade varchar
(50), estado varchar (30), cep varchar (15), cliente_id int,
foreign key(cliente_id) references cliente(id));
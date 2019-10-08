create database testx;

use testx;

--PROPRIETÁRIO
create table proprietario(nome varchar (50), cpf varchar(20), rg varchar (20), data varchar(10));

insert into proprietario values('hugo','23232323', '243435435', '20/02/2001');

select * from proprietario;

--TABELA CARRO
create table carro(nome varchar (50), cor varchar(20), modelo varchar (20), ano int, chassi varchar (20),
nomeDaMarca varchar (20), velocidadeMaxima int, tetoSolar boolean, numeroDeMarchas int,
cambioAutomatico boolean, volumeDeCombustivel int, numeroDePortas int);

insert into carro values('Clio','vermelho', '2019', 2018, 'e23232423f', 'Renault', 130, false, 5, false, 80, 4);

select * from carro;

--TABELA ENDEREÇO
create table endereco(rua varchar(70),  complemento varchar(50), bairro varchar (50), cidade varchar (50), estado varchar (50), cep varchar (50));
insert into endereco values('Avenida Rio Branco, 1258', 'apt. 2C', 'Centro', 'Rio de Janeiro', 'Rio de Janeiro', '23234-434');
select * from endereco;


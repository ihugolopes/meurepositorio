drop database shazzan;

create database shazzan;

use shazzan;

create table  usuario(id bigint primary key auto_increment,
userName varchar (50) unique not null,
senha varchar (150), nome varchar (50));

drop function if exists criptografia;
delimiter $$

create function criptografia(vsenha varchar(30)) returns varchar(150)

begin
	set @chave= concat('profedsonbelem@gmail.com', 'www.cotiinformatica.com.br');
	set @chave2 = concat(vsenha, @chave);
	return md5(@chave2);
	
	
end;
$$
delimiter ;


select criptografia('123');

select md5('123')

show tables;
show function status where db= DATABASE() and type='function';
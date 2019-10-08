create database struts;

use struts;

create table usuario(idUsuario bigint primary key auto_increment, primeiroNome varchar (50), 
ultimoNome varchar (50), email varchar (50), cpf varchar (50), sexo varchar (50), numero varchar (20));

insert into usuario values(null, 'Hugo', 'Lopes', 'hugolopes@gmail.com', '123.123.123-12', 'm', '2312-1212');
insert into usuario values(null, 'Marcos', 'Castro', 'marcoscastro@gmail.com', '124.124.124-13', 'm', '2412-4212');
insert into usuario values(null, 'Giovanni', 'Ferreira', 'giovanniferreira@gmail.com', '154.824.194-13', 'm', '2418-4262');
insert into usuario values(null, 'Fernanda', 'Souza', 'fernandasouza@gmail.com', '754.826.194-13', 'm', '2618-4262');

select * from usuario;

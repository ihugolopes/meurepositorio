create database bdangular if not exist;
use bdangular;

create table  aluno(id int primary key auto_increment,
 nome varchar (50), disciplina varchar (50),
 nota1 double, nota2 double,
 situacao varchar (50)
 );
 
  insert into aluno values (null, 'Isack sem curriculum','java',
  7,8, 'aprovado');
   insert into aluno values (null, 'hugo','java',
  10,8, 'aprovado');
    insert into aluno values (null, 'ygor caveira','java',
  10,10, 'aprovado');
   insert into aluno values (null, 'bruda','java',
  4,5, 'reprovado');
  insert into aluno values (null, 'michel coragem','java',
  6,6, 'reprovado');
  insert into aluno values (null, 'veloz','java',
  2,6, 'reprovado');
  
   select * from aluno;
  
  
  
  
  
  
  
  
  
  
  
  
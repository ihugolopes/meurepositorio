drop database alunoBD;

create database alunoBD;

use alunoBD;

create table aluno(idAluno bigint primary key auto_increment,
 nome varchar (50), email varchar (50) unique, 
  senha varchar (150));
 
create table disciplina(idDisciplina bigint primary key auto_increment,
  nomeDisciplina varchar (50), nota1 double, nota2 double,
  situacao varchar (25), fkidaluno bigint,
   foreign key(fkidaluno) references aluno(idAluno) on delete cascade);
   
show tables;   

create or replace view V$AlunoDisciplina
     as select idAluno, nome, email, senha,
     idDisciplina, nomeDisciplina, nota1, nota2, situacao,fkidaluno
      from aluno a inner join disciplina d
       on a.idAluno = d.fkidaluno;
       
      select * from V$AlunoDisciplina; 
     
     insert into aluno  values (null,'hugo','hugo@mail.com','123');
 

      
      
      
      
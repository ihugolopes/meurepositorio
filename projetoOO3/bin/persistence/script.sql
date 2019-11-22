drop database quatroModulo;
create database quatroModulo;
use quatroModulo;

#manytoMany

create table curso(id int primary key,
                   descricao varchar (20) unique);
                   
create table aluno(id int primary key,
                   nome varchar (35),
                   email varchar (50) unique
                   );

create table aluno_curso(
       id int, 
       aluno_id int,
       curso_id int,
       primary key(id, aluno_id, curso_id),
foreign key(aluno_id)  references aluno(id),       
foreign key(curso_id)  references curso(id)        
);    

drop table aluno_curso;
create table aluno_curso(
       aluno_id int,
       curso_id int,
       primary key(id, aluno_id,curso_id),
foreign key(aluno_id)  references aluno(id),       
foreign key(curso_id)  references curso(id)        
);    


drop table aluno_curso;
create table aluno_curso(
       aluno_id int unique,
       curso_id int unique,
foreign key(aluno_id)  references aluno(id),       
foreign key(curso_id)  references curso(id)        
);   

drop table aluno_curso;
create table aluno_curso(
       aluno_id int,
       curso_id int,
foreign key(aluno_id)  references aluno(id),       
foreign key(curso_id)  references curso(id)        
);  


show tables;
desc aluno;
desc  curso;
desc aluno_curso;

======================================================
















 
                   
                   
                   
                   
                   
                   
                   
                   
                   
                   
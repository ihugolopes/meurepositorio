conn system/coti
select user from dual;
 create user  alunocotis identified by coti
    default tablespace users
    quota 100m on users;
    
 grant create table, create procedure,   create view, create session,
          create sequence, create trigger to alunocotis;
conn  alunocotis/coti
select user from dual;
 
drop table usuario;
drop table endereco;
drop sequence seq_usuario;
drop sequence seq_endereco;
drop function gravar;

 create table usuario (usuarioid number (15) primary key,
  nome varchar2 (50), email varchar2 (50) unique); 
 create sequence seq_usuario;

 drop table endereco;
  create table endereco(enderecoid number (15) primary key,
   logradouro varchar2 (50), bairro varchar2 (50),
    cidade varchar2 (50), estado varchar2 (50), 
    cep varchar2 (20), 
    usuario_id number (15),
    foreign key(usuario_id) references usuario on delete cascade);
    
 create sequence seq_endereco;
 
 select * from cat;
 
 ------------------------
 set serveroutput on size 10000;
 
 drop function gravar;
  create or replace function gravar(vnome in varchar, vemail in varchar, 
     vlogradouro in varchar, vbairro in varchar, vcidade in varchar, 
     vestado in varchar, vcep in varchar)  return number
  as
   begin 
	         insert into usuario values (seq_usuario.nextval, vnome, vemail);
 insert into endereco values (seq_endereco.nextval, vlogradouro, vbairro, 
 vcidade,vestado,  vcep ,seq_usuario.currval); 
      commit;
          return 1;
	  exception when others then 
	      rollback;
	      return -1;
end;
/

     show errors;
     
   var numero number;
  exec :numero  :=    gravar('lu','lu@gmail.com', 'Av Rio branco, 185', 'centro', 'rio de janeiro',   'rj', '20040007' );
    
    var numero number;
  exec :numero  :=    gravar('lu','lu@gmail.com', 'Av Rio branco, 185', 'centro', 'rio de janeiro', 'rj', '20040007' );
   
   print :numero;
     
    select  * from usuario;
    select * from endereco;
    set linesize 2000;
    column nome format a15;
    column email format a17;
    column logradouro format a20;
    column bairro format a20;
    column cidade format a20;
    column estado format a10;
    column cep format a10;
    
     create or replace view vfindall 
       as select usuarioid, nome,email ,
                     enderecoid, logradouro, bairro, cidade, estado, cep,
                     usuario_id  from usuario  u
                     inner join endereco e
                   on   u.usuarioid = e.usuario_id;
                   
select * from vfindall;                     
   
 create or replace function findAll  return sys_refcursor
   as
     linhausuario  sys_refcursor;
   begin
	   open linhausuario for select * from vfindall;
	   return linhausuario;
   end; 
/

select findAll from dual;
 


    
 
 
 
     
     
     
     
  
  
 
 
 
    
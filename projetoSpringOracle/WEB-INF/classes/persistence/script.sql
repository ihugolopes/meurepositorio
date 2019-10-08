conn sys/coti as sysdba
--Sou SysDBA (logo tenho todas as Permissoes)

create user javaum identified by coti
  default tablespace users
  quota 200m on users;
  
 grant create table , create procedure, create trigger,
      create session,  create view, create sequence
       to  javaum;
       
       conn sys/coti as sysdba
       
        select user from dual;
        select name from v$database;
        select banner from v$version;
       
       
       
conn javaum/coti

  create table funcionario(id number (15) primary key,
                                          nome varchar (50),
                                          salario number (15,2),
                                          email varchar (50) unique,
                                          senha varchar (100)
                                         );
 create sequence seq_funcionario;  
 

 select user from dual;
  select * from user_sys_privs;
  select  * from cat;
 
  create or replace function criptografa(vsenha in varchar)
 return varchar2
 is
 vcript varchar (100):='';
 begin
	  vcript   :=   to_char(dbms_obfuscation_toolkit.
	    md5(input =>utl_raw.cast_to_raw(vsenha)));
	    return vcript;
 end;
 /
 
  select criptografa('123')  from dual;
  
  create or replace function grava(vnome in varchar, vsalario in number,
  vemail in varchar, vsenha in varchar )
  return number
  as 
  verifica varchar (50):='';  
  begin
	   select nome into verifica  from funcionario 
	    where email = vemail;
	    dbms_output.put_line('Email ja existe ' || verifica);
	 return -1;
	 exception when others then
	  insert into funcionario values (seq_funcionario.nextval,
	  vnome, vsalario, vemail, criptografa(vsenha));
	  commit;
	  return 1;
  end;
/

var resposta number;
 exec :resposta := grava('bruda',2000,'bruda@gmail.com','123');
 print resposta;

 
 create or replace function findAll  return sys_refcursor
 as
  linha  sys_refCursor;
 begin
	open linha for select * from funcionario;
	 return linha;
end;
 /
 
   set linesize 2000;
  column nome format a15;
  column email format a20;
  column senha format a35;
   select findAll from dual;
   
   
   
 create or replace  function findByCode(code in number)
 return varchar2 
 as
 reg funcionario%rowtype;
  begin
  select nome, salario, email, senha  into
  reg.nome, reg.salario, reg.email, reg.senha
   from funcionario    where id = code;
return code || ',' || reg.nome || ',' || reg.salario || ',' || reg.email || ',' || reg.senha;
exception when others then
 return '-1';
 end;
 /
 select * from funcionario;
  select findByCode(1) from dual;
    
  
  
  
  
  
  
  
  
                                         
                                         
                                         
                                         
  
                                          
                                          
                                          
                                          

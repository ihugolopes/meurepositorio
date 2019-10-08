  drop database transacao;
   create database transacao;
  
  use transacao;
  
  create table cliente(
  id int primary key auto_increment,
   nome varchar (50) not null
   );
   
   create table   planopagamento(
   id int primary key auto_increment,
   nomePlano varchar (50) not null,
   valor double,
   pagamento_id int,
   foreign key  (pagamento_id) references cliente(id)
   );
   # toda vez que existir chave estrangeira
   # criar a view
   #Criar a Visão para Consultar Chave primaria = estrangeira
   
   create or replace view VISAO as 
     select  c.id as idCliente,  nome, 
     p.id as idPagamento, nomePlano, valor, 
            pagamento_id from
      cliente c inner join planopagamento p
       on c.id = p.pagamento_id;
       
         insert into cliente values (1,'isaac');
         insert into planopagamento values (20,'ouro', 500,  1);
         
         select * from VISAO;
         
         
         
         
         
         
         
   
   
   
   
   
   
   
   
   
   
   
   
  
  
  
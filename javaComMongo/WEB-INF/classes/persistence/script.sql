##Mongodb _ Banco de dados da Goole / FireBase

---> Que trabalham com  o Movimento NOSQL (esquece select * from ...)


## terminal (mongod)
## mongo (entrar)
### _ start no mongo (   mongod ) _ segura o meu servidor (27017)

### para entrar no mongo --> mongo

mongod ---> startar  o mongo
mongo --> ENtrar no Mongo


 show dbs;
 
 use sessao21;
 
 ##no java Double 
 
 registro = {_id:10, nome:"jose", email: "jose@gmail.com",ativo : 1 };
   db.cliente.insert(registro);
  db.cliente.find();
 
   db.cliente.insertMany([
  {_id:11,nome:"veloz",email:"veloz@gmail.com",ativo:0},
  {_id:12,nome:"luciano",email:"luciano@gmail.com",ativo:1},
  {_id:13,nome:"igor",email:"igor@gmail.com",ativo:1}
 ]);
 
 
 db.cliente.find().pretty();
 
  show collections;
  --Mostra as colecoes 
  
  --------------------------
  db;
  --mostra o banco que estou
  
 --> 
  db.cliente.find(
  { nome : "veloz" }
  );
  
---
  { "_id" : 11, "nome" : "veloz", "email" : "veloz@gmail.com", "ativo" : 0 }
-------------------------
-->So mostra o nome e o id
  db.cliente.find(
  {},{nome : 1}
  );
  
  ===================================
  
  db.getCollectionNames();
  ["cliente"]
  
  =======================================
  --condicao
  --var query={"_id":10};
 -- var mod = {$_unset :{"nome":"lu","email":"lu@gmail.com", "ativo":1}};
  --var opt = {multi:false};
   
  -- db.cliente.update(query,mod, opt);
    
  db.cliente.update(
    {_id:10},{"nome":"lu", "email":"lu@gmail.com","ativo":1},{_set: true}
 );
  
 
 var consulta = db.cliente.find();
 while(consulta.hasNext()){
     var registro = consulta.next();
     printjson(registro.nome + "," + registro.email);
 }
 
=====================
 "lu,lu@gmail.com"
"luciano,luciano@gmail.com"
"igor,igor@gmail.com"
=================

 
 
  
 
 
 
 
 db.cliente.find();
  ---------------------------------------
  db.cliente.remove({
   nome : "veloz"
 });
 
-----------------------

 --ordenar
 -----Ascendente 1
 -----Descendente -1
 db.cliente.find().sort({nome : 1});
 
 -----------------------------
 
 --Iniciar Por 
 db.cliente.find(
 {
  nome:  /l/
 }
 );
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
 
 
 
 
 
 
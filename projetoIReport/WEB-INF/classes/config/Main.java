package config;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class Main {

	public static void main(String[] args) {
	 	Configuration cfg = new AnnotationConfiguration().
			 	configure("config/mysql_hibernate.cfg.xml");
		  new SchemaExport(cfg).create(true,true);
		   System.out.println("Gerar Tabela ...");
		/*
		 *     create table funcionario (
        id integer not null auto_increment,
        email varchar(255),
        nome varchar(50),
        salario double precision,
        sexo     enum ('m', 'f')   ,
        primary key (id)
    )

    alter table funcionario 
        add constraint UK_t45qja1wnv0hu1cdw6vqjljgy  unique (email)
Gerar Tabela ...
		 */
		   
		   
		   
	}
}








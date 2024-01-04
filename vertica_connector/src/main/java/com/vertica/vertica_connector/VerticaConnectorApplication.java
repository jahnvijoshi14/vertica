package com.vertica.vertica_connector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class VerticaConnectorApplication {

	// @Autowired
    // JdbcTemplate jdbcTemplateOne;
	public static void main(String[] args) {

	 
        
		SpringApplication.run(VerticaConnectorApplication.class, args);
		
	}


    

	// void runJDBC() {
    //   jdbcTemplateOne.execute("create table engineering.employee (id int, name varchar)");
	// }




	// @Override
	// public void run(String... args) throws Exception {
	// 	runJDBC();
	// 	throw new UnsupportedOperationException("Unimplemented method 'run'");
	// }



}

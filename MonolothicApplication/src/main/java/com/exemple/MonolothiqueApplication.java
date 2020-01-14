package com.exemple;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.exemple.DAO.ClientRepository;
import com.exemple.entities.Client;
@SpringBootApplication
public class MonolothiqueApplication {
	
	
	@Autowired 
	private ClientRepository clientRepository;

	public static void main(String[] args) {
		SpringApplication.run(MonolothiqueApplication.class, args);
	}
	public void run(String... args) throws Exception {

	}

}

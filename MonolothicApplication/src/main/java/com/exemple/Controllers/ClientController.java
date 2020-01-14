package com.exemple.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exemple.DAO.ClientRepository;

import com.exemple.Services.ServiceImp;
import com.exemple.entities.Client;

import com.exemple.entities.clientCommand;

import lombok.RequiredArgsConstructor;



@RequiredArgsConstructor
@RestController
@RequestMapping( "api/clients") 
public class ClientController {
	
	@Autowired
    private ClientRepository clientRepository;
	@Autowired
	private ServiceImp service;

	
	@PostMapping  
	public Client saveClient(@RequestBody Client client) {
		return clientRepository.save(client);
	}
	
	@GetMapping("/viewClientsCommands")
	public List<clientCommand> viewClientsCommands() {
			List<clientCommand>  ClientCommand = service.listClientCommand();
			return ClientCommand;
		}

	@GetMapping("/viewClients")
	public List<Client> viewClients() {
			List<Client>  clients = service.listClient();
			return clients;
		}
	
	@GetMapping("/viewClientsCommand/{nom}")
	public List<clientCommand> viewClientsCommandsByName(@PathVariable String nom) {
		
			List<clientCommand> clientCommand = service.researchClientCommand(nom);
			return clientCommand;

		}

}

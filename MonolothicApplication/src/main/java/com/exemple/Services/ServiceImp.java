package com.exemple.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.exemple.DAO.ClientRepository;
import com.exemple.DAO.ProviderRepository;
import com.exemple.DAO.ProductRepository;

import com.exemple.entities.Client;
import com.exemple.entities.clientCommand;
import com.exemple.entities.ProviderCommand;
import com.exemple.entities.Provider;
import com.exemple.entities.Product;
@Service
@Transactional 
public class ServiceImp implements OurServices {
	@Autowired 
	private ClientRepository clientRepository;
	
	@Autowired 
	private com.exemple.DAO.ProviderCommandRepository ProviderCommandRepository;
	@Autowired 
	private com.exemple.DAO.ClientCommandRepository ClientCommandRepository;
	@Autowired 
	private ProductRepository productRepository;
	@Autowired 
	private ProviderRepository providerRepository;
	
	
	
	public List<Client> listClient() {
		return clientRepository.findAll();
	}
	
	public List<Client> researchClient(String nomClient) {
		return clientRepository.viewClientByName(nomClient);
	}
	
	public List<ProviderCommand> viewProviderCommand() {
		return ProviderCommandRepository.findAll();
	}
	
	public List<ProviderCommand> researchProviderCommand(String nomFournisseur) {
		return ProviderCommandRepository.viewCommandByNAmeF(nomFournisseur);
	}

	public List<clientCommand> listClientCommand() {
		return ClientCommandRepository.findAll();
	}

	public List<clientCommand> researchClientCommand(String nameC) {
		return ClientCommandRepository.viewCommandByName(nameC);
	}
	
	public List<Product> viewProducts() {
		return productRepository.findAll();
	}
	
	public List<Product> researchProduct(String nameP) {
		return productRepository.researchByNameP(nameP);
	}
	
	public List<Provider> viewProvider() {
		return providerRepository.findAll();
	}

	public List<Provider> researchProvider(String nameF) {
		return providerRepository.researchByNameF(nameF);
	}

	


	

	
}

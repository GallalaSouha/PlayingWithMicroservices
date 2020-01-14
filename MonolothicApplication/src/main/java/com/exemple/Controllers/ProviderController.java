package com.exemple.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.exemple.DAO.ProviderRepository;

import com.exemple.Services.ServiceImp;

import com.exemple.entities.ProviderCommand;
import com.exemple.entities.Provider;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping( "api/fournisseurs")
public class ProviderController {
	
	
	@Autowired
    private ProviderRepository providerRepository;
	@Autowired
	private ServiceImp service;
	@Autowired

	
	@PostMapping  
	public Provider saveFournisseur(@RequestBody Provider provider) {
		
		return providerRepository.save(provider);
	
	 
	} 
	@GetMapping("/viewCommandesFournisseurs")
	public List<ProviderCommand> viewCommandesFournisseurs() {
		
			List<ProviderCommand> providerCommand = service.viewProviderCommand();
			return providerCommand;
			
		
		
		}
	
	@GetMapping("/afficherFournisseurs")
	public List<Provider> afficherClients() {
		
			List<Provider> providers = service.viewProvider();
			return providers;
			
		
		
		}
	
	@GetMapping("/viewCommandeFournisseurs/{nom}")
	public List<ProviderCommand> viewCommandesClient(@PathVariable String nom) {
		
			List<ProviderCommand> providerCommand = service.researchProviderCommand(nom);
			return providerCommand;
			
		
		
		}
	
	
	

}

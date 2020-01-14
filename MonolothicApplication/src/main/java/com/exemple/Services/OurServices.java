package com.exemple.Services;

import java.util.List;

import com.exemple.entities.Client;
import com.exemple.entities.clientCommand;
import com.exemple.entities.ProviderCommand;
import com.exemple.entities.Provider;
import com.exemple.entities.Product;



public interface OurServices {
	
	public List<Client> researchClient(String nomClient);
	public List<Client> listClient();
	public List<ProviderCommand> viewProviderCommand();
	public List<ProviderCommand> researchProviderCommand(String nomFournisseur);
	public List<clientCommand> listClientCommand();
	public List<clientCommand> researchClientCommand(String nomClient);
	public List<Product> viewProducts();
	public List<Product> researchProduct(String nomProduit);
	public List<Provider> viewProvider();
	public List<Provider> researchProvider(String nomFournisseur);
	

}

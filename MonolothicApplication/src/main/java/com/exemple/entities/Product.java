package com.exemple.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity 
@Table(name = "Produit") 
public class Product implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idP;
	@Column
	private String nameP;
	@Column
	private float price;
	@ManyToMany (cascade = CascadeType.ALL)
	@JoinTable (name = "ComProdFour", joinColumns = {@JoinColumn (name = "id_produit")}, inverseJoinColumns = {@JoinColumn (name = "commande_id")})
	private Set<ProviderCommand> providerCommand;
	@ManyToMany (cascade = CascadeType.ALL)
	@JoinTable (name = "ComProdClient", joinColumns = {@JoinColumn (name = "id_produit")}, inverseJoinColumns = {@JoinColumn (name = "commande_id")})
	private Set<com.exemple.entities.clientCommand> clientCommand;

	public Product(String nameP, float price) {
		
		this.nameP = nameP;
		this.price = price;
	}

}

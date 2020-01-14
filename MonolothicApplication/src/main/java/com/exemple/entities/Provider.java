package com.exemple.entities;


import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
@Table(name = "Fournisseur")
public class Provider {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idF;
	@Column
	private String nameF;
	@Column
	private String adressF;
	@Column
	private long numF;
	
	@OneToMany(mappedBy="idCommande")
	private Set<ProviderCommand> commands;

	public Provider(String nameF, String adressF, long numF) {
		this.nameF = nameF;
		this.adressF = adressF;
		this.numF = numF;
	}
	

}

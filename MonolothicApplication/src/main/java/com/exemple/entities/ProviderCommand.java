package com.exemple.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "CommandeFournisseur") 
public class ProviderCommand implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCommand;

	
	@ManyToOne
	@JoinColumn
	private Provider Provider;
	
	@Column
	private Date date;

	public ProviderCommand(Provider provider, Date date) {
		super();
		this.Provider = provider;
		this.date = date;
	}
	

}

package com.exemple.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "ComProdFour")
public class ComProdFour implements Serializable {
	@Id
	private ProviderCommand Command;
	@Id
	private Product product;
	@Column
	private float quantity;

}

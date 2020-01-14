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
@Table(name = "ComProdClient")
public class ComProdClient  implements Serializable {
	@Id
	private clientCommand commande;
	@Id
	private Product product;
	@Column
	private float quantite;

}

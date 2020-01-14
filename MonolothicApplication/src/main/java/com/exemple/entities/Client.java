package com.exemple.entities;

import java.io.Serializable;
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
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity @Table(name = "Client") 
public class Client  implements Serializable  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idC;
	@Column
	private String nameC;
	@Column
	private String adressC;
	@Column
	private long tel;
	@OneToMany(mappedBy="idCommand")
	private Set<clientCommand> commands;

	public Client(String nameC, String adressC, long tel) {
		super();
		this.nameC = nameC;
		this.adressC = adressC;
		this.tel = tel;
	}
	


}

package com.exemple.DAO;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.exemple.entities.Client;


@Repository 
public interface ClientRepository extends JpaRepository<Client,Long> {
	@Query("select c from Client c where c.nameC=:x   ")
	public List<Client> viewClientByName(@Param("x") String nameC);
}

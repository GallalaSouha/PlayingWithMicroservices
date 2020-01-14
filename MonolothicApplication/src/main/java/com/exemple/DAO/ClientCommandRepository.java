package com.exemple.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.exemple.entities.clientCommand;


@Repository 
public interface ClientCommandRepository extends JpaRepository<clientCommand,Long> {
	@Query("select c from clientCommand c where c.client.nameC=:x  ")
	public List<clientCommand> viewCommandByName(@Param("x") String nomClient);

}

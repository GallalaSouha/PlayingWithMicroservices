package com.exemple.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.exemple.entities.ProviderCommand;


@Repository 
public interface ProviderCommandRepository extends JpaRepository<ProviderCommand,Long> {
	@Query("select c from ProviderCommand c where c.Provider.nameF=:x  ")
	public List<ProviderCommand> viewCommandByNAmeF(@Param("x") String nameF);

}

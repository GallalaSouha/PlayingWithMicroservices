package com.exemple.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.exemple.entities.ComProdFour;


@Repository
public interface ComProdFrouRepository extends JpaRepository<ComProdFour,Long> {
	@Query("select c from ProviderCommand c where c.idCommand=:x  ")
	public List<ComProdFour> researchCommand(@Param("x") Long idCommand);

}

package com.exemple.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.exemple.entities.Provider;




@Repository 
public interface ProviderRepository extends JpaRepository<Provider,Long> {
	@Query("select c from Provider c where c.nameF=:x ")
	public List<Provider> researchByNameF(@Param("x") String nameF);
	@Query("select c from Provider c  ")
	public List<Provider> viewProvider();

}

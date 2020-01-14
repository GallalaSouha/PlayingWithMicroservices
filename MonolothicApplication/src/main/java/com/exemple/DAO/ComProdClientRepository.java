package com.exemple.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exemple.entities.ComProdClient;

@Repository
public interface ComProdClientRepository extends JpaRepository<ComProdClient ,Long>{

}

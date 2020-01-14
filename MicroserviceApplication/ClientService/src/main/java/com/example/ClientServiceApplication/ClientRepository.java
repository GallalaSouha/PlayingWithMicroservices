package com.example.ClientServiceApplication;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@RepositoryRestResource
public interface ClientRepository extends JpaRepository<Client , Integer> {
    @Query("select c from Client c where c.nameC like :name")
    public static List<Client> clientByName(@Param("name") String mc) {
        return null;
    }

    @Query("select c from Client c  ")
    static List<Client> viewAllClients() {
        return null;
    }
}
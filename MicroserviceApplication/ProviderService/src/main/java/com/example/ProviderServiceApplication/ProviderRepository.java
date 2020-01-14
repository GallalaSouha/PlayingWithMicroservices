package com.example.ProviderServiceApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface ProviderRepository extends JpaRepository<Provider , Integer> {
    @Query("select p from Provider p where p.nameF like :name")
    public static List<Provider> providerByName(@Param("name") String mc) {
        return null;
    }

    @Query("select c from Provider c  ")
    static List<Provider> viewAllProviders() {
        return null;
    }
}

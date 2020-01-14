package com.example.ProductServiceApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.stream.Stream;

@Component
class InsertPData implements CommandLineRunner {
    @Override
    public void run(String... strings) throws Exception {
        Stream.of("PC", "Keywords", "CentralUnit", "Mouse", "HardDisk").forEach(s->productRepository.save(new Product(s)));
        productRepository.findAll().forEach(s->System.out.println(s.getName()));
    }

    @Autowired
    private ProductRepository productRepository;

}
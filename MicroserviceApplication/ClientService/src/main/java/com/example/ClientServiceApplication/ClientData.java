package com.example.ClientServiceApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.stream.Stream;

@Component
public class ClientData implements CommandLineRunner {
    @Override
    public void run(String... strings) throws Exception {
        Stream.of("Samira", "Souha", "Mohamed").forEach(s->clientRepository.save(new Client(s)));
        clientRepository.findAll().forEach(s->System.out.println(s.getName()));
    }
    @Autowired
    private ClientRepository clientRepository;
}
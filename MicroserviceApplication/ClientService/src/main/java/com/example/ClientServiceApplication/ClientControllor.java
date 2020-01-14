package com.example.ClientServiceApplication;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping( "api/clients")
public class ClientControllor {
    @Value("${ourClient}")
    private String ourClient;

    @RequestMapping("/messages")
    public String tellMe() {
        System.out.println("It's the client who answered you!");
        return ourClient;
    }

    @GetMapping("/viewClients")
    public List<Client> viewClients() {
        return ClientRepository.viewAllClients();
    }

    @GetMapping("/viewClients/{nameC}")
    public List<Client> viewClientCommandByName(@PathVariable String nameP) {
        {
            return ClientRepository.clientByName(nameP);
        }
    }
}


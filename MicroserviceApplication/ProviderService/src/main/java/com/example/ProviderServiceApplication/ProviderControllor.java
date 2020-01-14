package com.example.ProviderServiceApplication;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "api/providers")
public class ProviderControllor {

    @Value("${ourProvider}")
    private String ourProvider;

    @RequestMapping("/messages")
    public String tellMe() {
        System.out.println("It's the provider who answered you!");
        return ourProvider;
    }

    @GetMapping("/viewProviders")
    public List<Provider> viewProviders() {
        return ProviderRepository.viewAllProviders();
    }

    @GetMapping("/viewProducts/{nameF}")
    public List<Provider> viewProviderCommandByName(@PathVariable String nameF) {
        {
            return ProviderRepository.providerByName(nameF);
        }
    }
}
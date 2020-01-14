package com.example.ProviderServiceApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.stream.Stream;

@Component
public class InsertFData implements CommandLineRunner {
    @Override
    public void run(String... strings) throws Exception {
        Stream.of("Asus","Apple", "HP", "Lenovo", "Intel", "Dell").forEach(s->providerRepository.save(new Provider(s)));
        providerRepository.findAll().forEach(s->System.out.println(s.getName()));
    }

    @Autowired
    private ProviderRepository providerRepository;
}
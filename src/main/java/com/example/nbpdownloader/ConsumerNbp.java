package com.example.nbpdownloader;

import com.example.nbpdownloader.model.CenaZlota;
import com.example.nbpdownloader.repository.CenaZlotaRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.io.IOException;
import java.net.URL;

public class ConsumerNbp {
    @Autowired
    CenaZlotaRepository repository;
    @Autowired
    ObjectMapper mapper;
    @Value("${nbpApi.uri}")
    URL url;

    public void run() throws IOException {

        CenaZlota[] cenaZlota = this.mapper.readValue(url, CenaZlota[].class);
        repository.save(cenaZlota[0]);
    }
}

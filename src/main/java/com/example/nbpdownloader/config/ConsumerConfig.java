package com.example.nbpdownloader.config;

import com.example.nbpdownloader.ConsumerNbp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConsumerConfig {
    @Bean
    public ConsumerNbp getTemplate(){
        return new ConsumerNbp();
    }
}

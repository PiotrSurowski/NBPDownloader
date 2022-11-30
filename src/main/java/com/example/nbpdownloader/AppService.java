package com.example.nbpdownloader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class AppService {
    @Autowired
    ConsumerNbp consumerNbp;

    public AppService(ConsumerNbp consumerNbp){
        this.consumerNbp = consumerNbp;
    }

    @Scheduled(cron = "${schedulerChangeDetectionServices.cron}")
    public void getCeny() throws IOException {
        consumerNbp.run();
    }
}

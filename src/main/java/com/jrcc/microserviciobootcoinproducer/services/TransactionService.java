package com.jrcc.microserviciobootcoinproducer.services;

import com.jrcc.microserviciobootcoinproducer.models.documents.Transaction;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TransactionService {
    private final StreamBridge streamBridge;

    public TransactionService(StreamBridge streamBridge) {
        this.streamBridge = streamBridge;
    }

    public void save(Transaction transaction) {
        log.info("Publicando transaction para crear!");
        streamBridge.send("saveTransaction-out-0", transaction);
    }
}

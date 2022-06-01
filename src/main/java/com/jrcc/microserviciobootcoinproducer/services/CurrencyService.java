package com.jrcc.microserviciobootcoinproducer.services;

import com.jrcc.microserviciobootcoinproducer.models.documents.Currency;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CurrencyService {
    private final StreamBridge streamBridge;

    public CurrencyService(StreamBridge streamBridge) {
        this.streamBridge = streamBridge;
    }

    public void save(Currency currency) {
        log.info("Publicando currency para crear!");
        streamBridge.send("saveCurrency-out-0", currency);
    }
}
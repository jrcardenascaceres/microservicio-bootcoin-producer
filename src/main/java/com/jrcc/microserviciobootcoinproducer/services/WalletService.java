package com.jrcc.microserviciobootcoinproducer.services;

import com.jrcc.microserviciobootcoinproducer.models.documents.Wallet;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class WalletService {
    private final StreamBridge streamBridge;

    public WalletService(StreamBridge streamBridge) {
        this.streamBridge = streamBridge;
    }

    public void save(Wallet wallet) {
        log.info("Publicando wallet para crear!");
        streamBridge.send("saveWallet-out-0", wallet);
    }
}

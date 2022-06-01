package com.jrcc.microserviciobootcoinproducer.controllers;

import com.jrcc.microserviciobootcoinproducer.models.documents.Wallet;
import com.jrcc.microserviciobootcoinproducer.services.WalletService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wallets")
public class WalletController {
    private final WalletService walletService;

    public WalletController(WalletService walletService) {
        this.walletService = walletService;
    }

    @PostMapping
    public void create(@RequestBody Wallet wallet) {
        walletService.save(wallet);
    }
}

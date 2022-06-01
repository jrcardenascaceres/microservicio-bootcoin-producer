package com.jrcc.microserviciobootcoinproducer.controllers;

import com.jrcc.microserviciobootcoinproducer.models.documents.Currency;
import com.jrcc.microserviciobootcoinproducer.services.CurrencyService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/currencys")
public class CurrencyController {
    private final CurrencyService currencyService;

    public CurrencyController(CurrencyService currencyService) {
        this.currencyService = currencyService;
    }

    @PostMapping
    public void create(@RequestBody Currency currency) {
        currencyService.save(currency);
    }
}

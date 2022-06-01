package com.jrcc.microserviciobootcoinproducer.controllers;

import com.jrcc.microserviciobootcoinproducer.models.documents.Transaction;
import com.jrcc.microserviciobootcoinproducer.services.TransactionService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transactions")
public class TransactionController {
    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @PostMapping
    public void create(@RequestBody Transaction transaction) {
        transactionService.save(transaction);
    }
}

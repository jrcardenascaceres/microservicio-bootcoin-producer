package com.jrcc.microserviciobootcoinproducer.models.documents;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.Date;


@Data
@ToString
@AllArgsConstructor
public class Transaction {

    @JsonProperty("id_transaction")
    private String idTransaction;
    @JsonProperty("id_wallet")
    private String idWallet;
    private String source;
    private String destination;
    private String subject;
    private String description;
    private String currency;
    private Double amount;
    private Double commission;
    @JsonProperty("creation_date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "America/Lima")
    private Date creationDate;
}

package com.jrcc.microserviciobootcoinproducer.models.documents;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.Date;

@Data
@ToString
@AllArgsConstructor
public class Wallet {

    @JsonProperty("id_wallet")
    private String idWallet;
    @JsonProperty("id_currency")
    private String idCurrency;
    @JsonProperty("identity_card")
    private String identityCard;
    @JsonProperty("cellphone_number")
    private String cellphoneNumber;
    private String email;
    private Double balance;
    @JsonProperty("id_card")
    private String idCard;
    @JsonProperty("creation_date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "America/Lima")
    private Date creationDate;
}


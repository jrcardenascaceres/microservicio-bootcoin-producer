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
public class Currency {

    @JsonProperty("id_currency")
    private String idCurrency;
    private String name;
    private String description;
    @JsonProperty("buying_rate")
    private Double buyingRate;
    @JsonProperty("selling_rate")
    private Double sellingRate;
    @JsonProperty("creation_date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "America/Lima")
    private Date creationDate;
}

package com.example.demo1.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TaxaJurosDTO {
    @JsonProperty("TaxaJuros")
    private double valorTaxaJuros;
}

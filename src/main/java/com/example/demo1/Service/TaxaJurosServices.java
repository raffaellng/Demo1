package com.example.demo1.Service;

import com.example.demo1.Constants.TaxaJurosConstants;
import com.example.demo1.Dto.TaxaJurosDTO;
import com.example.demo1.Service.Interfaces.ITaxaJuros;
import org.springframework.stereotype.Service;

@Service
public class TaxaJurosServices implements ITaxaJuros {

    @Override
    public TaxaJurosDTO getTaxaJuros() {
        TaxaJurosDTO taxaJurosDTO = new TaxaJurosDTO();
        taxaJurosDTO.setValorTaxaJuros(TaxaJurosConstants.TAXAS);
        return taxaJurosDTO;
    }
}

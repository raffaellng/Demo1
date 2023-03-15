package com.example.demo1.Controllers;

import com.example.demo1.Dto.TaxaJurosDTO;
import com.example.demo1.Service.Interfaces.ITaxaJuros;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/taxa-juros")
public class TaxaJurosController {

    private final ITaxaJuros _taxaJurosServices;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<TaxaJurosDTO> getCalcularJuros() {
        TaxaJurosDTO taxaJurosDTO = _taxaJurosServices.getTaxaJuros();
        return ResponseEntity.ok(taxaJurosDTO);
    }
}

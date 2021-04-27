package br.com.wwwgomes.flowershop.controller;

import br.com.wwwgomes.flowershop.dto.CompraDTO;
import br.com.wwwgomes.flowershop.service.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/compras")
public class CompraController {

    private CompraService compraService;

    @Autowired
    public CompraController(CompraService compraService) {
        this.compraService = compraService;
    }

    @PostMapping
    public void realizarCompra(@RequestBody CompraDTO compra) {
        compraService.realiza(compra);
    }
}

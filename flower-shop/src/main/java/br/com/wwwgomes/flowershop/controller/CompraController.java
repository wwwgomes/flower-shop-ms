package br.com.wwwgomes.flowershop.controller;

import br.com.wwwgomes.flowershop.dto.CompraDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/compras")
public class CompraController {

    @PostMapping
    public void realizarCompra(@RequestBody CompraDTO compaDto) {

    }
}

package br.com.wwwgomes.flowershop.service;

import br.com.wwwgomes.flowershop.dto.CompraDTO;
import br.com.wwwgomes.flowershop.dto.InfoFornecedorDTO;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;

@Service
public class CompraService {

    public void realiza(CompraDTO compra) {

        var client = new RestTemplate();

        var exchange = client.exchange("http://localhost:8081/info/" + compra.getEndereco().getEstado(),
                HttpMethod.GET,
                null,
                InfoFornecedorDTO.class);

        System.out.println(Objects.requireNonNull(exchange.getBody()).getEndereco());
    }
}

package br.com.wwwgomes.flowershop.service;

import br.com.wwwgomes.flowershop.dto.CompraDTO;
import br.com.wwwgomes.flowershop.dto.InfoFornecedorDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;

@Service
public class CompraService {

    private final RestTemplate client;

    @Autowired
    public CompraService(RestTemplate client) {
        this.client = client;
    }

    public void realiza(CompraDTO compra) {

        var exchange = client.exchange("http://fornecedor/info/" + compra.getEndereco().getEstado(),
                HttpMethod.GET,
                null,
                InfoFornecedorDTO.class);

        System.out.println(Objects.requireNonNull(exchange.getBody()).getEndereco());
    }
}

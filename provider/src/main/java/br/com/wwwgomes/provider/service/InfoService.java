package br.com.wwwgomes.provider.service;

import br.com.wwwgomes.provider.entity.InfoFornecedor;
import br.com.wwwgomes.provider.repository.InfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InfoService {

    private final InfoRepository infoRepository;

    @Autowired
    public InfoService(InfoRepository infoRepository) {
        this.infoRepository = infoRepository;
    }

    public InfoFornecedor getInfoPor(String estado) {
        return infoRepository.findByEstado(estado);
    }
}

package br.com.fiap.service;

import br.com.fiap.exception.ResourceNotFoundException;
import br.com.fiap.model.Coleta;
import br.com.fiap.repository.ColetaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ColetaService {
    @Autowired
    private ColetaRepository coletaRepository;

    public List<Coleta> getAllColetas() {
        return coletaRepository.findAll();
    }

    public Optional<Coleta> getColetaById(Long id) {
        return coletaRepository.findById(id);
    }

    public Coleta createColeta(Coleta coleta) {
        return coletaRepository.save(coleta);
    }

    public Coleta updateColeta(Long id, Coleta coletaDetails) {
        Coleta coleta = coletaRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Coleta not found"));
        coleta.setEndereco(coletaDetails.getEndereco());
        coleta.setDataHora(coletaDetails.getDataHora());
        return coletaRepository.save(coleta);
    }

    public void deleteColeta(Long id) {
        Coleta coleta = coletaRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Coleta not found"));
        coletaRepository.delete(coleta);
    }
}

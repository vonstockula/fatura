package com.example.faturat.services;

import com.example.faturat.entities.FaturaUjit;
import com.example.faturat.repositories.FaturaUjitRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class FaturaUjitService {

    private final FaturaUjitRepository faturaUjitRepository;

    public FaturaUjitService(FaturaUjitRepository faturaUjitRepository) {
        this.faturaUjitRepository = faturaUjitRepository;
    }

    public List<FaturaUjit> getAllFaturat() {
        return faturaUjitRepository.findAll();
    }

    public FaturaUjit createFatura(FaturaUjit faturaUjit) {
        return faturaUjitRepository.save(faturaUjit);
    }

    public FaturaUjit getFaturaById(Long id) {
        return faturaUjitRepository.findById(id).orElse(null);
    }

    public void deleteFatura(Long id) {
        faturaUjitRepository.deleteById(id);
    }
}



package com.example.faturat.services;

import com.example.faturat.entities.FaturaUjit;

import java.util.List;

public interface FaturaUjitSrv {

    List<FaturaUjit> getAllFaturat();

    FaturaUjit createFatura(FaturaUjit faturaUjit);

    FaturaUjit getFaturaById(Long id);

    void deleteFatura(Long id);

}

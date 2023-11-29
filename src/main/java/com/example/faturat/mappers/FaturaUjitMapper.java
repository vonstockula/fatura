package com.example.faturat.mappers;


import com.example.faturat.entities.FaturaUjit;
import com.example.faturat.models.FaturaUjitDTO;
import org.springframework.stereotype.Component;



@Component
public class FaturaUjitMapper {

    public FaturaUjit mapToEntity(FaturaUjitDTO faturaUjitDTO) {
        FaturaUjit faturaUjit = new FaturaUjit();

        return faturaUjit;
    }

    public FaturaUjitDTO mapToDTO(FaturaUjit faturaUjit) {
        FaturaUjitDTO faturaUjitDTO = new FaturaUjitDTO();
return faturaUjitDTO;
    }
}




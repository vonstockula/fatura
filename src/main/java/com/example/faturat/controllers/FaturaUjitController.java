package com.example.faturat.controllers;

import com.example.faturat.entities.FaturaUjit;
import com.example.faturat.mappers.FaturaUjitMapper;
import com.example.faturat.models.FaturaUjitDTO;
import com.example.faturat.services.FaturaUjitService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/faturat")
public class FaturaUjitController {

    private final FaturaUjitService faturaUjitService;
    private final FaturaUjitMapper faturaUjitMapper;

    public FaturaUjitController(FaturaUjitService faturaUjitService, FaturaUjitMapper faturaUjitMapper) {
        this.faturaUjitService = faturaUjitService;
        this.faturaUjitMapper = faturaUjitMapper;
    }

    @GetMapping
    public ResponseEntity<?> lexoTeGjithaFaturat() {
        return ResponseEntity.ok(faturaUjitService.getAllFaturat());
    }

    @PostMapping
    public ResponseEntity<?> krijoFaturen(@RequestBody FaturaUjitDTO faturaUjitDTO) {
        FaturaUjit faturaUjit = faturaUjitMapper.mapToEntity(faturaUjitDTO);
        FaturaUjit createdFatura = faturaUjitService.createFatura(faturaUjit);
        return ResponseEntity.status(HttpStatus.CREATED).body(faturaUjitMapper.mapToDTO(createdFatura));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> lexoFaturen(@PathVariable Long id) {
        FaturaUjit faturaUjit = faturaUjitService.getFaturaById(id);
        if (faturaUjit != null) {
            return ResponseEntity.ok(faturaUjitMapper.mapToDTO(faturaUjit));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> fshijFaturen(@PathVariable Long id) {
        faturaUjitService.deleteFatura(id);
        return ResponseEntity.ok().build();
    }
}

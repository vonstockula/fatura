package com.example.faturat.models;

public class FaturaUjitDTO {
    private String nrFatures;
    private Double sasiaUjit;
    private Double cmimiPerMetraKub;


    public FaturaUjitDTO() {

    }

    public FaturaUjitDTO(String nrFatures, Double sasiaUjit, Double cmimiPerMetraKub) {
        this.nrFatures = nrFatures;
        this.sasiaUjit = sasiaUjit;
        this.cmimiPerMetraKub = cmimiPerMetraKub;
    }


    public String getNrFatures() {
        return nrFatures;
    }

    public void setNrFatures(String nrFatures) {
        this.nrFatures = nrFatures;
    }

    public Double getSasiaUjit() {
        return sasiaUjit;
    }

    public void setSasiaUjit(Double sasiaUjit) {
        this.sasiaUjit = sasiaUjit;
    }

    public Double getCmimiPerMetraKub() {
        return cmimiPerMetraKub;
    }

    public void setCmimiPerMetraKub(Double cmimiPerMetraKub) {
        this.cmimiPerMetraKub = cmimiPerMetraKub;
    }


    @Override
    public String toString() {
        return "FaturaUjitDTO{" +
                "nrFatures='" + nrFatures + '\'' +
                ", sasiaUjit=" + sasiaUjit +
                ", cmimiPerMetraKub=" + cmimiPerMetraKub +
                '}';
    }
}

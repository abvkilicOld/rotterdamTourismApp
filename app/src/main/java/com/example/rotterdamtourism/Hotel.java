package com.example.rotterdamtourism;

public class Hotel {
    private String adres;
    private String name;

    public Hotel(String adres, String name) {
        this.adres = adres;
        this.name = name;
    }

    public Hotel() {
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

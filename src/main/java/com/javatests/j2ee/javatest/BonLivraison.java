package com.javatests.j2ee.javatest;

import jakarta.persistence.*;
@Entity
@Table(name = "bon_livraison")
public class BonLivraison {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numero;
    private String adresseLivraison;
    private Long clientId;
    private String dateLivraison;

    // Getters et Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getAdresseLivraison() {
        return adresseLivraison;
    }
    public void setAdresseLivraison(String adresseLivraison) {
        this.adresseLivraison = adresseLivraison;
    }
    public Long getClientId() {
        return clientId;
    }
    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }
    public String getDateLivraison() {
        return dateLivraison;
    }
    public void setDateLivraison(String dateLivraison) {
        this.dateLivraison = dateLivraison;
    }

}


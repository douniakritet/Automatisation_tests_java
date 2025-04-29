package com.javatests.j2ee.javatest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LigneDeCommandeTest {

    @Test
    void testTotalInitial() {
        LigneDeCommande ligne = new LigneDeCommande(1, 101, 55, 2, 50.0);
        assertEquals(100.0, ligne.getTotal(), 0.001, "Le total initial est incorrect");
    }

    @Test
    void testModificationQuantite() {
        LigneDeCommande ligne = new LigneDeCommande(2, 102, 66, 2, 30.0);
        ligne.setQuantite(4);
        assertEquals(120.0, ligne.getTotal(), 0.001, "Le total après changement de quantité est incorrect");
    }

    @Test
    void testModificationPrix() {
        LigneDeCommande ligne = new LigneDeCommande(3, 103, 77, 1, 10.0);
        ligne.setPrixUnitaire(15.0);
        assertEquals(15.0, ligne.getTotal(), 0.001, "Le total après changement de prix unitaire est incorrect");
    }

    @Test
    void testRemise() {
        LigneDeCommande ligne = new LigneDeCommande(4, 104, 88, 2, 40.0); // Total = 80.0
        ligne.appliquerRemisePourcentage(25); // 25% de 80 = 60
        assertEquals(60.0, ligne.getTotal(), 0.001, "Le total après réduction est incorrect");
    }

    @Test
    void testDescription() {
        LigneDeCommande ligne = new LigneDeCommande(5, 105, 99, 5, 10.0);
        String desc = ligne.description();
        assertTrue(desc.contains("Commande #105"), "La description ne contient pas le bon numéro de commande");
        assertTrue(desc.contains("Produit #99"), "La description ne contient pas le bon numéro de produit");
    }
}



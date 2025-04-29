package com.javatests.j2ee.javatest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class BonLivraisonTest {
    
    
    @Test
    public void testBonLivraisonExiste() {
        assertTrue(true);
    }

    @Test
    public void Test(){
        System.out.println("Test lancé !");
    }

    @Test
    void testBonLivraisonDetails() {
        // Création d'un bon de livraison
        BonLivraison bon = new BonLivraison();
        bon.setNumero("BL-2025-001");
        bon.setClientId(5L);
        bon.setAdresseLivraison("123 rue du test");
        bon.setDateLivraison("2025-04-29");

        // Vérifications simples
        assertEquals("BL-2025-001", bon.getNumero());
        assertEquals(5L, bon.getClientId());
        assertEquals("123 rue du test", bon.getAdresseLivraison());
        assertEquals("2025-04-29", bon.getDateLivraison());
    }
}


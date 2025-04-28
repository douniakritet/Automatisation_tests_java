package com.javatests.j2ee.javatest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LigneFactureTest {

    private LigneFacture ligneFacture;

    @BeforeEach
    void setUp() {
        ligneFacture = new LigneFacture();
    }

    @Test
    void testAddLigne() {
        assertTrue(ligneFacture.addLigne("Facture A"));
        assertEquals(1, ligneFacture.getLigneCount());
    }

    @Test
    void testAddInvalidLigne() {
        assertFalse(ligneFacture.addLigne(""));
        assertFalse(ligneFacture.addLigne(null));
    }

    @Test
    void testRemoveLigne() {
        ligneFacture.addLigne("Facture B");
        assertTrue(ligneFacture.removeLigne("Facture B"));
        assertEquals(0, ligneFacture.getLigneCount());
    }

    @Test
    void testClearLignes() {
        ligneFacture.addLigne("Facture C");
        ligneFacture.addLigne("Facture D");
        ligneFacture.clear();
        assertEquals(0, ligneFacture.getLigneCount());
    }
}

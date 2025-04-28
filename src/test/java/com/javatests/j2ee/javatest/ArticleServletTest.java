package com.javatests.j2ee.javatest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArticleTest {

    private Article article;

    @BeforeEach
    void setUp() {
        article = new Article("Produit X", 20.0);
    }

    @Test
    void testArticleCreation() {
        assertEquals("Produit X", article.getName());
        assertEquals(20.0, article.getPrice());
    }

    @Test
    void testInvalidArticleCreation() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            new Article("", 20.0);
        });
        assertEquals("Nom ou prix invalide", exception.getMessage());
        
        exception = assertThrows(IllegalArgumentException.class, () -> {
            new Article("Produit Y", -1);
        });
        assertEquals("Nom ou prix invalide", exception.getMessage());
    }

    @Test
    void testUpdatePrice() {
        assertTrue(article.updatePrice(25.0));
        assertEquals(25.0, article.getPrice());

        assertFalse(article.updatePrice(-5.0));
    }

    @Test
    void testUpdateName() {
        assertTrue(article.updateName("Produit Z"));
        assertEquals("Produit Z", article.getName());

        assertFalse(article.updateName(""));
        assertFalse(article.updateName(null));
    }
}

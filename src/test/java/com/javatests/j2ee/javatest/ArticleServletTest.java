package com.javatests.j2ee.javatest;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import jakarta.servlet.http.*;
import java.io.*;

public class ArticleServletTest {

    @Test
    public void testDoGet() throws Exception {
        // Création des mocks
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        StringWriter stringWriter = new StringWriter();
        PrintWriter writer = new PrintWriter(stringWriter);

        // Configuration du comportement du mock
        when(response.getWriter()).thenReturn(writer);

        // Exécution du servlet
        new ArticleServlet().doGet(request, response);

        // Vérification du contenu généré
        writer.flush(); // Assure que tout est écrit dans le StringWriter
        String output = stringWriter.toString();
        assert output.contains("<h1>Liste des articles</h1>");
        assert output.contains("<li>Article 1</li>");
        assert output.contains("<li>Article 2</li>");
        assert output.contains("<li>Article 3</li>");
    }
}

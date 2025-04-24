package com.javatests.j2ee.javatest;

import org.junit.jupiter.api.Test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.PrintWriter;
import java.io.StringWriter;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class testHelloServlet {
    @Test
    public void testHelloServlet() throws Exception {
        // Création des mocks
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);

        // Simuler le PrintWriter
        StringWriter stringWriter = new StringWriter();
        PrintWriter writer = new PrintWriter(stringWriter);
        when(response.getWriter()).thenReturn(writer);

        // Appel de la servlet
        HelloServlet servlet = new HelloServlet();
        servlet.doGet(request, response);

        writer.flush(); // forcer l'écriture

        // Récupérer et vérifier le résultat
        String result = stringWriter.toString();
        System.out.println("Contenu retourné par le servlet : " + result);
        assertTrue(result.contains("Hello,World!"), "La sortie ne contient pas 'Hello World!'");
    }
}
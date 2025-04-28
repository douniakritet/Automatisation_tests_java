package com.javatests.j2ee.javatest;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

@WebServlet("/articles")
public class ArticleServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        List<String> articles = Arrays.asList("Article 1", "Article 2", "Article 3");

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1>Liste des articles</h1>");
        out.println("<ul>");
        for (String article : articles) {
            out.println("<li>" + article + "</li>");
        }
        out.println("</ul>");
    }
}

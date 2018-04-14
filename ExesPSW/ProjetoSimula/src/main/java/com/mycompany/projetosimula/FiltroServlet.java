/*
 * Servlet de Filtragem das informações sobre Nome do Atista e Estilo Musical inseridos na busca em ExibeArtista
 */
package com.mycompany.projetosimula;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Claudio Freias
 */
@WebServlet("/FiltroServlet")
public class FiltroServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet FiltroServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet FiltroServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    /**
     * Método doGet utilizado para validar informações do Nome do Aritsta e Estilo Musical inseridos no ExibeArtista
     * para retorna o Artista correspondente encontrado
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException se ocorrer erro de Servlet
     * @throws IOException se ocorrer erro de Entrada/Saida
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nome, estilo;
        String errorArtista, errorEstilo, artEncontrado;
        boolean formValido = true;
        int artistaEncontrado = 0;
        
        List<Artista> artistas = (List<Artista>) request.getServletContext().getAttribute("lista");
        Artista artFiltra = new Artista();
        
        ArrayList<Artista> artistaArray = new ArrayList<Artista>();
        
        nome = request.getParameter("nomeArtista");

        estilo = request.getParameter("estiloMusical"); 
        
        if (estilo.isEmpty()) {
            errorEstilo = "É necessário selecionar o Estilo Musical do Artista.";
            request.setAttribute("errorEstilo", errorEstilo);
            formValido = false;             
        }      
        
        if (nome.isEmpty()) {
            errorArtista = "É necessário preencher o nome do Artista.";
            request.setAttribute("errorArtista", errorArtista);
            formValido = false;
        }else if(nome.length() > 30){
            errorArtista = "Nome do Artista acima de 30 caracteres.";
            request.setAttribute("errorArtista", errorArtista);
            formValido = false;            
        }
        
        if(formValido){
            for(int i = 0; i < artistas.size(); i++){
                artFiltra = artistas.get(i);
                if(artFiltra.getNomeArtista().equalsIgnoreCase(nome) && artFiltra.getEstiloMusical().equals(estilo)){ 
                    artEncontrado = "Artista " + artFiltra.getNomeArtista() + " encontrado com Banda " + artFiltra.getNomeBanda(); 
                    request.setAttribute("artEncontrado", artEncontrado);
                    artistaArray.add(artFiltra);
                    artistaEncontrado = 1;
                    break;
                }
            }

            if(artistaEncontrado == 0){
                artEncontrado = "Artista e Banda não compatíveis";
                request.setAttribute("artEncontrado", artEncontrado);
            }
        }
        
        request.setAttribute("listaFiltrada", artistaArray);
        request.getRequestDispatcher("ExibeArtista.jsp").forward(request, response);


            
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    /**
     * Curto descritivo do Servlet
     *
     * @return tipo String
     */
    @Override
    public String getServletInfo() {
        return "Servlet para filtrar Artista por Nome e Estilo Musical";
    }

}

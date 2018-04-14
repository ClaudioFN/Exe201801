/*
 * Servlet principal onde ocorre a validação do que é inserido na página em Simula.jsp e enviado para o 
 * ExibeArtista.jsp 
 */
package com.mycompany.projetosimula;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.mycompany.projetosimula.Artista;
import java.util.Collections;
import java.util.List;
/**
 *
 * @author Aluno
 */
@WebServlet("/ServletSimula")
public class ServletSimula extends HttpServlet {
    ArrayList<Artista> lista = new ArrayList<Artista>(); 

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletSimula</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletSimula at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    /**
     * Método usado doGet para tratar as informações enviadas pelo Simula.jsp
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException para informar erros do Servlet
     * @throws IOException parar erros de Entrada/Saida
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String errorArtista, errorBanda, errorCarreira, errorEstilo;
        String anosCarrei;
        int anosCarreira = -1;
        String nome, estilo, banda;
        
        int artistaInvalido = 0;
        
        Artista art = new Artista();
        Artista artValida = new Artista();
        
        if(request.getServletContext().getAttribute("lista") == null){
                request.getServletContext().setAttribute("lista", new ArrayList<Artista>());
        }        
        lista = (ArrayList<Artista>)request.getServletContext().getAttribute("lista");
        
        nome = request.getParameter("nomeArtista");

        estilo = request.getParameter("estiloMusical");

        banda = request.getParameter("banda");
        

        anosCarrei = request.getParameter("anosCarreira");
        if(!anosCarrei.isEmpty()){
             anosCarreira = Integer.parseInt(anosCarrei);
        }
        boolean formValido = true;
        
        //Realiza a Validação 

        if (nome.isEmpty()) {
            errorArtista = "É necessário preencher o nome do Artista.";
            request.setAttribute("errorArtista", errorArtista);
            formValido = false;
        }else if(nome.length() > 30){
            errorArtista = "Nome do Artista acima de 30 caracteres.";
            request.setAttribute("errorArtista", errorArtista);
            formValido = false;            
        }else{
            for(int i = 0; i < lista.size(); i++){
                artValida = lista.get(i);
                if(artValida.getNomeArtista().equalsIgnoreCase(nome)){ 
                    artistaInvalido = 1;
                    errorArtista = "Artista já cadastrado.";
                    request.setAttribute("errorArtista", errorArtista);
                    formValido = false;
                    break;
                }
            }
            
            if(artistaInvalido != 1){
                art.setNomeArtista(nome);
            }
        }           

        if (!banda.isEmpty()) {
            if(banda.length() > 40){
                errorArtista = "Banda tem mais de 40 caracteres.";
                request.setAttribute("errorArtista", errorArtista);
                formValido = false;                
            }else{
                art.setNomeBanda(banda);
                //CASO SEJA IDEAL O TESTE PARA VER SE A BANDA JÁ ESTA NA LISTA DE ALGUM ARTISTA
                //for(int i = 0; i < lista.size(); i++){
                  //  artValida = lista.get(i);
                    //    if(artValida.getNomeBanda().equalsIgnoreCase(banda) && artistaInvalido == 1){
                      //      errorBanda = "Banda já adicionada para --> " + "(" + artValida.getAluno() +")";
                        //    request.setAttribute("errorMateria", errorBanda);
                          //  formValido = false;   
                            //break;
                        //}
            //}
                        
            }                
        }
        
        if (estilo.isEmpty()) {
            errorEstilo = "É necessário selecionar o Estilo Musical do Artista.";
            request.setAttribute("errorEstilo", errorEstilo);
            formValido = false;             
        }else{
            art.setEstiloMusical(estilo);
        }    
        
        if (anosCarreira < 0 || anosCarreira > 100) {
            errorCarreira = "Preencher Anos de Carreira do Artista com valores válidos.";
            request.setAttribute("errorCarreira", errorCarreira);
            formValido = false;             
        }else{
            art.setAnosCarreira(anosCarreira);
        }          
        
            
        if(formValido){ 
            art.setIdentifica(lista.size() + 1);
            lista.add(art);
            Collections.sort(lista);
            request.setAttribute("lista", lista);
            request.getRequestDispatcher("ExibeArtista.jsp").forward(request, response);
        }else{
            request.getRequestDispatcher("Simula.jsp").forward(request, response);
        }        
                   
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Retorna com curta descrição do Servlet
     *
     * @return tipo String
     */
    @Override
    public String getServletInfo() {
        return "Servlet de Validação das informações inseridas sobre o artista em Simula.jsp";
    }

}

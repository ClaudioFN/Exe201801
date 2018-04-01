package classJSP;

/*
 */

import classJSP.Alunos;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.DispatcherType;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Claudio Freitas
 */
@WebServlet("/NewS")
public class NewS extends HttpServlet {
            
    ArrayList<Alunos> lista = new ArrayList<Alunos>(); 
    /**
     * Servlet para atribuir valores aos alunos e suas Notas após validar informações
     * Informações tratadas no doGet
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException errors do server
     * @throws IOException errors de Entrada/Saida
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NewS</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet NewS at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
            String errorAluno, errorN1, errorN2, errorNF, errorPOF, errorFreq;
            String situacaoAluno = "";
            
            double n1 = -1, n2 = -1, nf = -1, pof = -1, freq = -1;
            Alunos al = new Alunos(); 
            
            String name = request.getParameter("aluno");
            
            String N1 = request.getParameter("n1");
            if(!N1.isEmpty()){
                 n1 = Double.parseDouble(N1);
            }
            
            String N2 = request.getParameter("n2");
            if(!N2.isEmpty()){
                 n2 = Double.parseDouble(N2);
            }
            
            String NF = request.getParameter("nf");
            if(!NF.isEmpty()){
                 nf = Double.parseDouble(NF);
            }
            
            String POF = request.getParameter("pof");
            if(!POF.isEmpty()){
                 pof = Double.parseDouble(POF);
            }
            
            String FREQ = request.getParameter("freq");
            if(!FREQ.isEmpty()){
                freq = Double.parseDouble(FREQ);
            }

            boolean formValido = true;
            
            
            //Realiza a Validação 
            if (name.isEmpty()) {
                errorAluno = "É necessário preencher o nome do aluno.";
                request.setAttribute("errorAluno", errorAluno);
                formValido = false;
            }else{
                al.setAluno(name);
            }            
            
            if(n1 < 0 || n1 > 10){
                errorN1 = "Valor na Nota 1 inválido. Inserir valor entre 0 e 10.";
                request.setAttribute("errorN1", errorN1);
                formValido = false;                
            }else{
                al.setN1(n1);
            }
            
            if(n2 < 0 || n2 > 10){
                errorN2 = "Valor da Nota 2 inválido. Inserir valor entre 0 e 10.";
                request.setAttribute("errorN2", errorN2);
                formValido = false;                
            }else{
                al.setN2(n2);
            }

            if(nf < 0 || n2 > 10){
                errorNF = "Valor da Nota Final inválido. Inserir valor entre 0 e 10.";
                request.setAttribute("errorNF", errorNF);
                formValido = false;                
            }else{
                al.setNF(nf);
            }

            if(pof < 0 || n2 > 10){
                errorPOF = "Valor da Prova Final inválido. Inserir valor entre 0 e 10.";
                request.setAttribute("errorPOF", errorPOF);//Os dois campos tem a opção de serem preenchidos
                formValido = false;                
            }else if(n1 >= 7 && n2 >= 7 && pof > 0){
                errorPOF = "O Aluno " + name + " já esta com Notas 1 e 2 acima de 7. Alterar para preencher esse campo.";
                request.setAttribute("errorPOF", errorPOF);
                formValido = false;                     
            }else{
                al.setPOF(pof);
            }

            if(freq < 0 || freq > 100){
                errorFreq = "Valor da Frequência inválido. Inserir valor entre 0 e 100 para a Frequência.";
                request.setAttribute("errorFreq", errorFreq);
                formValido = false;                
            }else{
                al.setFreq(freq);
            }            
          
            situacaoAluno = al.situacao(n1, n2, pof, nf, freq);
            al.setSituacaoAluno(situacaoAluno);
            if(formValido){              
                lista.add(al);                 
                request.setAttribute("lista", lista);
                request.getRequestDispatcher("formulario.jsp").forward(request, response);
            }else{
                request.getRequestDispatcher("jspsala.jsp").forward(request, response);
            }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }

    /**
     * Curta descrição do Servlet
     *
     * @return String 
     */
    @Override
    public String getServletInfo() {
        return "Servlet para atribuir valores aos alunos e suas Notas após validar informações";
    }

}

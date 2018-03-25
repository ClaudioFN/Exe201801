<%-- 
    Document   : formulario
    Created on : 25/03/2018, 19:11:30
    Author     : Claudio Freitas
--%>


<%@page import="java.util.ArrayList"%>
<%@page import="classJSP.Alunos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Grade de Alunos</title>
    </head>
    <body>
       <form action="jspsala">
           <table align="center" style="height:100%;width:100%;" border="1">
            <h1>Sucesso no Formulário</h1>
           </table>
                <%!
                   ArrayList<Alunos> alunos = new ArrayList<Alunos>();
                   Alunos nAluno = new Alunos();
                %>
                <%
                    nAluno = (Alunos)request.getAttribute("al");
                    alunos.add(nAluno);
                %>
                <table align="center" style="height:100%;width:100%;" border="1">
                  <caption>TABELA EXERCÍCIO 1</caption>
                  <tr>
                    <th>Aluno</th>
                    <th>Nota 1</th>
                    <th>Nota 2</th>
                    <th>Nota Final</th>
                    <th>Prova Final</th>
                    <th>Situação</th>	    	    
                  </tr>
                 <% for(int i = 0; i < alunos.size(); i++){%>                  
                    <tr>
                      <td> <%= alunos.get(i).getAluno() %> </td>
                      <td> <%= alunos.get(i).getN1() %> </td>
                      <td> <%= alunos.get(i).getN2() %> </td>
                      <td> <%= alunos.get(i).getNF() %> </td>
                      <td> <%= alunos.get(i).getPOF() %> </td>
                      <td> <%= alunos.get(i).getSituacaoAluno() %></td>
                    </tr>
            <%
                }
            %>
                </table>
             </table>     
        </form>                
        </div>            
    </body>
</html>

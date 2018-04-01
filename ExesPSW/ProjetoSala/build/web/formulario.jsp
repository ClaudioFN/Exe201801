<%-- 
    Document   : formulario
    Created on : 25/03/2018, 19:11:30
    Author     : Claudio Freitas
--%>


<%@page import="java.util.ArrayList"%>
<%@page import="classJSP.Alunos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <c:set var="cliente" value="${lista}" scope="page" />
        <title>Grade de Alunos</title>
    </head>
    <body>
       <form action="jspsala">
           <table align="center" style="height:100%;width:100%;" border="1">
            <h1>Sucesso no Formulário</h1>
           </table>
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
                 <c:forEach var="aluno" items="${lista}">
                    <tr>
                      <td> ${aluno.getAluno()} </td>
                      <td> ${aluno.getN1()} </td>
                      <td> ${aluno.getN2()} </td>
                      <td> ${aluno.getNF()} </td>
                      <td> ${aluno.getPOF()} </td>
                      <td> ${aluno.getSituacaoAluno()} </td>
                    </tr>
                 </c:forEach>
                </table>
             </table>     
        </form>                
        </div>            
    </body>
</html>

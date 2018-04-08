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
                <table align="center" style="height:100%;width:100%;" border="1" class="table table-striped">
                  <caption><strong>TABELA EXERCÍCIO 1</strong></caption>
                  <tr>
                    <th>Aluno</th>
                    <th>Nota 1</th>
                    <th>Nota 2</th>
                    <th>Nota Final</th>
                    <th>Prova Final</th>
                    <th>Situação</th>
                    <th>Matéria</th>
                  </tr>
                    <c:forEach var="alunoAtual" items="${lista}">
                        <tr>
                            <td> ${alunoAtual.getAluno()} </td>  
                            <td> ${alunoAtual.getN1()} </td>
                            <td> ${alunoAtual.getN2()} </td>
                            <td> ${alunoAtual.getNF()} </td>
                            <td> ${alunoAtual.getPOF()} </td>
                            <td> ${alunoAtual.getSituacaoAluno()} </td>
                            <td> ${alunoAtual.getMateria()} </td>
                    </c:forEach>  
                </table>
           <table align="center">
               <tr align="center">
                   <td align="center">
                       <input type="button" value="Voltar" onClick="history.go(-1)" class="btn btn-primary">
                   </td>
               </tr>
           </table>
        </form>                
        </div> 
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
    <script src="js/jquery-3.2.1.slim.min.js"></script>
    <script src="js/1.12.9/umd/popper.min.js"></script>   
    
    </body>
</html>

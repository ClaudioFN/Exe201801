<%-- 
    Document   : jspinfo
    Created on : 25/03/2018, 19:20:34
    Author     : Claudio Freitas
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="tags" uri="WEB-INF/tags.tld"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Projeto Sala</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
    <form method="GET" action="NewS">
        
        <table align="center" style="height:100%;width:100%;" border=1 class="table table-striped">
            <tr align="center" >
                <td align='center'>
                    <strong>Preencher Campos de Formulário</strong>
                </td>
            <tr> 
            <tr align="center">
              <td align='center'>
                 Aluno: <input type="text" name="aluno" value="${param.aluno}" placeholder="Nome do Aluno(a)"> &nbsp <strong>${errorAluno}</strong>
              </td>
            </tr>
            <tr align="center">
              <td align='center'>
                 Nota 1: <input type="text" name="n1" value="${param.n1}" placeholder="Primeira Nota"> &nbsp <strong>${errorN1}</strong>
              </td>
            </tr> 
            <tr align="center">
              <td align='center'>
                 Nota 2: <input type="text" name="n2" value="${param.n2}" placeholder="Segunda Nota"> &nbsp <strong>${errorN2}</strong>
              </td>
             </tr> 
            <tr align="center">
              <td align='center'>
                 Nota Final: <input type="text" name="nf" value="${param.nf}" placeholder="Média"> &nbsp <strong>${errorNF}</strong>
              </td>
            </tr>                       
            <tr align="center">
              <td align='center'>                  
                 Prova Final:  <input type="text" name="pof" value="${param.pof}" placeholder="Prova Final"> &nbsp <strong>${errorPOF}</strong>
              </td>
            </tr>  
            <tr align="center">
              <td align='center'>   
                 Frequência: <input type="text" name="freq" value="${param.freq}" placeholder="Aulas que Compareceu"> &nbsp <strong>${errorFreq}</strong>
              </td>
            </tr>
            <tr align="center">
              <td align='center'>   
                 Matéria: <tags:SelectCursoTag cursoSelecionado="${param.materia}"/> &nbsp <strong>${errorMateria}</strong>
              </td>
            </tr>               
            <tr align="center">
              <td align='center'>                     
                <input name="submit" type="reset" value="Limpar" name="btLimpa" class="btn btn-primary">&nbsp &nbsp
                <input type="submit" name="text" value="Enviar" class="btn btn-primary">
              </td>
            </tr>
         </table>    
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
    <script src="js/jquery-3.2.1.slim.min.js"></script>
    <script src="js/1.12.9/umd/popper.min.js"></script>                   
    </form>
    </body>
</html>

<%-- 
    Document   : jspinfo
    Created on : 25/03/2018, 19:20:34
    Author     : Claudio Freitas
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Projeto Sala</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
    <form method="GET" action="NewS">
        <table align="center" style="height:100%;width:100%;" border=1>
            <caption> Preencher Campos de Formulário</caption>
               <tr align="center">
                 <td align='center'>
                    Aluno: <input type="text" name="aluno" value="<%= request.getParameter("aluno") == null ? "" : request.getParameter("aluno")%>" > <%= request.getAttribute("errorAluno") != null ? request.getAttribute("errorAluno") : ""%>
                 </td>
               </tr>
               <tr align="center">
                 <td align='center'>
                    Nota 1: <input type="text" name="n1" value="<%= request.getParameter("n1") == null ? "" : request.getParameter("n1")%>" > <%= request.getAttribute("errorN1") != null ? request.getAttribute("errorN1") : ""%>
                 </td>
               </tr> 
               <tr align="center">
                 <td align='center'>
                    Nota 2: <input type="text" name="n2" value="<%= request.getParameter("n2") == null ? "" : request.getParameter("n2")%>" > <%= request.getAttribute("errorN2") != null ? request.getAttribute("errorN2") : ""%>
                 </td>
                </tr> 
               <tr align="center">
                 <td align='center'>
                    Nota Final: <input type="text" name="nf" value="<%= request.getParameter("nf") == null ? "" : request.getParameter("nf")%>" > <%= request.getAttribute("errorNF") != null ? request.getAttribute("errorNF") : ""%>
                 </td>
               </tr>                       
               <tr align="center">
                 <td align='center'>                  
                    Prova Final:  <input type="text" name="pof" value="<%= request.getParameter("pof") == null ? "" : request.getParameter("pof")%>" > <%= request.getAttribute("errorPOF") != null ? request.getAttribute("errorPOF") : ""%>
                 </td>
               </tr>  
               <tr align="center">
                 <td align='center'>   
                    Frequência: <input type="text" name="freq" value="<%= request.getParameter("freq") == null ? "" : request.getParameter("freq")%>" > <%= request.getAttribute("errorFreq") != null ? request.getAttribute("errorFreq") : ""%>
                 </td>
               </tr>
               <tr align="center">
                 <td align='center'>                     
                   <input type="submit" name="text" value="Enviar">
                 </td>
               </tr>
         </table>     
    </form>
    </body>
</html>

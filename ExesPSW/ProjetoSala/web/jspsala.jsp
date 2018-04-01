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
                    Aluno: <input type="text" name="aluno" value="${param.aluno}" >${errorAluno}
                 </td>
               </tr>
               <tr align="center">
                 <td align='center'>
                    Nota 1: <input type="text" name="n1" value="${param.n1}" > ${errorN1}
                 </td>
               </tr> 
               <tr align="center">
                 <td align='center'>
                    Nota 2: <input type="text" name="n2" value="${param.n2}" > ${errorN1}
                 </td>
                </tr> 
               <tr align="center">
                 <td align='center'>
                    Nota Final: <input type="text" name="nf" value="${param.nf}" > ${errorNF}
                 </td>
               </tr>                       
               <tr align="center">
                 <td align='center'>                  
                    Prova Final:  <input type="text" name="pof" value="${param.pof}" > ${errorPOF}
                 </td>
               </tr>  
               <tr align="center">
                 <td align='center'>   
                    Frequência: <input type="text" name="freq" value="${param.freq}" > ${errorPOF}
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

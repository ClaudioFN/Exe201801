<%-- 
    Document   : ExibeArtista
    Created on : 09/04/2018, 19:55:22
    Author     : Claudio Freitas
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="com.mycompany.projetosimula.Artista"%>
<%@ taglib prefix="tagestilo" uri="WEB-INF/tagEstilo.tld"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<!-- TAGLIB PARA USAR JSTL -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- TAGLIB PARA USAR JSTL -->
<!-- BOOTSTRAP -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<script src="js/jquery-3.2.1.slim.min.js"></script>
<script src="js/1.12.9/umd/popper.min.js"></script>   
<!-- BOOTSTRAP -->
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Grade de Artista</title>
    </head>
    <body>
       <!-- AQUI MOSTRA OS ARTISTAS QUE SÃO PREENCHIDOS NO SIMULA.JSP E CASO CLIQUE EM EXLUIR, AS INFORMAÇÕES VÃO SER ENVIADAS PARA O ExcluirArtista-->
       <form method="GET" action="ExcluirArtista">
            <table align="center" border="1" class="table table-striped table-dark">
              <tr>
                <th>Nome do Artista</th>
                <th>Banda</th>
                <th>Anos de Carreira</th>
                <th>Estilo Musical</th>
                <th>Excluir</th>
              </tr>
                <c:forEach var="artista" items="${lista}">
                    <tr>
                        <td> ${artista.getNomeArtista()} </td>
                        <td> ${artista.getNomeBanda()} </td>
                        <td> ${artista.getAnosCarreira()} </td>
                        <td> ${artista.getEstiloMusical()} </td>
                        <c:url value="/ExcluirArtista" var="excluirUrl" scope="page"> 
                            <c:param name="id" value="${artista.getIdentifica()}"/>
                        </c:url>    
                        <td><a href="${excluirUrl}" class="btn btn-primary"> Excluir </a></td>
                </c:forEach>                       
            </table>
        </form>       
        <table  align="center">
            <tr align="center">
                <td align="center"><!-- MENSAGEM DE RETORNO SOBRE EXCLUSÃO DO ARTISTA-->
                    <font color="blue">${artistaExcluido}</font><br>
                </td>
            </tr>                
        </table>
       <!-- SE A LISTA DE ARTISTAS ESTIVER COM ALGUM ARTISTA, EXIBE A PESQUISA/FILTRO -->          
       <c:if test="${lista != null}">
       <form method="GET" action="FiltroServlet">
           <div class="form-group align-items-center">
            <table align="center" border="1" class="table table-striped table-dark">
                <tr align="center">
                  <td align='center'>
                    <div class="col-5">
                      Nome Artista: <input type="text" class="form-control" name="nomeArtista" value="${param.nomeArtista}" placeholder="Pesquisar Nome do Arista" maxlength="50"> &nbsp <strong>${errorArtista}</strong>
                    </div>
                  </td>
                </tr>
                <tr align="center">
                  <td align='center'>
                      <div class="col-4">
                       Estilo Musical: <tagestilo:CursorEstilo estiloSelecionado="${param.estiloMusical}"/> &nbsp <strong>${errorEstilo}</strong>
                      </div>
                  </td>
                </tr> 
                <tr align="center">
                  <td align='center'>                     
                    <input type="submit" name="text" value="Pesquisar Artista" class="btn btn-primary"><br>
                    <font color="red"><strong>${artEncontrado}</strong></font>
                  </td>
                </tr>                 
            </table>
            <!-- AQUI COLOCA OS DADOS DO ARTISTA E BANDA PREENCHIDOS NA PESQUISA. TEM COMO FAZER SEM ARRAY -->          
            <table align="center" border="1" class="table table-striped table-dark">
              <tr>
                <th>Nome do Artista</th>
                <th>Banda</th>
                <th>Anos de Carreira</th>
                <th>Estilo Musical</th>
              </tr>
                <c:forEach var="artista" items="${listaFiltrada}">
                    <tr>
                        <td> ${artista.getNomeArtista()} </td>
                        <td> ${artista.getNomeBanda()} </td>
                        <td> ${artista.getAnosCarreira()} </td>
                        <td> ${artista.getEstiloMusical()} </td>
                    </tr>
                </c:forEach>           
            </table>                      
         </div>             
        </form>          
        </c:if> 
       
        <table align="center">
            <tr align="center">
                <td align="center">
                    <c:url value="/Simula.jsp" var="simula" scope="page"> 
                    </c:url>                       
                     <a href="${simula}" class="btn btn-primary"> Voltar </a>
                </td>                
            </tr>         
        </table>
               
    </body>
</html>

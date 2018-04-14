<%-- 
    Document   : ServletSimula
    Created on : 09/04/2018, 18:40:44
    Author     : Claudio Freitas
--%>
<!-- JSP é
Tecnologia para criar de maneira fácil conteúdo com componentes estáticos e dinâmicos 
Mistura a tecnologia de Servlets com conteúdo estático HTML
Utilização de scripts e tags específicas para trabalhar com o conteúdo dinâmico
-->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>Projeto Simulado</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <%@ taglib prefix="tagestilo" uri="WEB-INF/tagEstilo.tld"%>
        <!-- BOOTSTRAP -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
        <script src="js/jquery-3.2.1.slim.min.js"></script>
        <script src="js/1.12.9/umd/popper.min.js"></script>      
        <!-- BOOTSTRAP -->
    </head>
    <body>
        <!-- ENVIA AS INFORMAÇÕES INSERIDA NOS CAMPOS PARA O ServletSimula PARA SEREM VALIDADAS E ADICIONADAS E LISTA -->
        <form method="GET" action="ServletSimula">
            <div class="form-group align-items-center">
            <table align="center" border=1 class="table table-dark">
                <tr align="center" >
                    <td align='center'>
                        <strong>Preencher Campos de Formulário do Artista</strong>
                    </td>
                <tr> 
                <tr align="center">
                  <td align='center'>
                    <div class="col-5">
                     Nome Artista: <input type="text" class="form-control" name="nomeArtista" value="${param.nomeArtista}" placeholder="Nome do Arista" maxlength="50"> &nbsp <strong>${errorArtista}</strong>
                    </div>
                  </td>
                </tr>
                <tr align="center">
                  <td align='center'>
                     <div class="col-5"> 
                      Banda: <input type="text" name="banda" class="form-control" value="${param.banda}" placeholder="Nome da Banda(opicional)" maxlength="50"> &nbsp <strong>${errorBanda}</strong>
                     </div>
                  </td>
                </tr> 
                <tr align="center">
                  <td align='center'>
                     <div class="col-4">  
                      Anos de Carreira: <input type="text" class="form-control" name="anosCarreira" value="${param.anosCarreira}" placeholder="Anos de Carreira" maxlength="4"> &nbsp <strong>${errorCarreira}</strong>
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
                    <input name="submit" type="reset" value="Limpar" name="btLimpa" class="btn btn-primary">&nbsp &nbsp
                    <!-- ENVIA TUDO PARA O ServletSimula-->
                    <input type="submit" name="text" value="Enviar" class="btn btn-primary">
                  </td>
                </tr>            
             </table>
          </div>        
        </form>
        <!-- VISUALIZAR LISTA DE ARTISTAS JÁ INSERIDOS -->
        <table align="center" border=1 class="table table-dark">
            <tr align="center">
              <td align='center'>                                          
                 <a href=http://localhost:8080/ProjetoSimula/ExibeArtista.jsp class="btn btn-primary"> Visualizar Artistas </a>
              </td>
            </tr>        
        </table>  
    </body>
</html>
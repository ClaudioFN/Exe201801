/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetosala.maven.projetosalamaven;

import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author Aluno
 */
public class SelectCursoTag  extends SimpleTagSupport{

    private String cursoSelecionado;
    
    @Override
    public void doTag() throws JspException, IOException {
        String selectHTML = 
        "<select name='materia'>" +
            "<option value=''></option>" +
            "<option value='PSW' " + ("PSW".equals(getCursoSelecionado()) ? "selected":"") + ">Programação Software WEB</option>" +
            "<option value='POO' " + ("POO".equals(getCursoSelecionado()) ? "selected":"") + " >Programação Orientada a Objeto</option>" + 
            "<option value='EDA' " + ("EDA".equals(getCursoSelecionado()) ? "selected":"") + ">Estrutura de Dados</option>" +
            "<option value='SIG' " + ("SIG".equals(getCursoSelecionado()) ? "selected":"") + ">Segurança da Informação</option>" +
            "<option value='ENGR' " + ("ENGR".equals(getCursoSelecionado()) ? "selected":"") + ">Engenharia de Requisitos</option>" +
        "</select>";         
        getJspContext().getOut().print(selectHTML);
    }

    /**
     * @return the cursoSelecionado
     */
    public String getCursoSelecionado() {
        return cursoSelecionado;
    }

    /**
     * @param cursoSelecionado the cursoSelecionado to set
     */
    public void setCursoSelecionado(String cursoSelecionado) {
        this.cursoSelecionado = cursoSelecionado;
    }
    
}

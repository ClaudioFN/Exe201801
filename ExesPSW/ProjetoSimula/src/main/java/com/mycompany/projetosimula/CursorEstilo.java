/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetosimula;

import com.sun.org.apache.xpath.internal.operations.Equals;
import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author Aluno
 */
public class CursorEstilo extends SimpleTagSupport{
    private String estiloSelecionado;
    
    @Override
    public void doTag() throws JspException, IOException {
        String selectHTML = 
        "<select name='estiloMusical' class=\"form-control\">" +
            "<option value=''></option>" +
            "<option value='ROCK' " + ("ROCK".equals(getEstiloSelecionado()) ? "selected":"") + ">Rock</option>" +
            "<option value='POP' " + ("POP".equals(getEstiloSelecionado()) ? "selected":"") + " >Pop</option>" + 
            "<option value='OUTROS' " + ("OUTROS".equals(getEstiloSelecionado()) ? "selected":"") + ">Outros</option>" +
        "</select>";         
        getJspContext().getOut().print(selectHTML);
    }

    /**
     * @return the cursoSelecionado
     */
    public String getEstiloSelecionado() {
        return estiloSelecionado;
    }

    /**
     * @param estiloSelecionado the cursoSelecionado to set
     */
    public void setEstiloSelecionado(String estiloSelecionado) {
        this.estiloSelecionado = estiloSelecionado;
    }    
}

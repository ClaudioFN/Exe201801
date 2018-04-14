/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetosimula;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Claudio
 * @since 08/04/2018
 * 
 */
@WebFilter("/*")
public class ErrorFilter implements Filter {

    /**
     * Processo de Request para os métodos POST e GET
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException 
     * @throws IOException 
     */
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        try{
            chain.doFilter(request, response);
        }catch(Exception e){
            e.printStackTrace();
            request.getRequestDispatcher("/error.html").forward(request, response);
        }
    }

    @Override
    public void destroy() {
    }
}


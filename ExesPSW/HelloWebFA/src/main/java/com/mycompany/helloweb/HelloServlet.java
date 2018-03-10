/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.helloweb;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Aluno
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
    
    public HelloServlet(){
        System.out.println("Construtor");
    }
    
    @Override
    public void init()throws ServletException{
        System.out.println("init()");
    }
    
    //@Override
    //public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
    //    System.out.println("Nova Mensagem 5");
    //    System.out.println("Mais uma Mensagem 6");
    //}

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //System.out.println("Metodo GET");
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        PrintWriter pr = resp.getWriter();
        //pr.print("doGET áÇ");
        pr.print("<h1>doGET áá</h1>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Metodo Post");
    }
    
    public void destroy(){
        System.out.println("destroy()");
    }
    
}

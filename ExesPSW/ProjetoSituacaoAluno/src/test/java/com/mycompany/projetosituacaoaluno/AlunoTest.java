/*
 * Classe de Teste da Classe Aluno com Método situacao para realizar a cobertura
 * total de cada item de Teste, verificando cada situação que um Aluno venha 
 * a ter durante sua aplicação na respectiva Matéria praticada
 */
package com.mycompany.projetosituacaoaluno;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Claudio Freitas
 * @since 03/03/2018
 * @version 1.0
 */
public class AlunoTest {
    /**
     * Teste de retorno da Situação APROVADO por Notas
     * @param double p1 = 9.0, double trlh = 9.0 
     * @param double pa = 9.0, double pf = 9.0, double fqr = 0.8
     * @return Aprovado
     */
    @Test
    public void testSituacaoApro1() {
        System.out.println("situacao");
        double p1 = 9.0;
        double trlh = 9.0;
        double pa = 9.0;
        double pf = 9.0;
        double fqr = 0.8;
        Aluno instance = new Aluno();
        String expResult = "Aprovado";
        String result = instance.situacao(p1, trlh, pa, pf, fqr);
        assertEquals(expResult, result);
    }
    
   /**
     * Teste de retorno da Situação REPROVADO por Notas
     * @param double p1 = 0.0, double trlh = 0.0 
     * @param  double pa = 0.0, double pf = 0.0, double fqr = 0.8
     * @return Reprovado
     */
    @Test
    public void testSituacaoRepro1() {
        System.out.println("situacao");
        double p1 = 0.0;
        double trlh = 0.0;
        double pa = 0.0;
        double pf = 0.0;
        double fqr = 0.8;
        Aluno instance = new Aluno();
        String expResult = "Reprovado";
        String result = instance.situacao(p1, trlh, pa, pf, fqr);
        assertEquals(expResult, result);
    }    
    
   /**
     * Teste de retorno da Situação APROVADO ao entrar na parte onde
     * ocorre o Teste para os Alunos de Prova Final
     * @param double p1 = 5.0, double trlh = 5.0
     * @param double pa = 5.0, double pf = 8.0, double fqr = 0.75
     * @return Aprovado
     */
    @Test
    public void testSituacaoProFin1() {
        System.out.println("situacao");
        double p1 = 5.0;
        double trlh = 5.0;
        double pa = 5.0;
        double pf = 8.0;
        double fqr = 0.75;
        Aluno instance = new Aluno();
        String expResult = "Aprovado";
        String result = instance.situacao(p1, trlh, pa, pf, fqr);
        assertEquals(expResult, result);
    }  
    
   /**
     * Teste de retorno da Situação REPROVADO ao entrar na parte onde
     * ocorre o Teste para os Alunos de Prova Final
     * @param double p1 = 5.0, double trlh = 5.0 
     * @param double pa = 5.0, double pf = 8.0, double fqr = 0.75
     * @return Reprovado
     */
    @Test
    public void testSituacaoProFin2() {
        System.out.println("situacao");
        double p1 = 5.0;
        double trlh = 5.0;
        double pa = 5.0;
        double pf = 4.0;
        double fqr = 0.75;
        Aluno instance = new Aluno();
        String expResult = "Reprovado";
        String result = instance.situacao(p1, trlh, pa, pf, fqr);
        assertEquals(expResult, result);
    }     
    
   /**
     * Teste de retorno da Situação REPROVADO para Frequência inferior a 75%
     * @param double p1 = 5.0, double trlh = 5.0
     * @param double pa = 5.0, double pf = 8.0, double fqr = 0.6
     * @return Reprovado
     */
    @Test
    public void testSituacaoFrequenc1() {
        System.out.println("situacao");
        double p1 = 5.0;
        double trlh = 5.0;
        double pa = 5.0;
        double pf = 8.0;
        double fqr = 0.6;
        Aluno instance = new Aluno();
        String expResult = "Reprovado";
        String result = instance.situacao(p1, trlh, pa, pf, fqr);
        assertEquals(expResult, result);
    }    
}

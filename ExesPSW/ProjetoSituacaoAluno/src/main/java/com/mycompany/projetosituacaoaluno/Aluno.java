/*
 * Classe Aluno com Método situacao para realizar testes unitários 
 */
package com.mycompany.projetosituacaoaluno;

/**
 * @author Claudio Freitas
 * @since 03/03/2018
 * @version 1.0
 * @param double M1, String situacaoAluno, String frequencia
 */
public class Aluno {
    double M1;
    String situacaoAluno;
    double frequencia;

    /**
     * Método situacao que retorna a situacao do aluno de acordo com os valores
     * atribuídos as variáveis
     * @param double p1
     * @param double trlh
     * @param double pa
     * @param double pf
     * @param double fqr
     * @return situacaoAluno
     */
    public String situacao(double p1, double trlh, double pa, double pf, double fqr){
        frequencia = fqr;
        M1 = 0.7 * ((p1 + trlh) / 2) + pa * 0.3;
        if(frequencia >= 0.75){
            if(M1 >= 7) 
                situacaoAluno = "Aprovado";
            else if (M1 < 3) 
                situacaoAluno = "Reprovado";
            else{
                situacaoAluno = "Prova Final";
                if( ((pf + M1) / 2) >= 5)
                    situacaoAluno = "Aprovado";
                else
                    situacaoAluno = "Reprovado";
            }
        }else{
            situacaoAluno = "Reprovado";
        }
        return situacaoAluno;
    }
}

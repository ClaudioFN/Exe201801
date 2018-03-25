package classJSP;

/*
 * Classe Aluno com validação das informações de Notas preechidas em tela de Formulário
 */
/**
 * @param aluno, situacaoAluno String
 * @param n1, n2, nf, pof, freq double, M1, frequencia
 * @author Claudio Freitas
 */
public class Alunos {
    private String aluno;
    private double n1, n2, nf, pof, freq;
    private String situacaoAluno;
    
    double M1;
    double frequencia;

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public String getSituacaoAluno() {
        return situacaoAluno;
    }

    public void setSituacaoAluno(String situacaoAluno) {
        this.situacaoAluno = situacaoAluno;
    }    
    
    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getNF() {
        return nf;
    }

    public void setNF(double nf) {
        this.nf = nf;
    }

    public double getPOF() {
        return pof;
    }

    public void setPOF(double pof) {
        this.pof = pof;
    }

    public double getFreq() {
        return freq;
    }

    public void setFreq(double freq) {
        this.freq = freq;
    }    
    
    public String situacao(double p1, double p2, double pa, double pf, double fqr){
        frequencia = fqr;
        M1 = 0.7 * ((p1 + p2) / 2) + pa * 0.3;
        if(frequencia >= 75.0){
            if(M1 >= 7) 
                setSituacaoAluno("Aprovado");
            else if (M1 < 3.0) 
                setSituacaoAluno("Reprovado");
            else{
                setSituacaoAluno("Prova Final");
                if( ((pf + M1) / 2.0) >= 5.0)
                    setSituacaoAluno("Aprovado");
                else
                    setSituacaoAluno("Reprovado");
            }
        }else{
            setSituacaoAluno("Reprovado");
        }
        return getSituacaoAluno();
    }
    
}

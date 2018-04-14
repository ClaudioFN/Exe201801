/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetosimula;
/**
 *
 * @author Aluno
 */
public class Artista implements Comparable {
    private String nomeArtista, nomeBanda, estiloMusical;
    private int anosCarreira;
    private int identifica;
    /**
     * @return the nomeArtista
     */
    public String getNomeArtista() {
        return nomeArtista;
    }

    /**
     * @param nomeArtista the nomeArtista to set
     */
    public void setNomeArtista(String nomeArtista) {
        this.nomeArtista = nomeArtista;
    }

    /**
     * @return the nomeBanda
     */
    public String getNomeBanda() {
        return nomeBanda;
    }

    /**
     * @param nomeBanda the nomeBanda to set
     */
    public void setNomeBanda(String nomeBanda) {
        this.nomeBanda = nomeBanda;
    }

    /**
     * @return the estiloMusical
     */
    public String getEstiloMusical() {
        return estiloMusical;
    }

    /**
     * @param estiloMusical the estiloMusical to set
     */
    public void setEstiloMusical(String estiloMusical) {
        this.estiloMusical = estiloMusical;
    }

    /**
     * @return the anosCarreira
     */
    public int getAnosCarreira() {
        return anosCarreira;
    }

    /**
     * @param anosCarreira the anosCarreira to set
     */
    public void setAnosCarreira(int anosCarreira) {
        this.anosCarreira = anosCarreira;
    }
    
    public boolean equals(Object o){
        if(o instanceof Artista){
                Artista x = (Artista)o;
                return getNomeArtista().equals(x.getNomeArtista());
        }
        return false;
    }   
    
    public int compareTo(Object o) {
        String comparename =((Artista)o).getNomeArtista();
        /* For Ascending order*/
        return this.nomeArtista.compareTo(comparename);
    }    

    /**
     * @return the identifica
     */
    public int getIdentifica() {
        return identifica;
    }

    /**
     * @param identifica the identifica to set
     */
    public void setIdentifica(int identifica) {
        this.identifica = identifica;
    }
}

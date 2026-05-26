/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer5;

/**
 *
 * @author Joshelyn
 */
public class NodoP {
    private String titulo, genero;
    private int anioE, ciDirector;
    private NodoP sig;

    public NodoP() {
        sig=null;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnioE() {
        return anioE;
    }

    public void setAnioE(int anioE) {
        this.anioE = anioE;
    }

    public int getCiDirector() {
        return ciDirector;
    }

    public void setCiDirector(int ciDirector) {
        this.ciDirector = ciDirector;
    }

    public NodoP getSig() {
        return sig;
    }

    public void setSig(NodoP sig) {
        this.sig = sig;
    }
    
    
    
}

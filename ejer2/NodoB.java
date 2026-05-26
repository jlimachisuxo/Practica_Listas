/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer2;

/**
 *
 * @author Joshelyn
 */
public class NodoB {
    private String titulo, autor;
    private int anioPubli, cantEj, calif;
    private NodoB sig;

    public NodoB() {
        sig=null;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPubli() {
        return anioPubli;
    }

    public void setAnioPubli(int anioPubli) {
        this.anioPubli = anioPubli;
    }

    public int getCantEj() {
        return cantEj;
    }

    public void setCantEj(int cantEj) {
        this.cantEj = cantEj;
    }

    public int getCalif() {
        return calif;
    }

    public void setCalif(int calif) {
        this.calif = calif;
    }

    public NodoB getSig() {
        return sig;
    }

    public void setSig(NodoB sig) {
        this.sig = sig;
    }
    
    
    
    
}

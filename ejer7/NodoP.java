/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer7;

/**
 *
 * @author Joshelyn
 */
public class NodoP {
    private String palabra;
    private NodoP ant, sig;

    public NodoP() {
        ant=sig=null;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public NodoP getAnt() {
        return ant;
    }

    public void setAnt(NodoP ant) {
        this.ant = ant;
    }

    public NodoP getSig() {
        return sig;
    }

    public void setSig(NodoP sig) {
        this.sig = sig;
    }
    
    
}

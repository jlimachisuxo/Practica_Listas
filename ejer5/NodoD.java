/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer5;

/**
 *
 * @author Joshelyn
 */
public class NodoD {
    private String nomD; 
    private int ciD;
    private NodoD sig;

    public NodoD() {
        sig=null;
    }

    public String getNomD() {
        return nomD;
    }

    public void setNomD(String nomD) {
        this.nomD = nomD;
    }

    public int getCiD() {
        return ciD;
    }

    public void setCiD(int ciD) {
        this.ciD = ciD;
    }

    public NodoD getSig() {
        return sig;
    }

    public void setSig(NodoD sig) {
        this.sig = sig;
    }
    
}

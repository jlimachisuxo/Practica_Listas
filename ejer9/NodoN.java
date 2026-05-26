/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer9;

/**
 *
 * @author Joshelyn
 */
public class NodoN {
    private int num;
    private NodoN ant, sig;

    public NodoN() {
        ant=sig=null;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public NodoN getAnt() {
        return ant;
    }

    public void setAnt(NodoN ant) {
        this.ant = ant;
    }

    public NodoN getSig() {
        return sig;
    }

    public void setSig(NodoN sig) {
        this.sig = sig;
    }
    
    
}

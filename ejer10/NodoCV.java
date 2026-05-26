/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer10;

/**
 *
 * @author Joshelyn
 */
public class NodoCV {
    private String nombre;
    private int puntos, nochesHosp;
    private NodoCV ant, sig;

    public NodoCV() {
        ant=sig=null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getNochesHosp() {
        return nochesHosp;
    }

    public void setNochesHosp(int nochesHosp) {
        this.nochesHosp = nochesHosp;
    }

    public NodoCV getAnt() {
        return ant;
    }

    public void setAnt(NodoCV ant) {
        this.ant = ant;
    }

    public NodoCV getSig() {
        return sig;
    }

    public void setSig(NodoCV sig) {
        this.sig = sig;
    }
    
    
}

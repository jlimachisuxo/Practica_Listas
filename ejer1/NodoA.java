/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer1;

/**
 *
 * @author Joshelyn
 */
public class NodoA {
    private String nombre, géneroMusical, país;
    private int presentaciones, califPromedio;
    private NodoA sig;

    public NodoA() {
        sig=null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGéneroMusical() {
        return géneroMusical;
    }

    public void setGéneroMusical(String géneroMusical) {
        this.géneroMusical = géneroMusical;
    }

    public String getPaís() {
        return país;
    }

    public void setPaís(String país) {
        this.país = país;
    }

    public int getPresentaciones() {
        return presentaciones;
    }

    public void setPresentaciones(int presentaciones) {
        this.presentaciones = presentaciones;
    }

    public int getCalifPromedio() {
        return califPromedio;
    }

    public void setCalifPromedio(int califPromedio) {
        this.califPromedio = califPromedio;
    }

    public NodoA getSig() {
        return sig;
    }

    public void setSig(NodoA sig) {
        this.sig = sig;
    }
 
}

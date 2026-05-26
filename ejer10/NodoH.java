/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer10;

/**
 *
 * @author Joshelyn
 */
public class NodoH {
    private int nro, capacidad, precio;
    private boolean ocupada;
    private NodoH ant, sig;

    public NodoH() {
        ant=sig=null;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public NodoH getAnt() {
        return ant;
    }

    public void setAnt(NodoH ant) {
        this.ant = ant;
    }

    public NodoH getSig() {
        return sig;
    }

    public void setSig(NodoH sig) {
        this.sig = sig;
    }
    
    
}

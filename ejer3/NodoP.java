/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer3;

/**
 *
 * @author Joshelyn
 */
public class NodoP {
    private String nombre;
    private int codVuelo, equipajeKg;
    private NodoP sig;

    public NodoP() {
        sig=null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodVuelo() {
        return codVuelo;
    }

    public void setCodVuelo(int codVuelo) {
        this.codVuelo = codVuelo;
    }

    public int getEquipajeKg() {
        return equipajeKg;
    }

    public void setEquipajeKg(int equipajeKg) {
        this.equipajeKg = equipajeKg;
    }

    public NodoP getSig() {
        return sig;
    }

    public void setSig(NodoP sig) {
        this.sig = sig;
    }
    
}

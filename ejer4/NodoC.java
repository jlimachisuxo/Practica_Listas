/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer4;

/**
 *
 * @author Joshelyn
 */
public class NodoC {
    private String nomConductor, modelo;
    private int velMaxima;
    private NodoC sig;

    public NodoC() {
        sig=null;
    }

    public String getNomConductor() {
        return nomConductor;
    }

    public void setNomConductor(String nomConductor) {
        this.nomConductor = nomConductor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelMaxima() {
        return velMaxima;
    }

    public void setVelMaxima(int velMaxima) {
        this.velMaxima = velMaxima;
    }

    public NodoC getSig() {
        return sig;
    }

    public void setSig(NodoC sig) {
        this.sig = sig;
    }
    
    
    
}

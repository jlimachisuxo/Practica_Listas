/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer3;

/**
 *
 * @author Joshelyn
 */
public class NodoV {
    private int codVuelo;
    private String destino, horaSalida;
    private int asientosDispo;
    private NodoV sig;

    public NodoV() {
        sig=null;
    }

    public int getCodVuelo() {
        return codVuelo;
    }

    public void setCodVuelo(int codVuelo) {
        this.codVuelo = codVuelo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public int getAsientosDispo() {
        return asientosDispo;
    }

    public void setAsientosDispo(int asientosDispo) {
        this.asientosDispo = asientosDispo;
    }

    public NodoV getSig() {
        return sig;
    }

    public void setSig(NodoV sig) {
        this.sig = sig;
    }
    
    
    
}

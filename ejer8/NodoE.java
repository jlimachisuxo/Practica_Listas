/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer8;

/**
 *
 * @author Joshelyn
 */
public class NodoE {
    private String nombre, turno;
    private int horasT;
    private NodoE ant, sig;

    public NodoE() {
        ant=sig=null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getHorasT() {
        return horasT;
    }

    public void setHorasT(int horasT) {
        this.horasT = horasT;
    }

    public NodoE getAnt() {
        return ant;
    }

    public void setAnt(NodoE ant) {
        this.ant = ant;
    }

    public NodoE getSig() {
        return sig;
    }

    public void setSig(NodoE sig) {
        this.sig = sig;
    }
    
    
}

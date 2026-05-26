/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer6;

/**
 *
 * @author Joshelyn
 */
public class NodoE {
    private String nombre;
    private int edad, promedio;
    private String carrera;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPromedio() {
        return promedio;
    }

    public void setPromedio(int promedio) {
        this.promedio = promedio;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
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

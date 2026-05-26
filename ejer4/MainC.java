/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer4;

/**
 *
 * @author Joshelyn
 */
public class MainC {
    public static void main(String[] args) {
        LSCircularC a = new LSCircularC();
        a.adicionar("Pablo", "Alpine A110", 150);
        a.adicionar("Diego", "AC Cobra", 200);
        a.adicionar("Felipe", "Alfa Romeo 177", 350);
        a.adicionar("Vania", "Alfa Romeo 4C", 185);
        a.adicionar("Joel", "AC Cobra", 312);
        a.adicionar("Daniela", "Alpine A424", 400);
        System.out.println("---LISTA DE PILOTOS---");
        a.mostrar();

        // b) Verificar si el conductor X está compitiendo.
        System.out.println("\n---b) Verificar si el conductor X esta compitiendo");
        incisoB(a, "Joel");
        // c) Mostrar el auto o los autos con mayor velocidad máxima.
        System.out.println("\n---c) Auto o autos con mayor velocidad maxima");
        incisoC(a);
        // d) Eliminar los autos del modelo X
        System.out.println("\n---d) Eliminar los autos del modelo X");
        incisoD(a, "AC Cobra");
        a.mostrar();        
    }
    // b
    public static void incisoB(LSCircularC a, String x){
        NodoC r = a.getP();
        boolean compite=false;
        do{
            if(r.getNomConductor().equalsIgnoreCase(x)){
                compite=true;
            }
            r=r.getSig();
        }while(r != a.getP());
        if(compite){
            System.out.println("El conductor "+x+" SI esta compitiendo");
        }else{
            System.out.println("El conductor "+x+" NO esta compitiendo");
        }
    }
    // c
    public static void incisoC(LSCircularC a){
        NodoC r = a.getP();
        NodoC mayorv = r;
        do{
            if(r.getVelMaxima() > mayorv.getVelMaxima()){
                mayorv = r;
            }
            r=r.getSig();
        }while(r != a.getP());
        System.out.println("Auto con mayor velocidad. Modelo: "+mayorv.getModelo()+" velocidad maxima: "+mayorv.getVelMaxima());
    }
    // d
    public static void incisoD(LSCircularC a, String x){
        NodoC r = a.getP();
        boolean procesadoUltimo = false;
        while (!procesadoUltimo) {
            if (r.getSig() == a.getP()) {
                procesadoUltimo = true;
            }
            if (r.getModelo().equalsIgnoreCase(x)) {
                if (r == a.getP()) {
                    if (r.getSig() == a.getP()) { 
                        a.setP(null);
                        procesadoUltimo = true;
                    } else {
                        NodoC ultimo = a.getP();
                        while (ultimo.getSig() != a.getP()) {
                            ultimo = ultimo.getSig();
                        }
                        a.setP(r.getSig());
                        ultimo.setSig(a.getP());
                        r = a.getP(); 
                    }
                } 
                else {
                    NodoC r2 = a.getP();
                    while (r2.getSig() != r) {
                        r2 = r2.getSig();
                    }
                    r2.setSig(r.getSig());
                    r = r2.getSig();
                }
            } else {
                r = r.getSig();
            }
        }
    }
}

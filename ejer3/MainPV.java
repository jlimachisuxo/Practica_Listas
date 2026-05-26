/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer3;

/**
 *
 * @author Joshelyn
 */
public class MainPV {
    public static void main(String[] args) {
        LSCircularV a = new LSCircularV();
        a.adicionar(11, "Francia", "12:30", 13);
        a.adicionar(12, "Chile", "10:00", 5);
        a.adicionar(13, "Italia", "17:30", 11);
        a.adicionar(14, "Ecuador", "8:00", 3);
        System.out.println("---VUELOS---");
        a.mostrar();
        
        LSCircularP b = new LSCircularP();
        b.adicionar("Diego", 12, 5);
        b.adicionar("Ana", 14, 2);
        b.adicionar("Gael", 12, 7);
        b.adicionar("Sandra", 13, 1);
        b.adicionar("Lena", 11, 4);
        b.adicionar("Carlos", 11, 6);
        System.out.println("---PASAJEROS---");
        b.mostrar();
        
        // b) Mostrar a todos los pasajeros que viajaron al destino X.
        System.out.println("\n---b) Mostrar a todos los pasajeros que viajaron al destino X");
        incisoB(a, b, "Chile");
        // c) Contar cuántos vuelos tienen más de 10 asientos disponibles.
        System.out.println("\n---c) Vuelos que tienen mas de 10 asientos disponibles");
        incisoC(a);
        // d) Mostrar a los pasajeros del vuelo que tenga menos de 5 asientos libres.
        System.out.println("\n---d) Pasajeros del vuelo que tenga menos de 5 asientos libres");
        incisoD(a, b);
        // e) Verificar si el pasajero X viajó a Francia
        System.out.println("\n---e) Verificar si el pasajero X viajo a Francia");
        incisoE(a, b, "Lena");
    }
    // b)
    public static void incisoB(LSCircularV a, LSCircularP b, String x){
        NodoV r = a.getP();
        while(r.getSig() != a.getP()){
            if(r.getDestino().equalsIgnoreCase(x)){
                System.out.println("Vuelo destino a: "+x);
                mostrarP(b, r.getCodVuelo());
            }
            r=r.getSig();
        }
        if(r.getDestino().equalsIgnoreCase(x)){
            System.out.println("Vuelo destino a: "+x);
            mostrarP(b, r.getCodVuelo());
        }
    }
    public static void mostrarP(LSCircularP b, int codv){
        NodoP z = b.getP();
        while(z.getSig() != b.getP()){
            if(z.getCodVuelo() == codv){
                System.out.println("pasajero: "+z.getNombre());
            }
            z=z.getSig();
        }
        if(z.getCodVuelo() == codv){
            System.out.println("pasajero: "+z.getNombre());
        }
    }
    // c}
    public static void incisoC(LSCircularV a){
        NodoV r = a.getP();
        int c=0;
        while(r.getSig() != a.getP()){
            if(r.getAsientosDispo() > 10){
                c++;
            }
            r=r.getSig();
        }
        if(r.getAsientosDispo() > 10){
            c++;
        }
        System.out.println(c+" vuelo(s) tienen mas de 10 asientos disponibles");
    }
    // d)
    public static void incisoD(LSCircularV a, LSCircularP b){
        NodoV r = a.getP();
        while(r.getSig() != a.getP()){
            if(r.getAsientosDispo() < 5){
                System.out.println("Vuelo destino a "+r.getDestino());
                mostrarP(b, r.getCodVuelo());
            }
            r=r.getSig();
        }
        if(r.getAsientosDispo() < 5){
            System.out.println("Vuelo destino a "+r.getDestino());
            mostrarP(b, r.getCodVuelo());
        }
    }
    // e)
    public static void incisoE(LSCircularV a, LSCircularP b, String x){
        NodoV r = a.getP();
        while(r.getSig() != a.getP()){
            if(r.getDestino().equals("Francia")){
                System.out.println("Vuelo destino a Francia");
                VerificarP(b, r.getCodVuelo(), x);
            }
            r=r.getSig();
        }
        if(r.getDestino().equals("Francia")){
                System.out.println("Vuelo destino a Francia");
                VerificarP(b, r.getCodVuelo(), x);
            }
    }
    public static void VerificarP(LSCircularP b, int codv, String x){
        NodoP z = b.getP();
        boolean encontro = false;
        do{
            if(z.getCodVuelo() == codv && z.getNombre().equalsIgnoreCase(x)){
                encontro = true;
            }
            z=z.getSig();
        }while(z != b.getP());
        if(encontro){
            System.out.println("el pasajero: "+x+ " SI viajo a Francia");
        }else{
            System.out.println("el pasajero: "+x+ " NO viajo a Francia");
        }
    }
}

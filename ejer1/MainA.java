/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer1;

/**
 *
 * @author Joshelyn
 */
public class MainA {
    public static void main(String[] args) {
        System.out.println("---LISTA DE ARTISTAS---");
        LSimpleA a = new LSimpleA();
        a.adifinal("Pablo", "pop", "Argentina", 2, 7);
        a.adifinal("Belen", "folklore", "Argentina", 4, 9);
        a.adifinal("Alejandro", "cumbia", "Bolivia", 1, 4);
        a.adifinal("Rosario", "cumbia", "Chile", 3, 8);
        a.adifinal("Luis", "pop rock", "Peru", 2, 7);
        a.adifinal("Fernando", "rock", "Argentina", 1, 3);
        a.mostrar();
        
//        b) Insertar un artista al principio de la lista, ya que los últimos confirmados deben
//        aparecer en la cabecera para una revisión rápida por parte de la producción.
        System.out.println("\n--- b) Insertando nuevo artista al principio ---");
        a.adiprincipio("Angela", "cumbia", "Colombia", 4, 10);
        a.mostrar();
//        c) Calcular el promedio general de la calificación de las presentaciones de todos los
//        artistas participantes.
        System.out.println("\n--- c) Promedio General ---");
        incisoC(a);
//        d) Mostrar al artista con la calificación más alta del festival, es decir, quien conquistó
//        con mayor fuerza al público.
        System.out.println("\n--- d) Artista con calificacion mas alta ---");
        incisoD(a);
//        e) Eliminar de la lista a los artistas con calificación menor a 5, debido a que no cumplen
//        con los estándares de calidad exigidos para el espectáculo. (utilizar punteros)
        System.out.println("\n--- e) Eliminando artistas con calificacion menor a 5 ---");
        incisoE(a);
        a.mostrar();
    }
    
    // b)
//    public static void incisoB(LSimpleA a, String n, String gm, String pais, int pres, int cpromedio){
//        a.adiprincipio(n, gm, pais, pres, cpromedio);
//    }
    
    // c)
    public static void incisoC(LSimpleA a){
        NodoA r = a.getP();
        double suma = 0;
        int c = 0;
        while(r != null){
            suma += r.getCalifPromedio();
            c++;
            r=r.getSig();
        }
        double promG = suma / c;
        System.out.printf("El promedio general de calificacion es %.2f%n ",promG);
    }
    
    // d)
    public static void incisoD(LSimpleA a){
        NodoA r = a.getP();
        NodoA mejor = r;
        while(r != null){
            if(r.getCalifPromedio() > mejor.getCalifPromedio()){
                mejor = r;
            }
            r=r.getSig();
        }
        System.out.println("El mejor artista es: "+mejor.getNombre()+" con "+mejor.getCalifPromedio());
        
    }
    
    // e)
    public static void incisoE(LSimpleA a){
        NodoA r = a.getP();
        while(r != null){
            if(r.getCalifPromedio() < 5){
                if(r == a.getP()){
                    a.setP(r.getSig());
                    r=a.getP();
                }else{
                    NodoA r2 = a.getP();
                    while(r2.getSig() != r){
                        r2=r2.getSig();
                    }
                    r2.setSig(r.getSig());
                    r = r2.getSig();
                }
            }else{
                r = r.getSig();
            }
        }
    }
}

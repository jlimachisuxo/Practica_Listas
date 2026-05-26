/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer6;

/**
 *
 * @author Joshelyn
 */
public class MainE {
    public static void main(String[] args) {
        LDobleE a = new LDobleE();
        a.adifinal("Gael", 19, 76, "Informatica");
        a.adifinal("Alicia", 23, 85, "Biologia");
        a.adifinal("Roberto", 21, 81, "Matematica");
        a.adifinal("Diego", 25, 92, "Informatica");
        a.adifinal("Laura", 19, 58, "Estadistica");
        a.adifinal("Maria", 22, 87, "Quimica");
        System.out.println("---LISTA DE ESTUDIANTES---");
        a.mostrar();

        // b) Eliminar todos los estudiantes con promedio menor a 60 
        System.out.println("\n--- b) Eliminando estudiantes con promedio < 60 ---");
        eliminarMenoresDe60(a);
        a.mostrar();
        
        // c) Insertar un nuevo estudiante antes del primer estudiante con promedio mayor a 90 
        System.out.println("\n--- c) Insertando a Carlos antes del primer promedio > 90 ---");
        insertarAntesDelPrimerMayorA90(a, "Carlos", 20, 88, "Fisica");
        a.mostrar();

        // d) Mostrar la lista en orden inverso (usando los punteros Ant)
        System.out.println("\n--- d) Lista en orden inverso ---");
        mostrarInverso(a);
        
    }
    // b) 
    public static void eliminarMenoresDe60(LDobleE a) {
        NodoE q = a.getP();
        
        while (q != null) {
            NodoE siguiente = q.getSig();
            
            if (q.getPromedio() < 60) {
                if (q == a.getP()) { 
                    a.setP(siguiente);
                    if (a.getP() != null) {
                        a.getP().setAnt(null);
                    }
                } else { 
                    q.getAnt().setSig(siguiente);
                    if (siguiente != null) {
                        siguiente.setAnt(q.getAnt());
                    }
                }
            }
            q = siguiente;
        }
    }

    // c) 
    public static void insertarAntesDelPrimerMayorA90(LDobleE lista, String n, int e, int prom, String carrera) {
        NodoE q = lista.getP();

        while (q != null && q.getPromedio() <= 90) {
            q = q.getSig();
        }
        
        if (q != null) {
            NodoE nue = new NodoE();
            nue.setNombre(n);
            nue.setEdad(e);
            nue.setPromedio(prom);
            nue.setCarrera(carrera);
            
            if (q == lista.getP()) {
                nue.setSig(lista.getP());
                lista.getP().setAnt(nue);
                lista.setP(nue);
            } else {
                nue.setSig(q);
                nue.setAnt(q.getAnt());
                q.getAnt().setSig(nue);
                q.setAnt(nue);
            }
        } else {
            System.out.println("No se encontro ningun estudiante con promedio mayor a 90.");
        }
    }

    // d)
    public static void mostrarInverso(LDobleE lista) {
        NodoE q = lista.getP();
        while (q.getSig() != null) {
            q = q.getSig();
        }

        while (q != null) {
            System.out.println("<" + q.getNombre() + ", " + q.getEdad() + ", " + q.getPromedio() + ", " + q.getCarrera() + ">");
            q = q.getAnt();
        }
    }
}

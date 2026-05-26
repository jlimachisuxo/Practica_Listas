/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer8;

/**
 *
 * @author Joshelyn
 */
public class MainEmpleado {
    public static void main(String[] args) {
        LDCircularE a= new LDCircularE();
        a.adicionar("Carla", "tarde", 35);
        a.adicionar("Hugo", "dia", 50);
        a.adicionar("Maria", "noche", 38);
        a.adicionar("Alicia", "tarde", 47);
        a.adicionar("Jorge", "dia", 28);
        System.out.println("---a DE EMPLEADOS--");
        a.mostrar();
        
        // b) Eliminar a todos los empleados que trabajaron más de 40 horas 
        System.out.println("\n--- b) Eliminando empleados con > 40 horas ---");
        eliminarMasDe40Horas(a);
        a.mostrar();
        
        // c) Insertar un nuevo empleado después de cada empleado con turno "noche"
        System.out.println("\n--- c) Insertando nuevo empleado despues de turno 'noche' ---");
        insertarDespuesDeNoche(a, "Pedro", "dia", 8);
        a.mostrar();

        // d) Simular 5 rotaciones y mostrar quién queda como jefe temporal
        System.out.println("\n--- d) Simulando 5 rotaciones ---");
        simularRotaciones(a, 5);
        
    }
    // b) 
    public static void eliminarMasDe40Horas(LDCircularE a) {
        NodoE q = a.getP();
        NodoE inicio = a.getP();
        boolean dioVuelta = false;

        while (q != null && !dioVuelta) {
            NodoE siguiente = q.getSig();
            if (siguiente == inicio) {
                dioVuelta = true;
            }

            if (q.getHorasT() > 40) {
                if (q.getSig() == q) { 
                    a.setP(null);
                    break;
                } else {
                    q.getAnt().setSig(q.getSig());
                    q.getSig().setAnt(q.getAnt());
                    
                    if (q == a.getP()) {
                        a.setP(siguiente);
                        inicio = siguiente; 
                    }
                }
            }
            q = siguiente;
        }
    }

    // c) 
    public static void insertarDespuesDeNoche(LDCircularE a, String n, String t, int ht) {
        NodoE q = a.getP();
        NodoE fin = a.getP().getAnt(); 
        boolean terminado = false;

        while (!terminado) {
            if (q == fin) {
                terminado = true;
            }
            if (q.getTurno().equalsIgnoreCase("noche")) {
                NodoE nue = new NodoE();
                nue.setNombre(n);
                nue.setTurno(t);
                nue.setHorasT(ht);

                NodoE sigOriginal = q.getSig();
                nue.setSig(sigOriginal);
                nue.setAnt(q);

                q.setSig(nue);
                sigOriginal.setAnt(nue);
                q = nue; 
            }
            q = q.getSig();
        }
    }

    // d) 
    public static void simularRotaciones(LDCircularE a, int nroRotaciones) {
        System.out.println("Posicion inicial de P: " + a.getP().getNombre());
        
        for (int i = 1; i <= nroRotaciones; i++) {
            a.setP(a.getP().getSig());
            System.out.println("Rotacion " + i + ": P se mueve a -> " + a.getP().getNombre());
        }
        System.out.println("El jefe temporal es: " + a.getP().getNombre().toUpperCase());
    }
}

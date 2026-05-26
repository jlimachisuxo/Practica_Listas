/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer9;

/**
 *
 * @author Joshelyn
 */
public class MainN {
    public static void main(String[] args) {
        LDCircularN a = new LDCircularN();
        a.adicionar(8);
        a.adicionar(3);
        a.adicionar(5);
        a.adicionar(12);
        a.adicionar(7);
        a.adicionar(9);
        a.adicionar(4);
        a.adicionar(6);
        System.out.println("---LISTA DE NUMEROS---");
        a.mostrar();
        
        // a) Eliminar todos los números que sean múltiplos de 3
        System.out.println("\n--- a) Eliminando multiplos de 3 ---");
        eliminarMultiplosDe3(a);
        if (a.getP() != null) {
            a.mostrar();
        } else {
            System.out.println("La a quedo vacia.");
        }

        // b) Después de cada número par, insertar un nuevo nodo con el valor = número / 2
        System.out.println("\n--- b) Insertando (numero / 2) despues de cada par ---");
        insertarMitadDespuesDePar(a);
        a.mostrar();
    }
    // a) 
    public static void eliminarMultiplosDe3(LDCircularN a) {
        NodoN q = a.getP();
        NodoN inicio = a.getP();
        boolean dioVuelta = false;

        while (q != null && !dioVuelta) {
            NodoN siguiente = q.getSig();
            if (siguiente == inicio) {
                dioVuelta = true;
            }

            if (q.getNum() % 3 == 0) {
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

    // b)
    public static void insertarMitadDespuesDePar(LDCircularN a) {
        NodoN q = a.getP();
        NodoN fin = a.getP().getAnt(); 
        boolean terminado = false;

        while (!terminado) {
            if (q == fin) {
                terminado = true;
            }

            if (q.getNum() % 2 == 0) {
                NodoN nue = new NodoN();
                nue.setNum(q.getNum() / 2);

                NodoN sigOriginal = q.getSig();
                nue.setSig(sigOriginal);
                nue.setAnt(q);
                q.setSig(nue);
                sigOriginal.setAnt(nue);
                q = nue; 
            }
            q = q.getSig();
        }
    }
}

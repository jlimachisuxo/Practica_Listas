/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer10;

/**
 *
 * @author Joshelyn
 */
public class MainHC {
    public static void main(String[] args) {
        LDCircularCV a = new LDCircularCV();
        a.adicionar("Jorge", 75, 1);
        a.adicionar("Sandra", 120, 2);
        a.adicionar("Carlos", 80, 3);
        a.adicionar("Dana", 135, 4);
        a.adicionar("Luis", 150, 3);
        System.out.println("---DE CLIENTES VIP---");
        a.mostrar();
        
        LDobleH b = new LDobleH();
        b.adifinal(2, 3, 200, true);
        b.adifinal(3, 2, 420, false);
        b.adifinal(4, 5, 102, false);
        b.adifinal(5, 1, 330, false);
        b.adifinal(6, 2, 610, false);
        System.out.println("\n---DE HABITACIONES---");
        b.mostrar();
        
        // b) Eliminar habitaciones con precio mayor a 500 
        System.out.println("\n--- b) Eliminando habitaciones con precio > 500 ---");
        eliminarHabMas500(b);
        b.mostrar();

        // c) Eliminar clientes VIP con menos de 100 puntos
        System.out.println("\n--- c) Eliminando clientes VIP con < 100 puntos ---");
        elimClientesMenos100(a);
        a.mostrar();

        // d) Mostrar qué cliente quedó como "VIP del mes" (último después de 10 rotaciones)
        System.out.println("\n--- d) Buscando al VIP del mes (10 rotaciones) ---");
        mostrarVipDelMes(a);
        
    }
    // b)
    public static void eliminarHabMas500(LDobleH a) {
        NodoH q = a.getP();        
        while (q != null) {
            NodoH siguiente = q.getSig();
            
            if (q.getPrecio() > 500) {
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
    public static void elimClientesMenos100(LDCircularCV a) {
        NodoCV q = a.getP();
        NodoCV inicio = a.getP();
        boolean dioVuelta = false;

        while (q != null && !dioVuelta) {
            NodoCV siguiente = q.getSig();
            if (siguiente == inicio) {
                dioVuelta = true;
            }

            if (q.getPuntos() < 100) {
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

    // d)
    public static void mostrarVipDelMes(LDCircularCV a) {
        for (int i = 1; i <= 10; i++) {
            a.setP(a.getP().getSig());
        }
        System.out.println("El VIP del mes es: " + a.getP().getNombre().toUpperCase());
    }
    
}

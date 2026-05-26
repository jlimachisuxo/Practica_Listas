/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer5;

/**
 *
 * @author Joshelyn
 */
public class MainPD {
    public static void main(String[] args) {
        LSimpleP a = new LSimpleP();
        a.adifinal("Titanic", "Drama", 2001, 1234567);
        a.adifinal("Avatar", "Ciencia Ficcion", 1999, 1234567);
        a.adifinal("Inception", "Ciencia Ficcion", 2004, 2341434);
        a.adifinal("La Isla", "Documental", 2007, 3214561);
        a.adifinal("Harry Potter", "Misterio y accion", 2001, 4102361);
        System.out.println("---LISTA DE a---");
        a.mostrar();
        
        LSCircularD b = new LSCircularD();
        b.adicionar("James Cameron", 1234567);
        b.adicionar("Christopher Nolan", 2341434);
        b.adicionar("Jane Montes", 3214561);
        System.out.println("\n---LISTA DE b---");
        b.mostrar();
        
        // a) Realizar el Diagrama de Clases.
        // b) Contar cuántas películas son del género documental.
        // c) Insertar un director al final de la lista de b.
        // d) Mostrar el nombre del director que haya dirigido la película más reciente.
        // e) Eliminar todas las películas cuyo director no esté en la lista de b invitados
        // f) Recorrer la lista de b y mostrar el nombre de los b y cuantas
        // películas dirigió.
        
        // b) Contar cuántas películas son del género documental.
        System.out.println("\n--- Inciso B ---");
        int cDoc = contarDocumentales(a);
        System.out.println("Cantidad de a documentales: " + cDoc);
        
        // c) Insertar un director al final de la lista de b.
        System.out.println("\n--- Inciso C ---");
        b.adiFinal("Steven Spielberg", 2547981);
        b.mostrar();
        
        // d) Mostrar el nombre del director que haya dirigido la película más reciente.
        System.out.println("\n--- Inciso D ---");
        mostrarDirectorMasReciente(a, b);
        
//        // f) Recorrer la lista de b y mostrar su nombre y cuántas películas dirigió.
        System.out.println("\n--- Inciso F ---");
        contPeliPorDirec(a, b);
        
        // e) Eliminar todas las películas cuyo director no esté en la lista de  invitados
        System.out.println("\n--- Inciso E (Eliminando a de b no invitados) ---");
        elimPeliSinDirecInvitado(a, b);
        a.mostrar();      
    }
    
    // b)
    public static int contarDocumentales(LSimpleP lista) {
        int contador = 0;
        NodoP q = lista.getP();
        while (q != null) {
            if (q.getGenero().equalsIgnoreCase("Documental")) {
                contador++;
            }
            q = q.getSig();
        }
        return contador;
    }

    // d) 
    public static void mostrarDirectorMasReciente(LSimpleP a, LSCircularD b) {
        NodoP q = a.getP();
        if (q == null) {
            System.out.println("La lista de películas está vacía.");
            return;
        }
        int maxAnio = -1;
        int ciMaxDirector = -1;
        
        while (q != null) {
            if (q.getAnioE() > maxAnio) {
                maxAnio = q.getAnioE();
                ciMaxDirector = q.getCiDirector();
            }
            q = q.getSig();
        }
        NodoD d = b.getP();
        if (d == null) {
            System.out.println("La lista de b está vacía.");
            return;
        }
        
        String nombreDirector = "No encontrado en la lista de b";
        boolean encontrado = false;        
        do {
            if (d.getCiD() == ciMaxDirector) {
                nombreDirector = d.getNomD();
                encontrado = true;
            }
            d = d.getSig();
        } while (d != b.getP() && !encontrado);
        
        System.out.println("La pelicula mas reciente es del anio " + maxAnio + " y su director es: " + nombreDirector);
    }

    // e) 
    public static void elimPeliSinDirecInvitado(LSimpleP a, LSCircularD b) {
        while (a.getP() != null && !existeDirec(b, a.getP().getCiDirector())) {
            a.setP(a.getP().getSig()); 
        }
        NodoP ant = a.getP();
        NodoP act = ant.getSig();
        
        while (act != null) {
            if (!existeDirec(b, act.getCiDirector())) {
                ant.setSig(act.getSig());
            } else {
                ant = act;
            }
            act = act.getSig();
        }
    }

    private static boolean existeDirec(LSCircularD b, int ci) {
        NodoD d = b.getP();
        do {
            if (d.getCiD() == ci) {
                return true;
            }
            d = d.getSig();
        } while (d != b.getP());
        
        return false;
    }

    // f)
    public static void contPeliPorDirec(LSimpleP a, LSCircularD b) {
        NodoD d = b.getP();
        do {
            int contadorPelis = 0;
            NodoP p = a.getP();
            while (p != null) {
                if (p.getCiDirector() == d.getCiD()) {
                    contadorPelis++;
                }
                p = p.getSig();
            }            
            System.out.println("Director: " + d.getNomD() + " | peliculas dirigidas: " + contadorPelis);
            d = d.getSig();
        } while (d != b.getP());
    }
}

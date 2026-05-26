/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer7;

/**
 *
 * @author Joshelyn
 */
public class MainP {
    public static void main(String[] args) {
        LDobleP a = new LDobleP();
        a.adifinal("rezar");
        a.adifinal("oso");
        a.adifinal("estructura");
        a.adifinal("radar");
        a.adifinal("gato");
        System.out.println("---LISTA DE PALABRAS---");
        a.mostrar();
        
        // a) Eliminar todas las palabras que sean palíndromos 
        System.out.println("\n--- a) Eliminando palabras palindromos ---");
        eliminarPalindromos(a);
        a.mostrar();
        
        // b) Insertar "IMPORTANTE" después de cada palabra con más de 8 letras
        System.out.println("\n--- b) Insertando 'IMPORTANTE' despues de palabras con > 8 letras ---");
        insertarImportante(a);
        a.mostrar();
    }
    // a) 
    public static void eliminarPalindromos(LDobleP lista) {
        NodoP q = lista.getP();
        
        while (q != null) {
            NodoP siguiente = q.getSig(); 
            String palabraActual = q.getPalabra().toLowerCase();

            String invertida = new StringBuilder(palabraActual).reverse().toString();
            
            if (palabraActual.equals(invertida)) {
                if (q == lista.getP()) {
                    lista.setP(siguiente);
                    if (lista.getP() != null) {
                        lista.getP().setAnt(null);
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

    // b) 
    public static void insertarImportante(LDobleP lista) {
        NodoP q = lista.getP();
        
        while (q != null) {
            if (q.getPalabra().length() > 8) {
                NodoP nue = new NodoP();
                nue.setPalabra("IMPORTANTE");
                
                NodoP siguienteOriginal = q.getSig();
                nue.setSig(siguienteOriginal);
                nue.setAnt(q);

                q.setSig(nue);
                
                if (siguienteOriginal != null) {
                    siguienteOriginal.setAnt(nue);
                }
                q = nue; 
            }
            q = q.getSig(); 
        }
    }
}

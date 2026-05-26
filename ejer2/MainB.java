/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer2;

/**
 *
 * @author Joshelyn
 */
public class MainB {
    public static void main(String[] args) {
        System.out.println("---LISTA DE LIBROS---");
        LSimpleB a = new LSimpleB();
        a.adiprincipio("Programcion 1", "Tomas Lenn", 2012, 5, 7);
        a.adiprincipio("Python", "Jonh Stone", 2010, 3, 8);
        a.adiprincipio("Psicoanalisis", "Lia Tomson", 2021, 7, 5);
        a.adiprincipio("Java", "Tomas Lenn", 2002, 2, 6);
        a.adiprincipio("Historia del Derecho", "Leonardo Dantes", 2012, 4, 9);
        a.adiprincipio("Biologia", "Mar Fuentes", 2022, 6, 10);
        a.mostrar();
        
        // b) Insertar un libro al final de la lista
        System.out.println("\n--- b) Insertar un libro al final de la lista");
        a.adifinal("Quimica General", "William Robin", 2015, 8, 6);
        a.mostrar();
        
        // c) Contar cuántos libros del autor x están almacenados en la lista.
        System.out.println("\n--- c) Contar cuantos libros del autor x estan almacenados en la lista");
        incisoC(a, "Tomas Lenn");
        // d) Mostrar el título del libro con mayor cantidad de ejemplares disponibles en la
        // biblioteca
        System.out.println("\n--- d) Titulo del libro con mayor cantidad de ejemplares disponibles");
        incisoD(a);
        // e) Eliminar de la lista todos los libros cuya calificación sea menor a 6. (
        // utilizar punteros)
        System.out.println("\n--- e) Eliminar de la lista todos los libros cuya calificacion sea menor a 6");
        incisoE(a);
        a.mostrar();
    }
    
    // c)
    public static void incisoC(LSimpleB a, String x){
        NodoB r=a.getP();
        int c=0;
        while(r != null){
            if(r.getAutor().equalsIgnoreCase(x)){
                c++;
            }
            r=r.getSig();
        }
        System.out.println("Se almacenan "+c+" libros del auto "+x);
    }
    // d)
    public static void incisoD(LSimpleB a){
        NodoB r=a.getP();
        NodoB mayCant = r;
        while(r != null){
            if(r.getCantEj() > mayCant.getCantEj()){
                mayCant = r;
            }
            r=r.getSig();
        }
        System.out.println("Libro con mayor cantidad de ejemplares disponibles: "+mayCant.getTitulo());   
    }
    // e)
    public static void incisoE(LSimpleB a){
        NodoB r=a.getP();
        while(r != null){
            if(r.getCalif() < 6){
                if(r == a.getP()){
                    a.setP(r.getSig());
                    r=a.getP();
                }else{
                    NodoB r2 = a.getP();
                    while(r2.getSig() != r){
                        r2=r2.getSig();
                    }
                    r2.setSig(r.getSig());
                    r=r2.getSig();
                }
            }else{
                r=r.getSig();
            }
        }
    }
}

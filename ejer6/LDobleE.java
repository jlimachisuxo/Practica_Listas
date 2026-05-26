/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer6;

/**
 *
 * @author Joshelyn
 */
public class LDobleE {
    private NodoE p;

    public LDobleE() {
        p=null;
    }

    public NodoE getP() {
        return p;
    }

    public void setP(NodoE p) {
        this.p = p;
    }
    public void adiprincipio(String n, int e, int prom, String carrera){
        NodoE nue=new NodoE();
        nue.setNombre(n);
        nue.setEdad(e);
        nue.setPromedio(prom);
        nue.setCarrera(carrera);
        
        if(getP() == null){
            setP(nue);
        }else{
            nue.setSig(getP());
            getP().setAnt(nue);
            setP(nue);
        }
    }
    
    public void adifinal(String n, int e, int prom, String carrera){
        NodoE nue=new NodoE();
        nue.setNombre(n);
        nue.setEdad(e);
        nue.setPromedio(prom);
        nue.setCarrera(carrera);
        
        if(getP() == null){
            setP(nue);
        }else{
            NodoE r=getP();
            while(r.getSig() != null){
                r=r.getSig();
            }
            r.setSig(nue);
            nue.setAnt(r);
        }
    }
    
    public void mostrar(){
        NodoE q = getP();
        while(q != null){
            System.out.println("<"+q.getNombre()+", "+q.getEdad()+","+q.getPromedio()+", "+q.getCarrera()+">");
            q = q.getSig();
            
        }
    }
    
}

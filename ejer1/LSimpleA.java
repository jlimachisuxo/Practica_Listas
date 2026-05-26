/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer1;

/**
 *
 * @author Joshelyn
 */
public class LSimpleA {
    private NodoA p;
    
    public LSimpleA() {
        p=null;
    }

    public NodoA getP() {
        return p;
    }

    public void setP(NodoA p) {
        this.p = p;
    }
    
    public void adiprincipio(String n, String gm, String pais, int pres, int cpromedio){
        NodoA nue=new NodoA();
        nue.setNombre(n);
        nue.setGéneroMusical(gm);
        nue.setPaís(pais);
        nue.setPresentaciones(pres);
        nue.setCalifPromedio(cpromedio);
        
        nue.setSig(getP());
        setP(nue);
    }
    
    public void adifinal(String n, String gm, String pais, int pres, int cpromedio){
        NodoA nue=new NodoA();
        nue.setNombre(n);
        nue.setGéneroMusical(gm);
        nue.setPaís(pais);
        nue.setPresentaciones(pres);
        nue.setCalifPromedio(cpromedio);
        
        if(getP() == null){
            setP(nue);
        }else{
            NodoA r=getP();
            while(r.getSig() != null){
                r=r.getSig();
            }
            r.setSig(nue);
        }
    }
    public void mostrar(){
        NodoA q = getP();
        while(q != null){
            System.out.println("<"+q.getNombre()+", "+q.getGéneroMusical()+", "+q.getPaís()+", "+q.getPresentaciones()+", "+q.getCalifPromedio()+">");
            q = q.getSig();
        }
    }
}

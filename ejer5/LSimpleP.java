/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer5;

/**
 *
 * @author Joshelyn
 */
public class LSimpleP {
    private NodoP p;

    public LSimpleP() {
        p=null;
    }

    public NodoP getP() {
        return p;
    }

    public void setP(NodoP p) {
        this.p = p;
    }
    public void adiprincipio(String t, String g, int ae, int ci){
        NodoP nue=new NodoP();
        nue.setTitulo(t);
        nue.setGenero(g);
        nue.setAnioE(ae);
        nue.setCiDirector(ci);
        
        nue.setSig(getP());
        setP(nue);
    }
    
    public void adifinal(String t, String g, int ae, int ci){
        NodoP nue=new NodoP();
        nue.setTitulo(t);
        nue.setGenero(g);
        nue.setAnioE(ae);
        nue.setCiDirector(ci);
        
        if(getP() == null){
            setP(nue);
        }else{
            NodoP r=getP();
            while(r.getSig() != null){
                r=r.getSig();
            }
            r.setSig(nue);
        }
    }
    public void mostrar(){
        NodoP q = getP();
        while(q != null){
            System.out.println("<"+q.getTitulo()+", "+q.getGenero()+", "+q.getAnioE()+", "+q.getCiDirector()+">");
            q = q.getSig();
        }
    }
     
}

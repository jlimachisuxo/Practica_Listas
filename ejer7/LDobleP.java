/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer7;

/**
 *
 * @author Joshelyn
 */
public class LDobleP {
    private NodoP p;

    public LDobleP() {
        p=null;
    }

    public NodoP getP() {
        return p;
    }

    public void setP(NodoP p) {
        this.p = p;
    }
    public void adiprincipio(String p){
        NodoP nue=new NodoP();
        nue.setPalabra(p);
        
        if(getP() == null){
            setP(nue);
        }else{
            nue.setSig(getP());
            getP().setAnt(nue);
            setP(nue);
        }
    }
    
    public void adifinal(String p){
        NodoP nue=new NodoP();
        nue.setPalabra(p);
        
        if(getP() == null){
            setP(nue);
        }else{
            NodoP r=getP();
            while(r.getSig() != null){
                r=r.getSig();
            }
            r.setSig(nue);
            nue.setAnt(r);
        }
    }
    
    public void mostrar(){
        NodoP q = getP();
        while(q != null){
            System.out.println("<"+q.getPalabra()+">");
            q = q.getSig();
            
        }
    }
    
}

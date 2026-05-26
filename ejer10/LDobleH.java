/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer10;

/**
 *
 * @author Joshelyn
 */
public class LDobleH {
    private NodoH p;

    public LDobleH() {
        p=null;
    }

    public NodoH getP() {
        return p;
    }

    public void setP(NodoH p) {
        this.p = p;
    }
    public void adiprincipio(int nro, int cap, int pr, boolean ocup){
        NodoH nue=new NodoH();
        nue.setNro(nro);
        nue.setCapacidad(cap);
        nue.setPrecio(pr);
        nue.setOcupada(ocup);
        
        if(getP() == null){
            setP(nue);
        }else{
            nue.setSig(getP());
            getP().setAnt(nue);
            setP(nue);
        }
    }
    
    public void adifinal(int nro, int cap, int pr, boolean ocup){
        NodoH nue=new NodoH();
        nue.setNro(nro);
        nue.setCapacidad(cap);
        nue.setPrecio(pr);
        nue.setOcupada(ocup);
        
        if(getP() == null){
            setP(nue);
        }else{
            NodoH r=getP();
            while(r.getSig() != null){
                r=r.getSig();
            }
            r.setSig(nue);
            nue.setAnt(r);
        }
    }
    
    public void mostrar(){
        NodoH q = getP();
        while(q != null){
            System.out.println("<"+q.getNro()+", "+q.getCapacidad()+","+q.getPrecio()+", "+q.isOcupada()+">");
            q = q.getSig();
            
        }
    }
    
}

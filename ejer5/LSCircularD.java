/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer5;

/**
 *
 * @author Joshelyn
 */
public class LSCircularD {
    private NodoD p;

    public LSCircularD() {
        p=null;
    }

    public NodoD getP() {
        return p;
    }

    public void setP(NodoD p) {
        this.p = p;
    }
    
    public void adicionar(String n, int ci)
    {
        NodoD nue=new NodoD();
        nue.setNomD(n);
        nue.setCiD(ci);
        
        if(getP()==null)
        {
            setP(nue);
            nue.setSig(nue);
        }
        else
        {
            NodoD w=getP();
            while(w.getSig()!=getP())
                w=w.getSig();
            w.setSig(nue);
            nue.setSig(getP());
        }
    }
    public void adiFinal(String n, int ci) {
        NodoD nue = new NodoD();
        nue.setNomD(n);
        nue.setCiD(ci);

        if (getP() == null) {
            setP(nue);
            nue.setSig(nue);
        } else {
            NodoD w = getP();
            while (w.getSig() != getP()) {
                w = w.getSig();
            }
            w.setSig(nue);
            nue.setSig(getP());
        }
    }
    
    public void mostrar()
    {
        NodoD u=getP();
        while(u.getSig()!= getP())
        {
            System.out.println(u.getNomD()+" "+u.getCiD());
            u=u.getSig();
        }
        //ultimo nodo
        System.out.println(u.getNomD()+" "+u.getCiD());
    }
    
    
}

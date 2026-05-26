/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer10;

/**
 *
 * @author Joshelyn
 */
public class LDCircularCV {
    private NodoCV p;

    public LDCircularCV() {
        p=null;
    }

    public NodoCV getP() {
        return p;
    }

    public void setP(NodoCV p) {
        this.p = p;
    }
    public void adicionar(String n, int p, int nh)
    {
        NodoCV nue=new NodoCV();
        nue.setNombre(n);
        nue.setPuntos(p);
        nue.setNochesHosp(nh);
        
        if(getP()==null)
        {
            setP(nue);
            nue.setSig(nue);
            nue.setAnt(nue);
        }
        else
        {
            NodoCV w=getP().getAnt();
            w.setSig(nue);
            nue.setAnt(w);
            nue.setSig(getP());
            getP().setAnt(nue);
        }
    }
    public void mostrar()
    {
        NodoCV u=getP();
        while(u.getSig()!=getP())
        {
            System.out.println(u.getNombre()+", "+u.getPuntos()+", "+u.getNochesHosp());
            u=u.getSig();
        }
        //ultimo nodo
        System.out.println(u.getNombre()+", "+u.getPuntos()+", "+u.getNochesHosp());
    }
    
}

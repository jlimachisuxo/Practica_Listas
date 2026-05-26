/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer8;

/**
 *
 * @author Joshelyn
 */
public class LDCircularE {
    private NodoE p;

    public LDCircularE() {
        p=null;
    }

    public NodoE getP() {
        return p;
    }

    public void setP(NodoE p) {
        this.p = p;
    }
    public void adicionar(String n, String t, int ht)
    {
        NodoE nue=new NodoE();
        nue.setNombre(n);
        nue.setTurno(t);
        nue.setHorasT(ht);
        
        
        if(getP()==null)
        {
            setP(nue);
            nue.setSig(nue);
            nue.setAnt(nue);
        }
        else
        {
            NodoE w=getP().getAnt();
            w.setSig(nue);
            nue.setAnt(w);
            nue.setSig(getP());
            getP().setAnt(nue);
        }
    }
    public void mostrar()
    {
        NodoE u=getP();
        while(u.getSig()!=getP())
        {
            System.out.println(u.getNombre()+" "+u.getTurno()+" "+u.getHorasT());
            u=u.getSig();
        }
        //ultimo nodo
        System.out.println(u.getNombre()+" "+u.getTurno()+" "+u.getHorasT());
    }
    
}

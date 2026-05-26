/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer3;

/**
 *
 * @author Joshelyn
 */
public class LSCircularP {
    private NodoP p;

    public LSCircularP() {
        p=null;
    }

    public NodoP getP() {
        return p;
    }

    public void setP(NodoP p) {
        this.p = p;
    }
    
    public void adicionar(String n, int codv, int eq)
    {
        NodoP nue=new NodoP();
        nue.setNombre(n);
        nue.setCodVuelo(codv);
        nue.setEquipajeKg(eq);
        
        if(getP()==null)
        {
            setP(nue);
            nue.setSig(nue);
        }
        else
        {
            NodoP w=getP();
            while(w.getSig()!=getP())
                w=w.getSig();
            w.setSig(nue);
            nue.setSig(getP());
        }
    }
    public void mostrar()
    {
        NodoP u=getP();
        while(u.getSig()!= getP())
        {
            System.out.println(u.getNombre()+" "+u.getCodVuelo()+" "+u.getEquipajeKg());
            u=u.getSig();
        }
        //ultimo nodo
        System.out.println(u.getNombre()+" "+u.getCodVuelo()+" "+u.getEquipajeKg());
    }
}

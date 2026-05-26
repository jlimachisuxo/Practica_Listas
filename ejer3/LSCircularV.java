/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer3;

/**
 *
 * @author Joshelyn
 */
public class LSCircularV {
    private NodoV p;

    public LSCircularV() {
        p=null;
    }

    public NodoV getP() {
        return p;
    }

    public void setP(NodoV p) {
        this.p = p;
    }
    
    public void adicionar(int codv, String des, String hs, int ad)
    {
        NodoV nue=new NodoV();
        nue.setCodVuelo(codv);
        nue.setDestino(des);
        nue.setHoraSalida(hs);
        nue.setAsientosDispo(ad);
        
        if(getP()==null)
        {
            setP(nue);
            nue.setSig(nue);
        }
        else
        {
            NodoV w=getP();
            while(w.getSig()!=getP())
                w=w.getSig();
            w.setSig(nue);
            nue.setSig(getP());
        }
    }
    public void mostrar()
    {
        NodoV u=getP();
        while(u.getSig()!= getP())
        {
            System.out.println(u.getCodVuelo()+" "+u.getDestino()+" "+u.getHoraSalida()+" "+u.getAsientosDispo());
            u=u.getSig();
        }
        //ultimo nodo
        System.out.println(u.getCodVuelo()+" "+u.getDestino()+" "+u.getHoraSalida()+" "+u.getAsientosDispo());
    }
}

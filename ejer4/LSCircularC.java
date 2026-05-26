/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer4;

/**
 *
 * @author Joshelyn
 */
public class LSCircularC {
    private NodoC p;

    public LSCircularC() {
        p=null;
    }

    public NodoC getP() {
        return p;
    }

    public void setP(NodoC p) {
        this.p = p;
    }
    public void adicionar(String nom, String mod, int vm)
    {
        NodoC nue=new NodoC();
        nue.setNomConductor(nom);
        nue.setModelo(mod);
        nue.setVelMaxima(vm);
        
        if(getP()==null)
        {
            setP(nue);
            nue.setSig(nue);
        }
        else
        {
            NodoC w=getP();
            while(w.getSig()!=getP())
                w=w.getSig();
            w.setSig(nue);
            nue.setSig(getP());
        }
    }
    public void mostrar()
    {
        NodoC u=getP();
        while(u.getSig()!= getP())
        {
            System.out.println(u.getNomConductor()+" "+u.getModelo()+" "+u.getVelMaxima());
            u=u.getSig();
        }
        //ultimo nodo
        System.out.println(u.getNomConductor()+" "+u.getModelo()+" "+u.getVelMaxima());
    }
    
}

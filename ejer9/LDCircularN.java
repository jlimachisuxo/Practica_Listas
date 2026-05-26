/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer9;

/**
 *
 * @author Joshelyn
 */
public class LDCircularN {
    private NodoN p;

    public LDCircularN() {
        p=null;
    }

    public NodoN getP() {
        return p;
    }

    public void setP(NodoN p) {
        this.p = p;
    }
    public void adicionar(int n)
    {
        NodoN nue=new NodoN();
        nue.setNum(n);
        
        if(getP()==null)
        {
            setP(nue);
            nue.setSig(nue);
            nue.setAnt(nue);
        }
        else
        {
            NodoN w=getP().getAnt();
            w.setSig(nue);
            nue.setAnt(w);
            nue.setSig(getP());
            getP().setAnt(nue);
        }
    }
    public void mostrar()
    {
        NodoN u=getP();
        while(u.getSig()!=getP())
        {
            System.out.println(u.getNum());
            u=u.getSig();
        }
        //ultimo nodo
        System.out.println(u.getNum());
    }
    
}

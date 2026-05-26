/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer2;

/**
 *
 * @author Joshelyn
 */
public class LSimpleB {
    private NodoB p;

    public LSimpleB() {
        p=null;
    }

    public NodoB getP() {
        return p;
    }

    public void setP(NodoB p) {
        this.p = p;
    }
    
    public void adiprincipio(String t, String autor, int aPubli, int cEjem, int calif){
        NodoB nue=new NodoB();
        nue.setTitulo(t);
        nue.setAutor(autor);
        nue.setAnioPubli(aPubli);
        nue.setCantEj(cEjem);
        nue.setCalif(calif);
        
        nue.setSig(getP());
        setP(nue);
    }
    
    public void adifinal(String t, String autor, int aPubli, int cEjem, int calif){
        NodoB nue=new NodoB();
        nue.setTitulo(t);
        nue.setAutor(autor);
        nue.setAnioPubli(aPubli);
        nue.setCantEj(cEjem);
        nue.setCalif(calif);
        
        if(getP() == null){
            setP(nue);
        }else{
            NodoB r=getP();
            while(r.getSig() != null){
                r=r.getSig();
            }
            r.setSig(nue);
        }
    }
    public void mostrar(){
        NodoB q = getP();
        while(q != null){
            System.out.println("<"+q.getTitulo()+", "+q.getAutor()+", "+q.getAnioPubli()+", "+q.getCantEj()+", "+q.getCalif()+">");
            q = q.getSig();
        }
    }
    
    
}

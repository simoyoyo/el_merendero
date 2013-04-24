/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Merendeproject;

/**
 *
 * @author b11g12
 */
public class OrdineDiClasse {

    private String classe;
    private Ordine ordine;
    private OrdineDiClasse next;

    public OrdineDiClasse(String nomeclasse){
        classe = nomeclasse;
    }
    
    public OrdineDiClasse(Ordine ordine) {
        this.ordine = null;
        this.next = new OrdineDiClasse();
        this.next.ordine = ordine;
    }

    public OrdineDiClasse() {
        next=null;
    }

    public void add(Ordine o) {
        OrdineDiClasse comodo = this;
        while (comodo.getNext() != null) {
            comodo = comodo.getNext();
        }
        comodo.setNext(new OrdineDiClasse());
        comodo.getNext().setOrdine(o);
    }

    public OrdineDiClasse getNext() {
        return next;
    }

    public Ordine getOrdine() {
        return ordine;
    }

    public void setOrdine(Ordine o) {
        this.ordine = o;
    }

    public void setNext(OrdineDiClasse next) {
        this.next = next;
    }

    public float getTotale() {
        OrdineDiClasse comodo = this.next;
        float tot = 0f;
        while (comodo != null) {
            tot += comodo.getOrdine().getMerendeOrdinate().getTotale();
            comodo = comodo.getNext();
        }
        return tot;
    }

    @Override
    public String toString() {
        String s = "";
        OrdineDiClasse comodo = this.next;
        while (comodo != null) {
            s += "Ordine: " + comodo.ordine + "\n";
            comodo = comodo.next;
        }
        return s;
    }
}

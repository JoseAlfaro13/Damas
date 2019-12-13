/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Damas;

/**
 *
 * @author Asus
 */
class FichasNegras extends Fichas {
     private FichasNegras prev,next;

    FichasNegras(int x, int y){
        super(x,y);
        setIcon(NEGRA_N);
        prev = next = null;
    }

    public FichasNegras getNext() {
        return next;
    }

    public void setNext(FichasNegras next) {
        this.next = next;
    }

    public FichasNegras getPrev() {
        return prev;
    }

    public void setPrev(FichasNegras prev) {
        this.prev = prev;
    }

     @Override
    public void coronar() {
        super.corona();
        super.setIcon(NEGRA_RN);
    }


     @Override
    public void seleccionar() {
    	super.select(true);
        if(this.getCorona())
            super.setIcon(NEGRA_RS);
        else
            super.setIcon(NEGRA_S);

    }


     @Override
    public void deseleccionar() {
    	super.select(false);
        if(this.getCorona())
            super.setIcon(NEGRA_RN);
        else
            super.setIcon(NEGRA_N);

    }

     @Override
    public boolean esRoja() {
        return false;
    }
}

   
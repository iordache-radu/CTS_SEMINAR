package Vl;

import Vl.Bilet;
import Vl.IBiletOnline;

public class BiletAdapterClase extends Bilet implements IBiletOnline {
    public BiletAdapterClase(float pret){
        super(pret);
    }

    @Override
    public void vindeBiletOnline() {
        super.vanzare();
    }

    @Override
    public void rezervaBiletOnline() {
super.rezervare();
    }
}

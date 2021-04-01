package Vl;

public class BiletAdapter implements IBiletOnline {
    private Bilet bilet;

    public BiletAdapter(Bilet bilet) {
        super();
        this.bilet = bilet;
    }

    @Override
    public void vindeBiletOnline() {
        this.bilet.vanzare();
    }

    @Override
    public void rezervaBiletOnline() {
this.bilet.rezervare();
    }
}

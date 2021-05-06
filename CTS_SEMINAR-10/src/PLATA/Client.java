package PLATA;

public class Client {
    private Iplata tipPlata;
    private String nume;

    public Client(String nume) {
        this.nume = nume;
        this.tipPlata= new PlataCash();
    }

    public void setTipPlata(Iplata tipPlata) {
        this.tipPlata = tipPlata;
    }

    public void plateste(float suma){
        System.out.println("Clientul "+this.nume+" are de platit "+ suma);
        this.tipPlata.plateste(suma);
    }
}

package CinspeB;

public class Masa {
    private  int nrMasa;
    private boolean esteOcupata;
    private boolean esteRezervata;

    public Masa(int nrMasa) {
        this.nrMasa = nrMasa;

    }

    public void ocupaMasa(){
        if(!this.esteOcupata) {
            this.esteOcupata = true;
            System.out.println("Masa poate fi ocupata !");
        }else{
            System.out.println("Masa nu poate fi ocupata !");
        }
    }

    public void rezervaMasa(){
        if(!this.esteRezervata){
            this.esteRezervata=true;
            System.out.println("Masa poate fi rezervata !");
        }else{
            System.out.println("Masa nu poate fi rezervbata !");
        }
    }

}

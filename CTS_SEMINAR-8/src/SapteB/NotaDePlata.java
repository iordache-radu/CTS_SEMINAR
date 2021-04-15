package SapteB;

public class NotaDePlata implements INota {
   private int sumaDePLata;

    public NotaDePlata(int sumaDePLata) {
        this.sumaDePLata = sumaDePLata;
    }

    @Override
    public void printeaza() {
        System.out.println(String.format("S-a printat nota de plata cu suma: %d",sumaDePLata));
    }
}


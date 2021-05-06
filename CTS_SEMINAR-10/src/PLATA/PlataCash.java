package PLATA;

public class PlataCash implements Iplata {
    @Override
    public void plateste(float suma) {
        System.out.println("S A PLATIT CASH "+suma);
    }
}

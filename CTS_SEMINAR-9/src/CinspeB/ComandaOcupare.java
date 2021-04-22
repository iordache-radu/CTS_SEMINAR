package CinspeB;

public class ComandaOcupare extends Comanda {


    public ComandaOcupare(Masa masa2) {
        super(masa2);
    }

    @Override
    public void executa() {
        super.masa.ocupaMasa();
    }
}

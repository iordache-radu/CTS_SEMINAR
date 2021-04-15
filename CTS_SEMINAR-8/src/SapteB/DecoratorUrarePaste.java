package SapteB;

public class DecoratorUrarePaste extends DecoratorAbstract {

    public DecoratorUrarePaste(INota nota) {
        super(nota);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("Felicitare: Paste Fericit!");
    }

    @Override
    public void printeaza() {
        super.printeaza();
        System.out.println("PASTE FERICIT ! ");
    }
}

package SapteB;

public class DecoratorCuLaMultiAni extends DecoratorAbstract {

    public DecoratorCuLaMultiAni(INota nota) {
        super(nota);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("Felicitare LMA: SA TRAIASCU PUIU !");

    }

    @Override
    public void printeaza() {

        super.printeaza();
        System.out.println("LA MULTEAN !");
    }
}

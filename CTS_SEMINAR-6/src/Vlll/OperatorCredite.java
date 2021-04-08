package Vlll;

public class OperatorCredite implements IOperatorCredite {


    @Override
    public void creareCredit(Moneda moneda,int suma) {
        System.out.println("A fost realizat creditul im suma de " + suma +" "+moneda
        );
    }
}

package CinspeB;

public class Program {
    public static void main(String[] args){


Masa masa=new Masa(1);
        Masa masa2=new Masa(2);
Comanda comandaRezervare= new ComandaRezervare(masa);
Comanda comandaOcupare=new ComandaOcupare(masa2);
Comanda comandaOcupare1=new ComandaOcupare(masa2);

Operator operator=new Operator();
operator.invoca(comandaRezervare);
operator.executaComanda();
operator.invoca(comandaOcupare);
operator.invoca(comandaOcupare1);

operator.executaComanda();
operator.executaComanda();
    }
}

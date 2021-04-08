package Xl;


import Vlll.Moneda;
import Vlll.OperatorCredite;
import Vlll.OperatorCrediteProxy;

public class Program {


    public static void main(String[] args){

OperatorCredite operatorCredite=new OperatorCredite();
operatorCredite.creareCredit(Moneda.EUR,4000);
OperatorCrediteProxy proxy=new OperatorCrediteProxy(operatorCredite);
proxy.creareCredit(Moneda.EUR,4000);
        proxy.creareCredit(Moneda.RON,14000);

    }
}

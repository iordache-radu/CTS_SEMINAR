package Vlll;

import java.util.logging.LoggingPermission;

public class OperatorCrediteProxy implements IOperatorCredite {
    OperatorCredite operatorCredite;
    public OperatorCrediteProxy(OperatorCredite operatorCredite) {
        this.operatorCredite = operatorCredite;
    }

    @Override
    public void creareCredit(Moneda moneda, int suma) {
        if(moneda==Moneda.RON){
            operatorCredite.creareCredit(moneda,suma);
        }else
            System.out.println("Banca acorda credit doar in RON");
    }
}

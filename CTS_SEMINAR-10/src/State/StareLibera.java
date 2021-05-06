package State;

public class StareLibera implements Stare {
    @Override
    public void modificaStare(Masa masa) {
        if(masa.getStare() instanceof StareLibera){
            System.out.println("NU PUTEM MODIFICA STAREA");
        }else{
            masa.setStare(this);
            System.out.println("MASA "+ masa.getNumar()+" S A TRECUT PE LIBER");
        }
    }
}

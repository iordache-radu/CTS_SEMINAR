package State;

public class StareRezervata implements Stare {
    @Override
    public void modificaStare(Masa masa) {
        if(masa.getStare() instanceof StareLibera){
            System.out.println("MASA "+masa.getNumar()+" s-a rezervat");
            masa.setStare(this);
        }else{
            System.out.println("NU SE POATE REZERVA ");
        }
    }
}

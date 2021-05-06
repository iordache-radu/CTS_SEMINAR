package State;

public class StareOcupata implements Stare{
    @Override
    public void modificaStare(Masa masa) {
        if(masa.getStare() instanceof StareLibera || masa.getStare() instanceof StareRezervata)
        {
            System.out.println("masa "+masa.getNumar()+" s-a ocupat");
            masa.setStare(this);
        }else{
            System.out.println("NU SE POATE fi ocupata ");
        }
    }
}

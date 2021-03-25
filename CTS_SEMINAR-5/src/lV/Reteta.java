package lV;

public class Reteta implements IProtitip{
    private String denumireSolutie;
    private int cantitateSolutie;

    public Reteta(String denumireSolutie, int cantitateSolutie) {
        this.denumireSolutie = denumireSolutie;
        this.cantitateSolutie = cantitateSolutie;
    }

    private Reteta() {
        //nu face validari

    }

    @Override
    public String toString() {
        return "Reteta{" +
                "denumireSolutie='" + denumireSolutie + '\'' +
                ", cantitateSolutie=" + cantitateSolutie +
                '}';
    }

    @Override
    public IProtitip copy() {
       Reteta copie=new Reteta();
       copie.cantitateSolutie=this.cantitateSolutie;
       copie.denumireSolutie=this.denumireSolutie;
       return copie;
    }
}

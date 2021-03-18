public class Birt {

    private String nume;
    private String sat;
    private int nrMediuClienti;
    private static Birt instance=null;


   private Birt(String nume, String sat, int nrMediuClienti) {
        this.nume = nume;
        this.sat = sat;
        this.nrMediuClienti = nrMediuClienti;
    }

    private Birt() {
        this.nume = "BIRTU'1";
        this.sat = "Pucioasa";
        this.nrMediuClienti = 20;
    }

    public static synchronized Birt getInstance(String nume, String sat, int nr_mediu_clienti){
       if(instance==null){
           instance=new Birt(nume,sat,nr_mediu_clienti);
       }
       return instance;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setSat(String sat) {
        this.sat = sat;
    }

    public void setNrMediuClienti(int nrMediuClienti) {
        this.nrMediuClienti = nrMediuClienti;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Birt{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", sat='").append(sat).append('\'');
        sb.append(", nr_mediu_clienti=").append(nrMediuClienti);
        sb.append('}');
        return sb.toString();
    }
}

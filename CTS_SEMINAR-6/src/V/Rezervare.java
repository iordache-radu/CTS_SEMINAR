package V;

public class Rezervare {
    private int codRezervare;
    private boolean areMancare;
    private boolean areScaun;
    private boolean areBautura;
    private boolean areMuzica;
    private String genMuzica;

    public Rezervare(int codRezervare, boolean areMancare, boolean areScaun, boolean areBautura, boolean areMuzica, String genMuzica) {
        this.codRezervare = codRezervare;
        this.areMancare = areMancare;
        this.areScaun = areScaun;
        this.areBautura = areBautura;
        this.areMuzica = areMuzica;
        this.genMuzica = genMuzica;
    }

    public void setCodRezervare(int codRezervare) {
        this.codRezervare = codRezervare;
    }

    public void setAreMancare(boolean areMancare) {
        this.areMancare = areMancare;
    }

    public void setAreScaun(boolean areScaun) {
        this.areScaun = areScaun;
    }

    public void setAreBautura(boolean areBautura) {
        this.areBautura = areBautura;
    }

    public void setAreMuzica(boolean areMuzica) {
        this.areMuzica = areMuzica;
    }

    public void setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Rezervare{");
        sb.append("codRezervare=").append(codRezervare);
        sb.append(", areMancare=").append(areMancare);
        sb.append(", areScaun=").append(areScaun);
        sb.append(", areBautura=").append(areBautura);
        sb.append(", areMuzica=").append(areMuzica);
        sb.append(", genMuzica='").append(genMuzica).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

package V;

public class RerzervareBuilderV2 implements AbstractBuilder{
    private int codRezervare;
    private boolean areMancare;
    private boolean areScaun;
    private boolean areBautura;
    private boolean areMuzica;
    private String genMuzica;

public RerzervareBuilderV2(){
    this.codRezervare=0;
    this.areMancare=false;
            this.areScaun=false;
this.areBautura=false;
    this.areMuzica=false;
    this.genMuzica="-----";
}

    public RerzervareBuilderV2 setCodRezervare(int codRezervare) {
        this.codRezervare = codRezervare;
        return this;
    }

    public RerzervareBuilderV2 setAreMancare(boolean areMancare) {
        this.areMancare = areMancare;
        return this;
    }

    public RerzervareBuilderV2 setAreScaun(boolean areScaun) {
        this.areScaun = areScaun;
        return this;
    }

    public RerzervareBuilderV2 setAreBautura(boolean areBautura) {
        this.areBautura = areBautura;
        return this;
    }

    public RerzervareBuilderV2  setAreMuzica(boolean areMuzica) {
        this.areMuzica = areMuzica;
        return this;
    }

    public RerzervareBuilderV2 setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
        return this;
    }

    @Override
    public Rezervare build() {

        return new Rezervare(codRezervare,areMancare,areScaun,areBautura,areMuzica,genMuzica);
    }
}

package V;

public class RezervareBuilder implements AbstractBuilder {
    private Rezervare rezervare;

    public RezervareBuilder() {
        this.rezervare=new Rezervare(123,false,false,false,false,"MGK666");
    }



    public RezervareBuilder setCodRezervare(int codRezervare){
this.rezervare.setCodRezervare(codRezervare);
return this;
    }

    public RezervareBuilder setAreMancare(boolean areMancare){
        this.rezervare.setAreMancare(areMancare);
        return this;
    }
    public RezervareBuilder setAreScaun(boolean areScaun){
        this.rezervare.setAreScaun(areScaun);
        return this;
    }
    public RezervareBuilder setAreBautura(boolean areBautura){
        this.rezervare.setAreBautura(areBautura);
        return this;
    }
    public RezervareBuilder setAreMuzica(boolean areMuzica){
        this.rezervare.setAreMuzica(areMuzica);
        return this;
    }

    public RezervareBuilder setGenMuzica(String genMuzica){
        this.rezervare.setGenMuzica(genMuzica);
        return this;
    }

    @Override
    public Rezervare build() {
        return rezervare;
    }

}

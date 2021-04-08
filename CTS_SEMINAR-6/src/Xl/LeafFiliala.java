package Xl;

import java.util.PrimitiveIterator;

public class LeafFiliala implements ISediu {
    private String numeFiliala;

    public LeafFiliala(String numeFiliala) {
        this.numeFiliala = numeFiliala;
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("este o filiala" +
numeFiliala);
    }

    @Override
    public void addNod(ISediu sediu) throws Exception {
throw new Exception("NU E IMPLEMEN");
    }

    @Override
    public void removeNod(ISediu sediu) throws Exception {
        throw new Exception("NU E IMPLEMEN");
    }

    @Override
    public ISediu getNod(int pozitie) throws Exception {
        throw new Exception("NU E IMPLEMEN");
    }
}

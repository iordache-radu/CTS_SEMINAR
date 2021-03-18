public class PresedinteLazy {
    private String nume;
    private int varsta;
    private int mandat;

    private static PresedinteLazy instance = null;

    private PresedinteLazy(String nume, int varsta, int mandat) {
        this.nume = nume;
        this.varsta = varsta;
        this.mandat = mandat;
    }

    private PresedinteLazy() {
        this.nume = "Presedinteleeeeee";
        this.varsta = 1250;
        this.mandat = 138000;
    }

    public static synchronized PresedinteLazy getInstance(String nume, int varsta, int mandat) {
        if (instance == null) {
            instance = new PresedinteLazy(nume,varsta,mandat);
        }
            return instance;

    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setMandat(int mandat) {
        this.mandat = mandat;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PresedinteLazy{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append(", mandat=").append(mandat);
        sb.append('}');
        return sb.toString();
    }
}




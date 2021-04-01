package lll;

public class Brancardier extends PersonalSpital {

    public Brancardier(String nume) {
        super(nume);
    }

    @Override
    public String toString() {
        return "\nBRANCARDIER "+super.getNume();
    }


}

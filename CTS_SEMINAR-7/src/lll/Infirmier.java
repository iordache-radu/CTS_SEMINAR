package lll;

public class Infirmier extends PersonalSpital {
    public Infirmier(String nume) {
        super(nume);
    }

    @Override
    public String toString() {
        return "INFIRMIER "+ super.getNume();
    }
}

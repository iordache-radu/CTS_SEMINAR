package ll;

public class FactoryPersonal {
    public PersonalSpital createPersonal(TipPersonal tipPersonal, String nume){
        switch (tipPersonal){
            case Asistent:
                return new Asistent(nume);
            case Medic:
                return new Medic(nume);
            case Brancardier:
                return new Brancardier(nume);

            default:throw new IllegalArgumentException();
        }
    }

}

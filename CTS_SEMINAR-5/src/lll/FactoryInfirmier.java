package lll;

public class FactoryInfirmier implements IFactory {
    @Override
    public PersonalSpital getPersonal(String nume) {
        return new Infirmier(nume);
    }
}

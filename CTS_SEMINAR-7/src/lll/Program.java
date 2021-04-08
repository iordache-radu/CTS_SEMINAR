package lll;



public class Program {
    public static void afisareInformatiiPersonalSpital(IFactory factory,String nume){
        PersonalSpital personalSpital=factory.getPersonal(nume);
        System.out.println(personalSpital.toString());
    }
    public static void main(String[] args){
        afisareInformatiiPersonalSpital(new FactoryAsistent(),"GINA");
        afisareInformatiiPersonalSpital(new FactoryBrancardier(),"GINU");
        afisareInformatiiPersonalSpital(new FactoryInfirmier(),"GINUTU");
    }
}

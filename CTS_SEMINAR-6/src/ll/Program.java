package ll;

public class Program {
    public static void main(String[] args){

        FactoryPersonal factoryPersonal=new FactoryPersonal();
        PersonalSpital asistent=factoryPersonal.createPersonal(TipPersonal.Asistent,"john");
        PersonalSpital medic=factoryPersonal.createPersonal(TipPersonal.Medic,"GNY");


        System.out.println(asistent);
        System.out.println(medic);
    }
}

package Vll;

public class VerificatorPersoane {
    public static boolean  isEligibil(Persoana persoana){
        if(persoana.getVarsta()>=18){
            if(!Politie.isUrmarit(persoana)){
                if(!BirouDeCredite.areCredite(persoana)){
                    return true;
                }
            }
        }
        return false;
    }
}

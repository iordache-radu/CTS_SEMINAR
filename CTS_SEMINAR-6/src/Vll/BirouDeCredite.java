package Vll;

 class BirouDeCredite {
    public static boolean areCredite(Persoana persoana){
       return Integer.parseInt(""+persoana.getCNP().charAt(11))%2==0;
    }
}

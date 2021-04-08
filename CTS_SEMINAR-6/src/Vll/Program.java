package Vll;


import Vl.Bilet;
import Vl.BiletAdapter;
import Vl.BiletAdapterClase;
import Vl.IBiletOnline;

public class Program {


    public static void main(String[] args){
Persoana persoana=new Persoana("ALBERT NBN","1990324431276");
if(VerificatorPersoane.isEligibil(persoana)){
    System.out.println("ESTE ELIGIBIL");
}else System.out.println("NU ESTE ELIGIBIL");

    }
}

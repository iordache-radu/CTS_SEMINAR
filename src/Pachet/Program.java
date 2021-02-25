package Pachet;

import Clase.Girafa;
import Clase.Zebra;
import Clase.Zoo;

public class Program {

    public static void main(String[] args){
        Zoo zoo=new Zoo();
        Girafa girafa1=new Girafa("CAMEL");
        Girafa girafa2=new Girafa("g2");
        zoo.AdaugaAnimal(girafa1);
        zoo.AdaugaAnimal(girafa2);
        Zebra z2=new Zebra("z2");
        Zebra z1=new Zebra("z1");
        zoo.AdaugaAnimal(z1);
        zoo.AdaugaAnimal(z2);
        zoo.FeedAllAnimals();
    }

}

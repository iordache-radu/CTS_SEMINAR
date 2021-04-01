package V;


import lV.Reteta;

public class Program {

    public static void main(String[] args){
 Rezervare rezervare1;
 Rezervare rezervare2;

 RezervareBuilder rezervareBuilder=new RezervareBuilder();
 rezervareBuilder.setCodRezervare(6666).setAreMancare(true);
 rezervare1=rezervareBuilder.build();

rezervare2=new RezervareBuilder().setCodRezervare(101).setAreMuzica(true).build();

Rezervare rezervare3=new Rezervare(123,false,false,
        false,false,"ALBERT NBN");
Rezervare rezervare4=rezervareBuilder.setCodRezervare(99999).setGenMuzica("NANELIEN").build();

System.out.println(rezervare1);
        System.out.println(rezervare2);
        System.out.println(rezervare3);
        System.out.println(rezervare4);



        RerzervareBuilderV2 rerzervareBuilderV2=new RerzervareBuilderV2().setAreMancare(true).setAreScaun(true).setAreBautura(true);
        Rezervare rezervare5=rerzervareBuilderV2.setCodRezervare(140).build();
        Rezervare rezervare6=rerzervareBuilderV2.setCodRezervare(160).build();
        System.out.println(rezervare5);
        System.out.println(rezervare6);


    }
}

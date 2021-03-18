public class Progroam {
    public static  void main(String[] args){
        Presedinte presedinte1=Presedinte.getInstance();
        Presedinte presedinte2=Presedinte.getInstance();


//        System.out.println(presedinte1.toString());
//        System.out.println(presedinte2.toString());

        presedinte1.setNume("CLAUS");
        presedinte2.setMandat(3);

//        System.out.println(presedinte1.toString());
//        System.out.println(presedinte2.toString());

        PresedinteLazy presedinteLazy1=PresedinteLazy.getInstance("MARCEL",12,123);
        PresedinteLazy presedinteLazy2=PresedinteLazy.getInstance("BRAILA",123,12312);
//        System.out.println(presedinteLazy1.toString());
//        System.out.println(presedinteLazy2.toString());


        Birt birt1=Birt.getInstance("HANU DRUMETULUI","PUCIOASA",20);
        Birt birt2=Birt.getInstance("HANU ANCUTEI","Braila",123);

        System.out.println(birt1.toString());
        System.out.println(birt2.toString());

        birt2.setNrMediuClienti(500000);

       System.out.println(birt1.toString());
       System.out.println(birt2.toString());
    }
}

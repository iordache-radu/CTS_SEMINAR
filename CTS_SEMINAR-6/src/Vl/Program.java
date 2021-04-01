package Vl;




public class Program {

    private static  void rezervaSiAfiseazaBiletLaCasa(Bilet bilet){
        bilet.rezervare();
        bilet.vanzare();

    }
    private static  void rezervaSiAfiseazaBiletOnline(IBiletOnline iBiletOnline){
        iBiletOnline.rezervaBiletOnline();
        iBiletOnline.vindeBiletOnline();

    }

    public static void main(String[] args){
Bilet bilet=new Bilet(30);
rezervaSiAfiseazaBiletLaCasa(bilet);
IBiletOnline adaptor=new BiletAdapter(bilet);
rezervaSiAfiseazaBiletOnline(adaptor);
IBiletOnline adapterClase=new BiletAdapterClase(50);
rezervaSiAfiseazaBiletOnline(adapterClase);

    }
}

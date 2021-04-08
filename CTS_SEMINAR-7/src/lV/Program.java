package lV;




public class Program {

    public static void main(String[] args){
      Reteta reteta=new Reteta("Paraceta",259);
      Reteta reteta1= (Reteta) reteta.copy();
      System.out.println(reteta);
        System.out.println(reteta1);
    }
}

package ZeceB;

public class Program {
    public static void main(String[] args){

Rezervare rezervare1=new Rezervare(10,20,18);
        Rezervare rezervare2=new Rezervare(12,22,19);
        Rezervare rezervare3=new Rezervare(13,23,20);
        Rezervare rezervare4=new Rezervare(14,24,21);

        FlyweightFactory flyweightFactory=new FlyweightFactory();
        Client clienti= (Client) flyweightFactory.getFlyweight("0735943319");
        clienti.printeazaRezervare(rezervare1);


 flyweightFactory.getFlyweight("0735943399").printeazaRezervare(rezervare2);

        flyweightFactory.getFlyweight("0735943399").printeazaRezervare(rezervare3);

        flyweightFactory.getFlyweight("0735943319").printeazaRezervare(rezervare4);
    }
}

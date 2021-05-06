package UNSPE;

public class Program {
    public static void main(String[] args) {
 Client client =new Client("MGK");
 client.plateste(200);
 client.setTipPlata(new PlataCard());
 client.plateste(350);

    }
}

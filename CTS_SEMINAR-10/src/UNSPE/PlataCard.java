package UNSPE;

public class PlataCard implements Iplata{
    @Override
    public void plateste(float suma) {
        System.out.println("S a platit cu cardul "+suma);
    }
}

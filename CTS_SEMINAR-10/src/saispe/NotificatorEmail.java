package saispe;

public class NotificatorEmail extends Notificator {
    @Override
    public void trimiteNotificare(Client client, String text) {
        if(client.getEmail()!=null){
            System.out.println("TRIMITERE EMAIL PT CLIENTUL "+client.getNume()+" cu mesajul: "+text );
        }else{
            if(super.getNotificator()!=null){
                super.getNotificator().trimiteNotificare(client,text);
            }else{
                System.out.println("TRIMITERE LA MANAGER CA NU AVEM DATE DESPRE"+client.getNume());
            }
        }
    }
}

package saispe;

public class NotificatorSMS extends Notificator {
    @Override
    public void trimiteNotificare(Client client, String text) {
        if(client.getNrTelefon()!=null){
            System.out.println("TRIMITE SMS CATRE "+ client.getNume()+" MESAJ : "+ text);
        }else{
            if(super.getNotificator()!=null){
                this.getNotificator().trimiteNotificare(client,text);
            }else{
                System.out.println("TRIMITERE LA MANAGER CA NU AVEM DATE DESPRE"+client.getNume());
            }

        }
    }
}

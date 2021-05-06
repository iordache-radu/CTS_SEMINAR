package saispe;

public class Program {
    public static void main(String[] args) {
Client client1=new  Client("MGK",null,null);
        Client client2=new  Client("MARIA","0203891301239",null);
        Client client3=new  Client("ALBERT NBN",null,"BASAJS@ADDA.com");
      NotificatorSMS notificatorSMS=new NotificatorSMS();
      NotificatorEmail notificatorEmail=new NotificatorEmail();
      notificatorSMS.setNotificator(notificatorEmail);
      notificatorSMS.trimiteNotificare(client2,"CE FACI?");


    }
}

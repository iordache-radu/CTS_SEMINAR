package ZeceB;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<String,Flyweight> colectie;

    public FlyweightFactory() {
        this.colectie = new HashMap<>();
    }

    public Flyweight getFlyweight(String nrTelefon){
        if(colectie.containsKey(nrTelefon)){
            return colectie.get(nrTelefon);
        }else{
            Client client=new Client("BETO",nrTelefon,"____");
            colectie.put(nrTelefon,client);
            return client;
        }

    }
}

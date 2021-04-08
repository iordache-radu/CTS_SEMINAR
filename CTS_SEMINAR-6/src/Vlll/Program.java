package Vlll;


import Vll.Persoana;
import Vll.VerificatorPersoane;
import Xl.CompositeAgentie;
import Xl.LeafFiliala;

public class Program {


    public static void main(String[] args){
        CompositeAgentie agentie1=new CompositeAgentie();
        CompositeAgentie agentie2=new CompositeAgentie();
        CompositeAgentie agentie3=new CompositeAgentie();

        LeafFiliala filiala1=new LeafFiliala("FILIALA1");
        LeafFiliala filiala2=new LeafFiliala("FILIALA2");
        LeafFiliala filiala3=new LeafFiliala("FILIALA3");

        agentie1.addNod(filiala1);
        agentie1.addNod(filiala2);
        agentie1.addNod(agentie3);

        agentie2.addNod(filiala1);

        agentie3.addNod(filiala3);
        
agentie1.afiseazaDescriere();
agentie2.afiseazaDescriere();

    }
}

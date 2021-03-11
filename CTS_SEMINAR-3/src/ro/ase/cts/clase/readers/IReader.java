package ro.ase.cts.clase.readers;

import ro.ase.cts.clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public abstract class IReader {

    protected String filePath;  // nu private ptr ca ne trebuie la mostenire

    public IReader(String filePath) {
        this.filePath = filePath;
    }

    public abstract List<Aplicant> readAplicants () throws FileNotFoundException, NumberFormatException;

    public void citireAplicant (Scanner input2, Aplicant aplicant){

        String nume = input2.next();
        String prenume = input2.next();
        int varsta = input2.nextInt();
        int punctaj = input2.nextInt();
        int nrProiecte = input2.nextInt();
        String[] vectorDenumiri = new String[nrProiecte];
        for (int i = 0; i < nrProiecte; i++)
            vectorDenumiri[i] = input2.next();

        aplicant.setNume(nume);
        aplicant.setVectorDenumiri(nrProiecte,vectorDenumiri);
        aplicant.setPrenume(prenume);
        aplicant.setPunctaj(punctaj);
        aplicant.setVarsta(varsta);

    }

}

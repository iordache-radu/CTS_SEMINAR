package ro.ase.cts.program;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Elev;
import ro.ase.cts.clase.Proiect;
import ro.ase.cts.clase.readers.AngajatiReader;
import ro.ase.cts.clase.readers.IReader;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

	public static List<Aplicant> citesteAplicanti( IReader reader) throws FileNotFoundException {
		return reader.readAplicants();
	}

	public static void main(String[] args) {
        System.out.println("Suma finantare ptr angajati: " + Angajat.getSumaFinantata());
        System.out.println("Suma finantare ptr elevi: " + Elev.getSumaFinantata());

        List<Aplicant> listaAplicanti;
		try {
			listaAplicanti = citesteAplicanti(new AngajatiReader("angajati.txt"));
			Proiect proiect=new Proiect(81);

			for(Aplicant aplicant:listaAplicanti) {
                System.out.println(aplicant.toString());
                System.out.println(aplicant.getSumaFinantare());

                aplicant.afisareRaspunsProiect(proiect);
            }
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}

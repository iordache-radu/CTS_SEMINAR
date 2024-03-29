package Test.Dubluri;

import Clase.IStudent;

import java.util.List;

public class FakeStudent implements IStudent {
    private String nume;
    private float medie;
    private int nota;
    private boolean areRestanta;
    private List<Integer> listaNote;

    public void setMedie(float medie) {
        this.medie = medie;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public void setAreRestanta(boolean areRestanta) {
        this.areRestanta = areRestanta;
    }

    @Override
    public String getNume() {


            return nume;

    }

    public void setListaNote(List<Integer> listaNote) {
        this.listaNote = listaNote;
    }

    @Override
    public void setNume(String nume) {
            this.nume=nume;
    }

    @Override
    public List<Integer> getNote() {
        return listaNote;
    }

    @Override
    public void adaugaNota(int nota) {

    }

    @Override
    public float calculeazaMedie() {
        return medie;
    }

    @Override
    public int getNota(int index) {
        return nota;
    }

    @Override
    public boolean areRestante() {
        return areRestanta;
    }
}

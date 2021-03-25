public class Asistent extends PersonalSpital {
    public Asistent(String nume) {
        super(nume);
    }

    @Override
    public String toString() {
        return "\nASISTENT "+super.getNume();
    }
}

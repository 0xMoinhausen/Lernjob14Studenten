package student;

public class MusikStudent extends Student {

    public MusikStudent(String name, int martikelnummer, float durchschnittsnote) {
        super(name, martikelnummer, durchschnittsnote);
    }

    @Override
    public void performActivity() {
        System.out.println("Spielt Klavier");
    }
}

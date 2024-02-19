package student;

public class SportStudent extends Student {

    public SportStudent(String name, int martikelnummer, float durchschnittsnote) {
        super(name, martikelnummer, durchschnittsnote);
    }

    @Override
    public void performActivity() {
        System.out.println("Spielt Fußball");
    }
}

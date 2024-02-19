package student;

public class Austauschstudent extends AbstractStudent implements Activity {
    public Austauschstudent(String name, int martikelnummer, float durchschnittsnote) {
        super(name, martikelnummer, durchschnittsnote);
    }

    @Override
    public void printDetails() {
        System.out.println(
                "Austausch Student\n"
                        + "Name: " + this.name + "\n"
                        + "Martikelnummer: " + this.martikelnummer + "\n"
                        + "Durchschnittsnote: " + this.durchschnittsnote + "\n"
        );
    }

    @Override
    public void performActivity() {

    }
}

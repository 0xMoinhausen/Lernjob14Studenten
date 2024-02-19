package student;

public class Student extends AbstractStudent implements Activity {
    public Student(String name, int martikelnummer, float durchschnittsnote) {
        super(name, martikelnummer, durchschnittsnote);
    }

    @Override
    public void printDetails() {
        System.out.println(
                "Normaler Student\n"
                + "Name: " + this.name + "\n"
                + "Martikelnummer: " + this.martikelnummer + "\n"
                + "Durchschnittsnote: " + this.durchschnittsnote + "\n"
        );
    }

    @Override
    public void performActivity() {
        System.out.println("Lernt");
    }
}

package student;

public abstract class AbstractStudent {
    protected String name;
    protected int martikelnummer;
    protected float durchschnittsnote;

    public AbstractStudent(String name, int martikelnummer, float durchschnittsnote) {
        this.name = name;
        this.martikelnummer = martikelnummer;
        this.durchschnittsnote = durchschnittsnote;
    }

    public abstract void printDetails();
}

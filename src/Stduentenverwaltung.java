import student.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Stduentenverwaltung {
    public static void main(String[] args) {
        ArrayList<AbstractStudent> students = new ArrayList<>(
                Arrays.asList(
                        new Student("Franz", 134123413, 0.7f),
                        new Student("Samir", 134113413, 6.0f),
                        new Student("Gamir", 134113413, 6.0f),
                        new Austauschstudent("Gandalf", 31425145, 5.0f),
                        new MusikStudent("Ahmed", 4356, 100.0f),
                        new SportStudent("name", 254367, 21345.0f)
                )
        );

        printStduentsDetails(students);
    }

    private static void printStduentsDetails(ArrayList<AbstractStudent> students) {
        for (AbstractStudent student: students) {
            student.printDetails();
        }
    }
}
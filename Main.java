import java.util.ArrayList;

public class Main {
    static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {

        Student s1 = new Student("Ali", 1);
        s1.addGrade(90);
        s1.addGrade(80);

        Student s2 = new Student("Aruzhan", 2);
        s2.addGrade(70);
        s2.addGrade(75);

        students.add(s1);
        students.add(s2);

        System.out.println("Before sorting:");
        showStudents();

        sortByGPA();

        System.out.println("\nAfter sorting:");
        showStudents();
    }

    static void showStudents() {
        for (Student s : students) {
            System.out.println(s);
        }
    }

    static void sortByGPA() {
        students.sort((a, b) ->
                Double.compare(b.calculateGPA(), a.calculateGPA()));
    }
}
import java.util.ArrayList;

public class Student {
    String name;
    int id;
    ArrayList<Integer> grades;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.grades = new ArrayList<>();
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double calculateGPA() {
        int sum = 0;
        for (int g : grades) {
            sum += g;
        }
        return grades.size() == 0 ? 0 : (double) sum / grades.size();
    }

    public String toString() {
        return name + " ID:" + id + " GPA:" + calculateGPA();
    }
}
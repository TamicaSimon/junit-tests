import java.util.ArrayList;

public class Student {
    private String name;
    private long id;
    private ArrayList<Integer> grades;

    public Student(String name, long id) {
        this.name = name;
        this.id = id;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public long getId() {
        return this.id;
    }

    public ArrayList<Integer> getGrades() {
        return this.grades;
    }

    public void enterGrade(int grade) {
        this.grades.add(grade);
    }

    public double getGradeAverage() {
        int sum = 0;
        for (int grade: this.grades) {
            sum += grade;
        }
        if (this.grades.size() > 0) {
            return (double) sum / this.grades.size();
        } else {
            return 0.0;
        }
    }
}

package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Жорж Адамович", "Химия");
        Student student = new Student("Васин");
        teacher.evaluate(student);
    }
}
class Teacher {
    private String name;
    private String subject;
    private String grade;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }
    public String getGrade() {
        return grade;
    }

    public void evaluate(Student student) {
        int gradeInt = (int) (Math.random() * (6 - 2) + 2);

        if (gradeInt == 2) {
            grade = "неудовлетворительно";
        }
        if (gradeInt == 3) {
            grade = "удовлетворительно";
        }
        if (gradeInt == 4) {
            grade = "хорошо";
        }
        if (gradeInt == 5) {
            grade = "отлично";
        }
        System.out.println("Преподаватель " + name + " оценил студента с именем " +
                student.getName() + " по предмету " + subject + " на оценку " + grade);
    }
}
class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}

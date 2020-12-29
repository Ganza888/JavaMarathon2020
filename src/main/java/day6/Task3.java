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
    String grade;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void evaluate(Student student) {
        int gradeInt = (int) (Math.random() * (6 - 2) + 2);
        System.out.println("Преподаватель " + name + " оценил студента с именем " +
                student.name + " по предмету " + subject + " на оценку " + grade);
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


    }
}
class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }
}

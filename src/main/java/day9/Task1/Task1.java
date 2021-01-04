package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Иванов","110520");
        Teacher teacher = new Teacher("Андрей Петрович","Физика");
        student.showGroup();
        teacher.showSubject();
        student.printInfo();
        teacher.printInfo();
    }
}

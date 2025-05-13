import java.util.ArrayList;
import java.util.List;

class Course {
    private String courseName;
    private int marks;

    public Course(String courseName, int marks) {
        this.courseName = courseName;
        this.marks = marks;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getMarks() {
        return marks;
    }
}

class Student {
    private String name;
    private String program;
    private int semester;
    private List<Course> courses;

    public Student(String name, String program, int semester) {
        this.name = name;
        this.program = program;
        this.semester = semester;
        this.courses = new ArrayList<>();
    }

    public void registerCourse(String courseName, int marks) {
        courses.add(new Course(courseName, marks));
    }

    public void displayStudentDetails() {
        System.out.println("Name: " + name);
        System.out.println("Program: " + program);
        System.out.println("Semester: " + semester);
        System.out.println("Registered Courses:");
        for (Course course : courses) {
            System.out.println("  - " + course.getCourseName() + " (Marks: " + course.getMarks() + ")");
        }
    }

    public void displayLowMarksCourses() {
        System.out.println("Courses where " + name + " scored less than 40:");
        for (Course course : courses) {
            if (course.getMarks() < 40) {
                System.out.println("  - " + course.getCourseName() + " (Marks: " + course.getMarks() + ")");
            }
        }
    }
}

public class StudentCourseSystem {
    public static void main(String[] args) {
        Student student1 = new Student("Aditi", "BCA", 3);
        student1.registerCourse("JAVA", 75);
        student1.registerCourse(" C Programming", 35);
        student1.registerCourse("devops", 80);
        student1.registerCourse("DSA", 30);

        student1.displayStudentDetails();
        System.out.println();
        student1.displayLowMarksCourses();
    }
}

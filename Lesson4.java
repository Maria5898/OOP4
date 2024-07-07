import controller.StudentController;
import controller.TeacherController;
import java.util.List;
import model.Student;
import model.Teachers;

public class Lesson4 {

    public static void main(String[] args) {

        new StudentController()
                .sendOnConsole(List.of(new Student(1, "Sasha", "Ivanov"),
                        new Student(1, "Ira", "Ivanova")));

        new TeacherController().createTeacher("Masha", "Smirnova");
        new TeacherController().createTeacher("Sasha", "Nikolaeva");
        new TeacherController().sendOnConsole(Teachers.teatchers);
        new TeacherController().redactTeatcher(2, "Tany", "Vasileva");
        new TeacherController().sendOnConsole(Teachers.teatchers);
    }

//    private static List<Student> getStudents() {
//        Student s1 = new Student(1, "Sasha", "Ivanov");
//        Student s2 = new Student(1, "Ira", "Ivanova");
//        return List.of(s1, s2);
//    }
}
package controller;

import java.util.List;

import model.Student;
import model.Teacher;
import model.Teachers;
import model.User;
import view.TeacherView;
import view.UserView;

public class TeacherController{

    private UserView<Teacher> view = new TeacherView();

    public Teacher createTeacher(String name, String last) {
        int id = Teachers.teatchers.size() + 1;
        Teacher teacher = new Teacher(id, name, last);
        Teachers.teachers.add(teacher);
        return teacher;
    }

    public void redactTeatcher(int id, String name, String last) {
        Teacher teatcher = Teachers.teatchers.remove(id - 1);
        teacher.setName(name);
        teacher.setLastName(last);
        Teachers.teatchers.add(id - 1, teatcher);
    }

    public void sendOnConsole(List<Teacher> teachers) {
        view.sendOnConsole(teachers);
    }


}

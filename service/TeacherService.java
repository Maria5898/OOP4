package service;

import model.Teacher;

public class TeacherService {

    public Teacher createTeatcher(int id, String name, String last) {
        return new Teacher (id, name, last);
    }

    
}

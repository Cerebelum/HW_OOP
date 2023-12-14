package HW_Sem_06.controller;

import HW_Sem_06.model.Student;
import HW_Sem_06.model.service.StudentService;
import HW_Sem_06.view.StudentView;

public class StudentController implements UserController<Student> {
    private final StudentService studentService = new StudentService();
    private final StudentView studentView = new StudentView();

    @Override
    public void create(String firstName, String secondName, String lastName) {
        studentService.create(firstName, secondName, lastName);
    }

    @Override
    public void sendOnConsole() {
        studentView.sendOnConsole(studentService.getStudentList());
    }

}

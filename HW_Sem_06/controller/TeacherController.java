package HW_Sem_06.controller;

import HW_Sem_06.model.Teacher;
import HW_Sem_06.model.service.TeacherService;
import HW_Sem_06.view.TeacherView;

public class TeacherController implements UserController<Teacher> {
    private final TeacherService teacherService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();

    @Override
    public void create(String firstName, String secondName, String lastName) {
        teacherService.create(firstName, secondName, lastName);
    }


    @Override
    public void sendOnConsole() {
        teacherView.sendOnConsole(teacherService.getTeacherList());
    }

}

package HW_Sem_05;

import java.util.ArrayList;
import java.util.List;

import HW_Sem_05.model.service.StudyGroupService;
import HW_Sem_05.model.Teacher;
import HW_Sem_05.model.Student;
import HW_Sem_05.model.StudyGroup;
import HW_Sem_05.controller.Controller;

public class Main {
    public static void main(String[] args) {

// ******************************** с семинара ***************************
        // Controller controller = new Controller();
        // controller.createStudent("Иван", "Иванович", "Иванов");
        // controller.createStudent("Петр", "Петрович", "Петров");
        // controller.createStudent("Сидор", "Сидорович", "Сидоров");
        // controller.printAllStudents();

        // controller.createTeacher("Марфа", "Васильевна", "Сорокопят");
        // controller.createTeacher("Зорро", "Владимирович", "Магомедов");
        // controller.createTeacher("Александр", "Андреевич", "Пузиков");
        // controller.printAllTeachers();

// ************************************ Домашки ****************************************
        Controller controller = new Controller();
        controller.createStudent("Иван", "Иванович", "Иванов");
        controller.createStudent("Петр", "Петрович", "Петров");
        controller.createStudent("Сидор", "Сидорович", "Сидоров");

        controller.createTeacher("Марфа", "Васильевна", "Сорокопят");

        StudyGroupService studyGroupService = new StudyGroupService();
        StudyGroup studyGroup1 = studyGroupService.createStudyGroup(controller.getTeacherByID(0), controller.getAllStudents());
        System.out.println(studyGroup1);

    }

}

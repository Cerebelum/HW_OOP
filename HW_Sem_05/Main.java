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

// *******************************************************************************************************
        Controller controller = new Controller();
        controller.createStudent("Иван", "Иванович", "Иванов");
        controller.createStudent("Петр", "Петрович", "Петров");
        controller.createStudent("Сидор", "Сидорович", "Сидоров");
        // System.out.println(controller.getAllStudents());
        // controller.printAllStudents();
        

        controller.createTeacher("Марфа", "Васильевна", "Сорокопят");
        // System.out.println(controller.getAllTeachers());

        StudyGroupService studyGroupService = new StudyGroupService();
        StudyGroup studyGroup1 = studyGroupService.createStudyGroup(controller.getTeacherByID(0), controller.getAllStudents());
        System.out.println(studyGroup1);




// ************************************ домашка *****************************************
        // Создаем студентов
        // Student student1 = new Student("Иван", "Иванович", "Иванов", 123);
        // Student student2 = new Student("Петр", "Петрович", "Петров", 456);
        // Student student3 = new Student("Сидор", "Сидорович", "Сидоров", 789);

        // Создаем преподавателя
        // Teacher teacher = new Teacher("Алексей", "Алексеевич", "Алексеев", 777);

        // Создаем список студентов
        // List<Student> students = new ArrayList<>();
        // students.add(student1);
        // students.add(student2);
        // students.add(student3);

        // Создаем объект StudyGroupService
        // StudyGroupService studyGroupService = new StudyGroupService();

        // Создаем учебную группу
        // StudyGroup studyGroup = studyGroupService.createStudyGroup(teacher, students);

        // Выводим учебную группу в консоль
        // System.out.println(studyGroup);
    }


}

package HW_Sem_06.view;

import java.util.List;

import HW_Sem_06.model.Student;

public class StudentView implements UserView<Student> {

    @Override
    public void sendOnConsole(List<Student> list) {
        for (Student student : list) {
            System.out.println(student);
        }
        
    }
    
}

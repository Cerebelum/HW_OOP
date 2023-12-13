package HW_Sem_05.model.service;

import java.util.List;

import HW_Sem_05.model.Teacher;
import HW_Sem_05.model.Student;
import HW_Sem_05.model.StudentGroup;
import HW_Sem_05.model.StudyGroup;


public class StudyGroupService {
    
    public StudyGroup createStudyGroup(Teacher teacher, List<Student> students) {
        StudentGroup studentGroup = new StudentGroup(1, students);
        return new StudyGroup(teacher, studentGroup);
    }
}

package HW_Sem_04;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student> {
    private List<Student> studentList;
    private int index = 0;

    public StudentGroup(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    // public StudentGroup addStudent(Student student) {
    //     this.studentList.add(student);
    //     return this;
    // }

    @Override
    public String toString() {
        return studentList.toString();
    }

    @Override
    public Iterator<Student> iterator() {
        // анонимный класс
        return new Iterator<Student>() {

            @Override
            public boolean hasNext() {
                return index < studentList.size();
            }

            @Override
            public Student next() {
                return studentList.get(index++);
            }
            
        };
    }

    // @Override
    // public Iterator<Student> iterator() {
    //     return new StudentGroupIterator(this);
    // }

    
}

package HW_Sem_04;

public interface UserService<T extends User> {
    void create(String firstName, String secondName, String lastName);
}

package HW_Sem_06.model.service;

import HW_Sem_06.model.User;

public interface UserService<T extends User> {
    void create(String firstName, String secondName, String lastName);
}

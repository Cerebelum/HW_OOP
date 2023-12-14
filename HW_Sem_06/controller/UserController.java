package HW_Sem_06.controller;

import HW_Sem_06.model.User;

public interface UserController<T extends User> {
    void create(String firstName, String secondName, String lastName);
    void sendOnConsole();
    
}

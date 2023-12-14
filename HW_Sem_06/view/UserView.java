package HW_Sem_06.view;

import java.util.List;

import HW_Sem_06.model.User;

public interface UserView<T extends User> {
    
    void sendOnConsole(List<T> list);
}

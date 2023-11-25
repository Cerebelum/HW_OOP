package HW_OOP.HW_Sem_02;

public interface QueueBehaviour {

    void takeInQueue(Actor actor);

    void takeOrders();

    void giveOrders();

    void releaseFromQueue();
}
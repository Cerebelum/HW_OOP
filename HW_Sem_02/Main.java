package HW_OOP.HW_Sem_02;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Actor client1 = new Human("Василий Алибабаевич");
        Actor client2 = new Human("Петр");
        market.acceptToMarket(client1);
        market.acceptToMarket(client2);
        market.update();
    }
}

package HW_OOP.HW_Sem_02;

import java.util.List;

public interface MarketBehaviour {

    void acceptToMarket(Actor actor);

    void releaseFromMarket(List<Actor> actors);

    void update();
}
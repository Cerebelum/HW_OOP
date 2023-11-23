public class HotDrink extends BottleOFWater {

    private int temperature;

    public HotDrink(String name, int cost, int volume, int temperature) {
        super(name, cost, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return String.format("%s - %s, %d руб., %d мл, %d°C",
                getClass().getSimpleName(),
                super.getName(),
                super.getCost(),
                super.getVolume(),
                temperature);
    }
}

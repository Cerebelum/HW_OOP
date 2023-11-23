import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        // productList.add(new BottleOFWater("qwe", 123, 100));
        // productList.add(new BottleOFWater("qwe", 200, 150));
        // productList.add(new BottleOFWater("zxcg", 500, 1000));
        // productList.add(new BottleOFWater("qaffwe", 123, 10));

        // BottleOfWaterVendingMachine vendingMachine = new BottleOfWaterVendingMachine();
        // vendingMachine.initProduct(productList);
        // System.out.println(vendingMachine.getProduct("qwe", 150));

        // Product test = new BottleOFWater("asd", 123, 123);
        // System.out.println(test);

        productList.add(new HotDrink("Чай", 50, 200, 75));
        productList.add(new HotDrink("Кофе", 100, 100, 75));
        productList.add(new HotDrink("Какао", 100, 200, 60));
        productList.add(new HotDrink("Шоколад", 150, 250, 60));
        for (Product product : productList) {
            System.out.println(product);
        }

        HotDrinkVendingMachine hMachine = new HotDrinkVendingMachine();
        hMachine.initProduct(productList);
        System.out.println();
        System.out.println(hMachine.getProduct("Какао"));
        System.out.println(hMachine.geProduct("Кофе", 100, 75));
    }
}
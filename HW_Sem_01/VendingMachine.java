// import java.util.ArrayList;
import java.util.List;

public interface VendingMachine {
    public void initProduct(List<Product> productList);
    public Product getProduct(String name);
}

// public class VendingMachine {

//     private List<Product> productList = new ArrayList<>();

//     public void initProduct(List<Product> productList) {
//         this.productList = productList;
//     }

//     public Product getProduct(String name) {
//         for (Product product : productList) {
//             if (product.getName().equals(name)) {
//                 return product;
//             }
//         }
//         return null;
//     }
// }
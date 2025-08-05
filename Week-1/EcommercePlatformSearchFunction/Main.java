package EcommercePlatformSearchFunction;

//File: Main.java
import java.util.Arrays;
import java.util.Comparator;

public class Main {
 public static void main(String[] args) {
     Product[] products = {
         new Product(101, "Laptop", "Electronics"),
         new Product(205, "Shoes", "Footwear"),
         new Product(150, "Keyboard", "Accessories"),
         new Product(199, "Smartphone", "Electronics"),
         new Product(180, "T-shirt", "Apparel")
     };

     int searchId = 150;

     // Linear Search
     System.out.println("Using Linear Search:");
     Product linearResult = SearchUtils.linearSearch(products, searchId);
     System.out.println(linearResult != null ? linearResult : "Product not found");

     // Sort by productId before binary search
     Arrays.sort(products, Comparator.comparingInt(Product::getProductId));

     // Binary Search
     System.out.println("Using Binary Search:");
     Product binaryResult = SearchUtils.binarySearch(products, searchId);
     System.out.println(binaryResult != null ? binaryResult : "Product not found");
 }
}

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String[] products = {"product_1", "product_2", "product_3", "product_4", "product_5"};
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        try {
            search(product, products);
            System.out.println("product successfully found" );
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
    public static void search(String product, String[] products) throws Exception {
        for (int i = 0; i < products.length; i++) {
            if (products[i].equals(product)   ) {
                return;
            }
        }
        throw new Exception("404");
    }
}






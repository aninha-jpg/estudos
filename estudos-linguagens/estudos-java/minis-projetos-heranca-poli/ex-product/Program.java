import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try(Scanner sc = new Scanner(System.in)){

            System.out.print("Enter the number of products: ");
            int n = sc.nextInt();

            DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            List<Product> products = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                System.out.println("Product #" + (1 + i) + " data:");

                System.out.print("Common, used or imported(c/u/i)? ");
                char option = sc.next().charAt(0);
                sc.nextLine();
                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Price: ");
                Double price = sc.nextDouble();
                sc.nextLine();
                     
                switch (option) {
                    case 'c' -> {
                        Product product = new Product(name, price);
                        products.add(product);
                    }

                    case 'u' -> {
                        System.out.print("Manufacture Date (dd/MM/yyyy): ");
                        LocalDate date = LocalDate.parse(sc.nextLine(), fmt);
                        Product product = new UsedProduct(name, price, date);
                        products.add(product);
                    } 


                    case 'i' -> {
                        System.out.print("Customs fee: ");
                        Double customsFee = sc.nextDouble();
                        Product product = new ImportedProduct(name, price, customsFee);
                        products.add(product);

                    }


                }

            }
            System.out.println();
            System.out.println("PRICE TAGS: ");
            for(Product c: products){
                System.out.println(c.priceTag());
            }

        }


    }
}

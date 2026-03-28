import java.util.Locale;
import java.util.Scanner;
import util.CurrencyConverter;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)){

            System.out.print("What is the dollar price? ");
            double priceDollar = sc.nextDouble();
            System.out.print("How many dollars will be bought?");
            double dollarBuy = sc.nextDouble();

            double calc = CurrencyConverter.tax(priceDollar, dollarBuy);

            System.out.printf("Aumount to be paid in reais: %.2f%n", calc);


        }
        
    }
}
import java.io.IOException;
import java.util.Scanner;

public class Circulo {
 
    public static void main(String[] args) throws IOException {
        try (Scanner leitor = new Scanner(System.in)){
            double pi = 3.14159;

            double raio = leitor.nextDouble();

            double area = (raio * raio) * pi;

            System.out.printf("A=%.4f%n", area);

        }
    
    }
 
}
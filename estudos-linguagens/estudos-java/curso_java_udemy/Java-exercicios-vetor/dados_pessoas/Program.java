import entities.Person;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)){
        System.out.println("Quantas pessoas serão digitadas?");
        int n = sc.nextInt();
        Person[] vect = new Person[n];

        for(int i = 0; i<n; i++){
            System.out.printf("Altura da %sa pessoa: ", i + 1);
            double height = sc.nextDouble();
            System.out.printf("Genero da %sa pessoa: ", i + 1);
            char sex = sc.next().charAt(0);
            vect[i] = new Person(sex, height);
        }

        double maiorAltura = vect[0].getHeight();
        double menorAltura = vect[0].getHeight();

        double soma = 0;
        int numeroHomens = 0;
        int numeroMulheres = 0;

        for(int i = 0; i<n; i++){
            if(vect[i].getHeight() > maiorAltura){
                maiorAltura = vect[i].getHeight();
            }
            
            if(vect[i].getHeight() < menorAltura){
                menorAltura = vect[i].getHeight();
            }

            if(vect[i].getSex() == 'F'){
                soma += vect[i].getHeight();
                numeroMulheres++;
            } else {
                numeroHomens++;
            }
        }

        double mediaMulheres = (double)soma / numeroMulheres;

        System.out.printf("Maior altura: %.2f%n", maiorAltura);
        System.out.printf("Menor altura: %.2f%n", menorAltura);
        System.out.printf("Media Altura das Mulheres: %.2f%n", mediaMulheres);
        System.out.printf("Número de Homens: " + numeroHomens);
    }
}
}
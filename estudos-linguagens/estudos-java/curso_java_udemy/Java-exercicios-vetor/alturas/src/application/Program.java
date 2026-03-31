package application;
import entities.Person;
import java.util.Locale;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Quantas pessoas você vai digitar?");
            int n = sc.nextInt();

            Person[] vect = new Person[n];
        
            for(int i = 0; i<vect.length; i++){
                System.out.printf("Dados da %da pessoa: \n", i + 1);
                sc.nextLine();
                System.out.print("Nome: ");
                String name = sc.nextLine();
                System.out.print("Idade: ");
                int age = sc.nextInt();
                System.out.print("Altura: ");
                double height = sc.nextDouble();

                vect[i] = new Person(name, age, height);
            }

            double sum = 0;
            for(int i = 0; i<vect.length; i++){
                sum += vect[i].getHeight();
            }

            int qtdMenores = 0;
            for(int i = 0; i<vect.length; i++){
                if(vect[i].getAge() < 16){
                    qtdMenores++;
                }
            }

            System.out.println("Quantidade menores: " + qtdMenores);

            double percentualTotal = ((double)qtdMenores / n) * 100.0;
            double media = sum / n;

            System.out.printf("Altura média: %.2f%n", media);
            System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualTotal);

            for(int i = 0; i<vect.length; i++){
                if(vect[i].getAge() < 16){
                    System.out.println(vect[i].getName());
                }
            }

        }
    }

}

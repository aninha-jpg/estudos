import entities.Person;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)){
        System.out.println("Quantos números vai ter o vetor?");
        int n = sc.nextInt();
        Person[] vect = new Person[n];

        for(int i = 0; i<n; i++){
            System.out.printf("Dados da %sa pessoa: %n", i + 1);
            sc.nextLine();
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int age = sc.nextInt();

            vect[i] = new Person(name, age);
        }

        int maior = vect[0].getAge();
        String nomePVelha = vect[0].getName();

        for(int i = 0; i<n; i++){
        if(vect[i].getAge() > maior){
            maior = vect[i].getAge();
            nomePVelha = vect[i].getName();
            }
        }
        System.out.println("Pessoa mais velha: " + nomePVelha + " com " + maior + " anos ");

        }
    }
}
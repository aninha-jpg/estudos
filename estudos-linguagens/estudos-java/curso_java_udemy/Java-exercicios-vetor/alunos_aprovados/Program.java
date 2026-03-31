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
            System.out.printf("Digite nome, primeira nota e segunda nota do %so aluno: %n", i + 1);
            sc.nextLine();
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Primeira Nota: ");
            double notaUm = sc.nextDouble();
            System.out.print("Segunda Nota: ");
            double notaDois = sc.nextDouble();

            vect[i] = new Person(name, notaUm, notaDois);
        }
        System.out.println("Alunos aprovados: ");
        String aprovados;
        for(int i = 0; i<n; i++){
            if(vect[i].getMediaAluno() >= 6.0){
                aprovados = vect[i].getName();
                System.out.println(aprovados);
            }
        }

        }
    }
}
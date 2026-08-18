import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Program {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){

            Installment installment;

            DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            System.out.println("Entre com os dados do contrato:");

            System.out.print("Número: ");
            Integer number = sc.nextInt();
            sc.nextLine();
            System.out.print("Data(dd/MM/yyyy): ");
            String dateStr = sc.nextLine();
            LocalDate date = LocalDate.parse(dateStr, fmt);

            System.out.print("Valor do contrato: ");
            Double totalValue = sc.nextDouble();

            System.out.println("Entre com o número de parcelas");
            Integer month = sc.nextInt();

            Contract contract = new Contract(number, date, totalValue);

            ContractService cnt = new ContractService();

            cnt.processContract(contract, month);  
            
            System.out.println("PARCELAS:");
            for(Installment i : contract.getInstallments()){
                System.out.println(i.toString());
            }

        }

    }
}
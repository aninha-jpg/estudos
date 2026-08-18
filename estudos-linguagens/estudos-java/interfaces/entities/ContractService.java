public class ContractService {

    private OnlinePaymentService opService = new PaypalService();

    public void processContract(Contract contract, Integer month){
        for(int i = 1; i <= month; i++){ 

            double installment = contract.getTotalValue() / month;
            double aux = opService.paymentFee(installment);

            double aux2 = opService.interest(installment, i);

            double sum = aux + aux2 + installment;

            contract.getInstallments().add(new Installment(contract.getDate().plusMonths(i), sum));
            }
    }
}
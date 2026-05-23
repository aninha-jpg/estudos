package entities;

public class LegalPerson extends Payers {
    private Integer EmployeeNumber;

    public LegalPerson(){

    }

    public LegalPerson(String name, Double currentIncome, Integer employeeNumber) {
        super(name, currentIncome);
        EmployeeNumber = employeeNumber;
    }

    public Integer getEmployeeNumber() {
        return EmployeeNumber;
    }

    public void setEmployeeNumber(Integer employeeNumber) {
        EmployeeNumber = employeeNumber;
    }

    @Override
    public Double tax(){
        // pagam 16%
        // se tiver mais de 10 func paga 14%

        if(this.EmployeeNumber > 10){
            return super.getCurrentIncome() * 0.14;
        } else {
            return super.getCurrentIncome() * 0.16;
        }

    }
    
}

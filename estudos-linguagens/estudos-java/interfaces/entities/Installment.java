import java.time.LocalDate;

public class Installment {
    private LocalDate dueDate;
    private Double amount;

    public Installment(){

    }

    public Installment(LocalDate dueDate, Double amount){
        this.dueDate = dueDate;
        this.amount = amount;
    }

    public LocalDate getDate(){
        return dueDate;
    }

    public void setDate(LocalDate dueDate){
        this.dueDate = dueDate;
    }

    public Double getamount(){
        return amount;
    }

    public void setAmount(Double amount){
        this.amount = amount;
    }

    @Override
    public String toString(){
        return dueDate + "-" + amount ;
    }

}
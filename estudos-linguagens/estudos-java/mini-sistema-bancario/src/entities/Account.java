package entities;

public class Account {

    private String name;
    private final int numberAccount;
    private double value;

    public Account(String name, int numberAccount, double initialDeposit){
        this.name = name;
        this.numberAccount = numberAccount;
        addValue(initialDeposit);
    } 

    public Account(String name, int numberAccount){
        this.name = name;
        this.numberAccount = numberAccount;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getNumberAccount(){
        return numberAccount;
    }

    public double getValue(){
        return value;
    }

    public void addValue(double value){
        this.value += value;
    }

    public double tax(){
        return 5.00;
    }

    public void removeValue(double value){
        this.value -= (value + tax());
    }

    public String toString(){
        return "✿ Account: "
        + numberAccount
        + ", ✿ Holder: "
        + name
        + ", ✿ Balance: $ "
        + String.format("%.2f%n", value);
    }

}

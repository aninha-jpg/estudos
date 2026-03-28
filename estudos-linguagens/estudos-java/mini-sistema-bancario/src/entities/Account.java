package entities;

public class Account {

    private String name;
    private final int numberAccount;
    private double value;

    public Account(String name, int numberAccount, double value){
        this.name = name;
        this.numberAccount = numberAccount;
        this.value = value;
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

}

package entities;

public abstract class Payers {
    private String name;
    private Double currentIncome;

    public Payers() {

    }

    public Payers(String name, Double currentIncome) {
        this.name = name;
        this.currentIncome = currentIncome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCurrentIncome() {
        return currentIncome;
    }

    public void setCurrentIncome(Double currentIncome) {
        this.currentIncome = currentIncome;
    }

    public abstract Double tax();
    
}

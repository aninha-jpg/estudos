package entities;

public class Employee {

    private String name;
    private final Integer id;
    private Double salary;

    public Employee(String name, Integer id, Double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public double getSalary(){
        return salary;
    }
    
    @Override
    public String toString(){
        return id + ", " 
        + name + ", " 
        + String.format("%.2f", salary) + "\n";
    }

    public void increaseSalary(double tempPercentage){
        this.salary += (this.salary * tempPercentage) / 100;
    }
    
}

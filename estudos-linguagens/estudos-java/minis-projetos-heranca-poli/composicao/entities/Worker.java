package entities;

import java.util.ArrayList;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel workerLever;
    private Double baseSalary;
    private Department department;
    private List<HourContract> contracts = new ArrayList<>();

    public Worker(){

    }
    
    public Worker(String name, WorkerLevel workerLever, Double baseSalary, Department department) {
        this.name = name;
        this.workerLever = workerLever;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getWorkerLever() {
        return workerLever;
    }

    public void setWorkerLever(WorkerLevel workerLever) {
        this.workerLever = workerLever;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public void adcBaseSalary(Double contract) {
        baseSalary += contract;
    }

    public void addContract(HourContract contract){
        contracts.add(contract);
    }

    public void removeContract(HourContract contract){
        contracts.remove(contract);
    }

    public double income(int year, int month){
        double sum = baseSalary;
        for(HourContract c: contracts){
            if(year == c.getDate().getYear() && month == c.getDate().getMonthValue()){
                sum += c.totalValue();
            }
        }
        return sum;
    }

}

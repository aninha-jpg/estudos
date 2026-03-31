package entities;

public class Person {
    private char sex;
    private double height;

    public Person(char sex, double height){
        this.sex = sex;
        this.height = height;
    }

    public void setSex(char sex){
        this.sex = sex;
    }

    public char getSex(){
        return sex;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getHeight(){
        return height;
    }
    
}

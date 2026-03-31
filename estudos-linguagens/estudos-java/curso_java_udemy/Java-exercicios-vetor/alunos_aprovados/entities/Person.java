package entities;

public class Person {
    private String name;
    private double notaUm;
    private double notaDois;

    public Person(String name, double notaUm, double notaDois){
        this.name = name;
        this.notaUm = notaUm;
        this.notaDois = notaDois;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public double getNotaUm(){
        return notaUm;
    }

    public void setNotaUm(double notaUm){
        this.notaUm = notaUm;
    }

    public double getNotaDois(){
        return notaDois;
    }

    public void setNotaDois(double notaDois){
        this.notaDois = notaDois;
    }

    public double getMediaAluno(){
        return (notaUm + notaDois) / 2;
    }

}

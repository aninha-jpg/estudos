package entities;

public class NaturalPerson extends Payers {
    private Double healthcare;

    public NaturalPerson () {

    }

    public NaturalPerson(String name, Double currentIncome, Double healthcare) {
        super(name, currentIncome);
        this.healthcare = healthcare;
    }

    public Double getHealthcare() {
        return healthcare;
    }

    public void setHealthcare(Double healthcare) {
        this.healthcare = healthcare;
    }

    @Override
    public Double tax(){
        Double aux = 0.0;
        // se a renda for menor que 20k paga 15%
        // se a renda for maior que 20k paga 25%
        // se teve gasto com saude, abate 50%
        if(super.getCurrentIncome() >= 20000){
            if(this.healthcare > 0){
                aux = (super.getCurrentIncome() * 0.25) - (this.healthcare * 0.5);        
            } else {
                aux = super.getCurrentIncome() * 0.25;
            }
        }

        if(super.getCurrentIncome() < 20000){
            if(this.healthcare > 0){
                aux = (super.getCurrentIncome()) * 0.15 - (this.healthcare * 0.5);        
            } else {
                aux = super.getCurrentIncome() * 0.15;
            }
        }

        if(aux <= 0){
            return 0.0;
        } else {
            return aux;
        }
    }

    


}
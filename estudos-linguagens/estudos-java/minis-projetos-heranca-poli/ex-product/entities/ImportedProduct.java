package entities;

public class ImportedProduct extends Product {

    private Double customsFee;

   public ImportedProduct(){

   }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    public Double totalPrice(Double customsfee){
        return customsfee + super.getPrice();
    }

    @Override
    public String priceTag(){
        return super.getName() + " $ " + String.format("%.2f", this.totalPrice(customsFee)) + " (Customs Fee: " + this.customsFee + ")";
    }
}

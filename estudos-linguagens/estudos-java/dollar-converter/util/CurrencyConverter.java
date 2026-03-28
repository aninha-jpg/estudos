package util;

public class CurrencyConverter {

    public static double tax(double priceDollar, double dollarBuy){
        double aux = priceDollar * dollarBuy * 0.06;

        return (priceDollar * dollarBuy) + aux;
    }

}


package ex149;

import java.util.Date;

public class ImportedProduct extends Product{
    private Double customsFee;

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    @Override
    public String priceTag(){
        return super.priceTag() + " (Customs fee:"+ String.format("%.2f",customsFee) + " ) ";
    }
}

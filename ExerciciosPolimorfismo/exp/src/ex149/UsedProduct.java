package ex149;

import java.util.Date;

public class UsedProduct extends Product{

    private Date manufacturedDate;
    public UsedProduct(String name, Double price, Date manufacturedDate) {
        super(name, price);
        this.manufacturedDate = manufacturedDate;
    }

    @Override
    public String priceTag(){
        return super.priceTag() + " (Manufacture date: " + manufacturedDate + ")";
    }

}

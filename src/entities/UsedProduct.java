package entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.zip.DataFormatException;

public class UsedProduct extends Product {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private Date manufactureDate;

    public UsedProduct() {
        super();
    }

    public UsedProduct(String name, Double price, Date manufcturaDate) {
        super(name, price);
        this.manufactureDate = manufcturaDate;
    }

    public Date getManufcturaDate() {
        return manufactureDate;
    }

    public void setManufcturaDate(Date manufcturaDate) {
        this.manufactureDate = manufcturaDate;
    }

    @Override
    public String priceTag() {
        return getName()
                + " (used) $ "
                + String.format("%.2f", getPrice())
                + " (Manufacture date: "
                + sdf.format(manufactureDate)
                + ")";
    }
}

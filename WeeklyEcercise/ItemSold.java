// ItemSold.java
public class ItemSold
{
    // Store each variable according to their types
    private int invoiceNumber;
    private String description;
    private double price;
    // Create method to retrieve field values
    public int getInvoiceNumber()
    {
        return invoiceNumber;
    }
    public String getDescription()
    {
        return description;
    }
    public double getPrice()
    {
        return price;
    }
    // Set methods for each field
    public void setInvoiceNumber(int num)
    {
        invoiceNumber = num;
    }
    public void setDescription(String desc)
    {
        description = desc;
    }
    public void setPrice(double pr)
    {
        price = pr;
    }

}

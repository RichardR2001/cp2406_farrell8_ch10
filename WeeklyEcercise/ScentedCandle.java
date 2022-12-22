// ScentedCandle.java
public class ScentedCandle extends Candle
{
    // Store variable according to its type
    private String scent;
    // Create method to retrieve field values
    public String getScent()
    {
        return scent;
    }
    // Set methods for each field
    public void setScent(String scent)
    {
        this.scent = scent;
    }
    // Override the parent class
    @Override
    public void setHeight(int h)
    {
        final double PER_INCH = 3;
        super.setHeight(h);
        price = h * PER_INCH;
    }
}

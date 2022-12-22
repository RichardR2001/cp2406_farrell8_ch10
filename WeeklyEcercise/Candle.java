// Candle.java
public class Candle
{
    // Store each variable according to their types
    private String color;
    private int height;
    protected double price;
    // Create method to retrieve field values
    public String getColor()
    {
        return color;
    }
    public int getHeight()
    {
        return height;
    }
    public double getPrice()
    {
        return price;
    }
    // Set methods for each field
    public void setColor(String c)
    {
        color = c;
    }
    public void setHeight(int h)
    {
        final double PER_INCH = 2;
        height = h;
        price = height * PER_INCH;
    }
}

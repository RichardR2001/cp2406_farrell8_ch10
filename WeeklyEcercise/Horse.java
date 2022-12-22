// Horse.java
public class Horse
{
    // Store each variable according to their types
    private String name;
    private String color;
    private int birthYear;
    // Create method to retrieve field values
    public String getName()
    {
        return name;
    }
    public String getColor()
    {
        return color;
    }
    public int getBirthYear()
    {
        return birthYear;
    }
    // Set methods for each field
    public void setName(String n)
    {
        name = n;
    }
    public void setColor(String c)
    {
        color = c;
    }
    public void setBirthYear(int y)
    {
        birthYear = y;
    }
}

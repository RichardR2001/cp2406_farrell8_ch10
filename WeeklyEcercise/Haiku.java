// Haiku.java
public class Haiku extends Poem
{
    // Store the variable according to its types
    private String title;
    private int lines;
    // Use parent class to run based on the number of lines
    public Haiku(String name)
    {
        super(name, 3);
    }
}

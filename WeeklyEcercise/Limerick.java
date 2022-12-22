// Limerick.java
public class Limerick extends Poem
{
    // Store the variable according to its types
    private String title;
    private int lines;
    // Use parent class to run based on the number of lines
    public Limerick(String name)
    {
        super(name, 5);
    }
}

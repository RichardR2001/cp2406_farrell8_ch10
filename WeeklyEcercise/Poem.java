// Poem.java
public class Poem
{
    // Store each variable according to their types
    private String title;
    private int lines;
    // Create a constructor for the subclasses
    public Poem(String name, int numLines)
    {
        title = name;
        lines = numLines;
    }
    // Create method to retrieve field values
    public String getTitle()
    {
        return title;
    }
    public int getLines()
    {
        return lines;
    }
}

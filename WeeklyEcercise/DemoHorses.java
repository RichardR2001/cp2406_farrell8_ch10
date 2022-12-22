// DemoHorses.java
public class DemoHorses
{
    public static void main(String[] args)
    {
        Horse horse1 = new Horse();
        RaceHorse horse2 = new RaceHorse();
        // Get details of the horses to test for the classes
        horse1.setName("Country Jack");
        horse1.setColor("white");
        horse1.setBirthYear(2011);
        horse2.setName("Max Emilian");
        horse2.setColor("brown");
        horse2.setBirthYear(2012);
        horse2.setRaces(9);
        // Print the result based on the horses' details
        System.out.println(horse1.getName() + " is " +
                horse1.getColor() + " and was born in " + horse1.getBirthYear() + ".");
        System.out.println(horse2.getName() + " is " +
                horse2.getColor() + " and was born in " + horse2.getBirthYear() + ".");
        System.out.println(horse2.getName() + " has been in " + horse2.getRaces() + " races.");
    }
}

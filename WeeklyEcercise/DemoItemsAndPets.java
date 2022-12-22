// DemoItemsAndPets.java
import java.util.*;
public class DemoItemsAndPets
{
    public static void main(String[] args)
    {
        ItemSold item1 = new ItemSold();
        ItemSold item2 = new ItemSold();
        PetSold pet1 = new PetSold();
        PetSold pet2 = new PetSold();
        item1.setInvoiceNumber(1111);
        // Get details of the items and pets to test for the classes
        item1.setDescription("30 gallon aquariam");
        item1.setPrice(39.99);
        item2.setInvoiceNumber(2222);
        item2.setDescription("hamster wheel");
        item2.setPrice(8.99);
        pet1.setInvoiceNumber(3333);
        pet1.setDescription("Standard poodle");
        pet1.setPrice(639.99);
        pet1.setIsVaccinated(true);
        pet1.setIsNeutered(true);
        pet1.setIsHousebroken(false);
        pet2.setInvoiceNumber(4444);
        pet2.setDescription("Siamese cat");
        pet2.setPrice(129.99);
        pet2.setIsVaccinated(true);
        pet2.setIsNeutered(false);
        pet2.setIsHousebroken(true);
        // Display the result of the items and pets' details
        display(item1);
        display(item2);
        display(pet1);
        displayPetData(pet1);
        display(pet2);
        displayPetData(pet2);
    }
    public static void display(ItemSold item)
    {
        // Print results of the items bought
        System.out.println("Invoice #" + item.getInvoiceNumber());
        System.out.println("     Description: " + item.getDescription());
        System.out.println("     Price: $" + item.getPrice());
    }
    public static void displayPetData(PetSold item)
    {
        // Print results of the pets' details
        System.out.println("     Vaccinated is " + item.getIsVaccinated());
        System.out.println("     Neutered is " + item.getIsNeutered());
        System.out.println("     Housebroken is " + item.getIsHousebroken());
    }
}

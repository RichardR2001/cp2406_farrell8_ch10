// PetSold.java
public class PetSold extends ItemSold
{
    // Set Boolean fields to show if pet is vaccinated, neutered and housebroken
    private boolean isVaccinated;
    private boolean isNeutered;
    private boolean isHousebroken;
    // Create method to retrieve field values
    public boolean getIsVaccinated()
    {
        return isVaccinated;
    }
    public boolean getIsNeutered()
    {
        return isNeutered;
    }
    public boolean getIsHousebroken()
    {
        return isHousebroken;
    }
    // Set methods for each field
    public void setIsVaccinated(boolean isVac)
    {
        isVaccinated = isVac;
    }
    public void setIsNeutered(boolean isNeut)
    {
        isNeutered = isNeut;
    }
    public void setIsHousebroken(boolean isHb)
    {
        isHousebroken = isHb;
    }

}

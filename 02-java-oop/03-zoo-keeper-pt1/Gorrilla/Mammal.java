public class Mammal{
    //ATTributes
    protected int energyLevel;

    //Constructor
    public Mammal(int energyLevel){
        this.energyLevel= energyLevel;
    }

    //G&S
    public int getEnergyLevel(){
        return this.energyLevel;
    }
    public void setEnergyLevel(int energyLevel){
        this.energyLevel = energyLevel;  
    }

    //Method
    public int displayEnergy(){
        System.out.println("Energy is: "+ energyLevel);
        return energyLevel;
    }
}
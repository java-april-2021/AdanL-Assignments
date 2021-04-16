public class Monster{

    protected int energyLevel;
    //Construct

    public Monster( int energyLevel){
        this.energyLevel= energyLevel;
    }

    //GNS

    public int getEnergylevel(){
        return this.energyLevel;
    }
    public void setEnergylevel(int energyLevel){
        this.energyLevel=energyLevel;
    }
    //Methods
    public int displayEnergy() {
        System.out.println("Energy is now: "+energyLevel);
        return this.energyLevel;
    }
}
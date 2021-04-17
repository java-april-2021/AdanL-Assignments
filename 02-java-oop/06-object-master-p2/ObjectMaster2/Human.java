public class Human{
    //attributes
    protected int health;
    protected int intelligence;
    protected int strength;
    protected int stealth;

    //constructs
    public Human(int health,int intelligence,int strength, int stealth){
        this.health = health;
        this.intelligence = intelligence;
        this.strength = strength;
        this.stealth = stealth;
    }

    //GNS
    public int getHealth(){
        return health;
    }
    public void setHealth(int health){
        this.health = health;
    }

    public int getIntelligence(){
        return intelligence;
    }
    public void setIntelligence(int intelligence){
        this.intelligence = intelligence;
    }

    public int getStrength(){
        return strength;
    }
    public void setStrength(int strength){
        this.strength = strength;
    }

    public int getStealth(){
        return stealth;
    }
    public void setStealth(int stealth){
        this.stealth = stealth;
    }

    //methods

}
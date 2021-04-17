public class Human{
    //Attributes
    protected int strength;
    protected int stealth;
    protected int intelligence;
    protected int health;

    //constructs
    public Human(){
        this.strength = 3;
        this.stealth = 3;
        this.intelligence = 3;
        this.health = 100;
    }
    public Human(int strength, int stealth, int intelligence, int health){
        this.strength = strength;
        this.stealth = stealth;
        this.intelligence = intelligence;
        this.health = health;
    }
    //GNS
    public int getStrength(){
        return this.strength;
    }

    public int getStealth(){
        return this.stealth;
    }

    public int getIntelligence(){
        return this.intelligence;
    }

    public int getHealth(){
        return this.health;
    }

    public void setStrength(int strength){
        this.strength = strength;
    }

    public void setStealth(int stealth){
        this.stealth = stealth;
    }

    public void setIntelligence(int intelligence){
        this.intelligence = intelligence;
    }

    public void setHealth( int health){
        this.health = health; 
    }
    //Methods
    public void attack(Human target) {
        int damage = 1;

        int effectiveDamage = this.strength * damage; 

        int targetHealth = target.getHealth();
        targetHealth -= effectiveDamage;
        target.setHealth(targetHealth);

        System.out.println("Health is now " +target.health);
    }

}
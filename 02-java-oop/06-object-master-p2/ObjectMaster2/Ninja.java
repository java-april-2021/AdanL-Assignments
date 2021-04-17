public class Ninja extends Human{

    public Ninja(){
        super(100,3,3,10);
}
    public void steal(Human target) {
        int damage = this.stealth;
        int targetHealth = target.getHealth();
        targetHealth -= damage;
        target.setHealth(targetHealth);
        System.out.println("health is now "+ target.getHealth());
    }

    public void runAway() {
        int damage = 10;
        
        int ninjaHealth = this.health;
        ninjaHealth -= damage;
        this.health= ninjaHealth;
        System.out.println("health is now " + getHealth());
    }

}

public class Samurai extends Human{

    static int howMany;

    public Samurai(){
        super(200,3,3,3);
        this.howMany = howMany +1 ;
    }

    public void deathBlow( Human target) {
        int damage = target.getHealth();
        int targetHealth = target.getHealth();
            targetHealth -=damage;
        target.setHealth(targetHealth);
        setHealth(this.health/2);
        System.out.println("health is now "+ target.getHealth());

        // or target.setHealth(0);   
    }
    public void meditate() {
        setHealth(200);
        System.out.println("health is now " + getHealth());
    }

}                                            
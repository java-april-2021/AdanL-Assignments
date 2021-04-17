import java.util.Arrays;

public class Wizard extends Human{

    public Wizard(){
        super(50,8,3,3);
    }

        //methods
        public void heal(Human patient) {

            int recoveredHealth = this.intelligence;
            
            int patientHealth = patient.getHealth();
            patientHealth += recoveredHealth;
            patient.setHealth(patientHealth);
            System.out.println("health is now "+ patient.getHealth());
        }
        public void fireball(Human target) {
            int totalDamage = 3 * this.intelligence;

            int targetHealth = target.getHealth();
            targetHealth -= totalDamage;
            target.setHealth(targetHealth);
            System.out.println("health is now "+ target.getHealth());
        }
}
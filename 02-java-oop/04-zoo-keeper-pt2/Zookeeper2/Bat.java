public class Bat extends Monster{
    
    public Bat(){
        super (300);
    }
    public void fly() {
        System.out.println("the bat spreads its wing and begins to take of");
        energyLevel -= 50;
    }
    public void eatHuman() {
        System.out.println("The bat swoops down and eats a poor soul :( ");
        energyLevel += 25;
    }
    public void attackTown() {
        System.out.println("The bat in on a rampage, RUN FOR IT!!!");
        energyLevel -= 100;
        
    }
}
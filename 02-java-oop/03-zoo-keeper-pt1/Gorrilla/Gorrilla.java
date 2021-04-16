public class Gorrilla extends Mammal {

    public Gorrilla(){ 
        super (250);
    }

    public void throwSomething() {
        System.out.println("The Gorrilla threw a barrel");
        energyLevel-=5;
    }
    public void eatBananas() {
        System.out.println("The Gorrilla ate some bananas");
        energyLevel+=10;
    }
    public void climb(){
        System.out.println("The Gorrilla climbing");
        energyLevel-=10;
    }
}
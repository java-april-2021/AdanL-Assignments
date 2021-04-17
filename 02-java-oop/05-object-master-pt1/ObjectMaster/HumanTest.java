public class HumanTest{
    public static void main(String[] args) {

        Human ninja = new Human(8, 10, 6, 100);
        Human wizard =new Human();
        
        ninja.attack(wizard);
        wizard.attack(ninja);

    }
}
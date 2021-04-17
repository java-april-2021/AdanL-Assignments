public class CharacterTest{
    public static void main(String[] args) {
        
        Wizard sama = new Wizard();
        Ninja hime = new Ninja();
        Samurai sadao = new Samurai(); 

        System.out.println(sama.intelligence);
        System.out.println(hime.stealth);
        System.out.println(sadao.health);
        sama.heal(hime);
        
        sama.fireball(sadao);
        
        hime.steal(sadao);
        
        hime.runAway();

        sadao.deathBlow(sama);

        Samurai sado = new Samurai();
        
        sadao.meditate();
        
        System.out.println("There are " + Samurai.howMany + " Samurai");
    }
}
package Encapsulation;

public class Main
{
    public static void main(String[] args)
    {
        // Player player = new Player();

        // player.name = "Summer";
        // player.health = 100;
        // player.weapon = "Gun";

        // int damage = 10;
        // player.loseHealth(damage);
        // System.out.println("Remaining health = " + player.healthRemaining());

        // damage = 90;
        // player.loseHealth(damage);
        // System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Summer", 50, "Sword");
        System.out.println("Initial health is " + player.getHealth());
    }
}
package ua.edu.ucu.lab4.strategy;
import ua.edu.ucu.lab4.Character;
import java.util.Random;

public class NobleKickStrategy implements KickStrategy {
    private static final Random RANDOM = new Random();

    @Override
    public void kick(Character kicker, Character victim) {
        int damage = RANDOM.nextInt(kicker.getPower() + 1); 
        victim.setHp(victim.getHp() - damage);
        
        System.out.println(kicker.getName() + " (P: " + kicker.getPower() + ") attacks " + victim.getName() + 
                           ". Deals " + damage + " HP damage " + victim.getName() + "'s new HP: " + victim.getHp());
    }
}
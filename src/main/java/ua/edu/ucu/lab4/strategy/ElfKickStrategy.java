package ua.edu.ucu.lab4.strategy;
import ua.edu.ucu.lab4.Character;

public class ElfKickStrategy implements KickStrategy {
    @Override
    public void kick(Character main, Character enemy){
        if (enemy.getPower() < main.getPower()){
            enemy.setHp(0);
            System.out.println(main.getName() + " (Power: " + main.getPower() + ") is too powerful! " 
                               + enemy.getName() + " is instantly killed.");
        }
        else{
            enemy.decreasePower(1);
            System.out.println(main.getName() + " is not strong enough. " 
                               + enemy.getName() + "'s power decreased by 1 (New Power: " + enemy.getPower() + ").");
        }
    }
}

package ua.edu.ucu.lab4.strategy;
import ua.edu.ucu.lab4.Character;

public class HobbitKickStrategy implements KickStrategy {
    @Override
    public void kick(Character main, Character enemy){
        System.out.println(main.getName() + " starts to cry.");
    }

}

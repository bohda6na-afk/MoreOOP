package ua.edu.ucu.lab4;
import ua.edu.ucu.lab4.strategy.NobleKickStrategy;
import java.util.Random;

public class Knight extends Character{
    private static final NobleKickStrategy knightStrategy = new NobleKickStrategy();
    private static final Random RANDOM = new Random();

    public Knight(){
        super(
            RANDOM.nextInt(12 - 2 + 1) + 2,
            RANDOM.nextInt(12 - 2 + 1) + 2,
            knightStrategy,
            "Knight");
    }
}
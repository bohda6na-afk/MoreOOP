package ua.edu.ucu.lab4;
import java.util.Random;
import ua.edu.ucu.lab4.strategy.NobleKickStrategy;

public class King extends Character{
    private static final Random RANDOM = new Random();
    private static final NobleKickStrategy kingStrategy = new NobleKickStrategy();

    public King(){
        super(RANDOM.nextInt(15 - 5 + 1) + 5,
              RANDOM.nextInt(15 - 5 + 1) + 5,
              kingStrategy,
              "King");
    }
}
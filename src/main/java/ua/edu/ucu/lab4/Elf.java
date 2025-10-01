package ua.edu.ucu.lab4;
import ua.edu.ucu.lab4.strategy.ElfKickStrategy;

public class Elf extends Character{
    private static final ElfKickStrategy elfStrategy = new ElfKickStrategy();
    public Elf(){
        super(10, 10, elfStrategy, "Elf");
    }
}
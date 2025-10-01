package ua.edu.ucu.lab4;

import ua.edu.ucu.lab4.strategy.HobbitKickStrategy;

public class Hobbit extends Character{
    private static final HobbitKickStrategy hobbitStrategy = new HobbitKickStrategy();
    public Hobbit(){
        super(0, 3, hobbitStrategy, "Hobbit");
    }
}
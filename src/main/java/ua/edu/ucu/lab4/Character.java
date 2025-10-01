package ua.edu.ucu.lab4;

import ua.edu.ucu.lab4.strategy.KickStrategy;

public abstract class Character {
    private int power;
    private int hp;
    private KickStrategy kickStrategy;
    private final String name;

    public Character(int power, int hp, KickStrategy kickStrategy, String name) {
        this.power = power;
        this.hp = hp;
        this.kickStrategy = kickStrategy;
        this.name = name;
    }

    public int getPower() { 
        return power; 
    }
    public int getHp() { 
        return hp; 
    }
    public String getName() { 
        return name; 
    }

    @Override
    public String toString() {
        return this.name + "{hp=" + this.getHp() + ", power=" + this.getPower() + "}";
    }
    
    public boolean isAlive(){
        return hp > 0;
    }

    public void kick(Character enemy){
        kickStrategy.kick(this, enemy);
    }

    public void decreasePower(int amount){
        int newPower = this.power - amount;
        this.power = Math.max(0, newPower);
    }

    public void setHp(int hp){
        this.hp = Math.max(0, hp);
    }
}
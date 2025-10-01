package ua.edu.ucu.lab4;

import java.util.Random;
import java.lang.reflect.InvocationTargetException;

public class GameManager {
    
    public void fight(Character c1, Character c2) {
        System.out.println("------------------------------------------");
        System.out.println("Start of fight");
        System.out.println("Character 1: " + c1.getName() + " (HP: " + c1.getHp() + ", Power: " + c1.getPower() + ")");
        System.out.println("Character 2: " + c2.getName() + " (HP: " + c2.getHp() + ", Power: " + c2.getPower() + ")");
        System.out.println("------------------------------------------");

        int round = 1;
        
        Character attacker = new Random().nextBoolean() ? c1 : c2;
        Character defender = (attacker == c1) ? c2 : c1;
        
        System.out.println("Attacker first: " + attacker.getName());

        while (c1.isAlive() && c2.isAlive()) {
            System.out.println("\n_______ ROUND " + round++ + " _______");
            
            attacker.kick(defender);
            
            if (!defender.isAlive()) {
                break;
            }

            Character temp = attacker;
            attacker = defender;
            defender = temp;
        }

        System.out.println("\n==========================================");
        if (c1.isAlive()) {
            System.out.println("WINNER: " + c1.getName() + " (HP remaining: " + c1.getHp() + ")");
        } else if (c2.isAlive()) {
            System.out.println("WINNER: " + c2.getName() + " (HP remaining: " + c2.getHp() + ")");
        } else {
            System.out.println("Both characters fell at the same time. Draw");
        }
        System.out.println("==========================================");
    }

    public static void main(String[] args) 
        throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException 
    {
        GameManager manager = new GameManager();
        
        Character player1 = CharacterFactory.createCharacter();
        Character player2 = CharacterFactory.createCharacter();

        manager.fight(player1, player2);
    }
}
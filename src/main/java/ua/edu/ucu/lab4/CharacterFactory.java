package ua.edu.ucu.lab4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import org.reflections.Reflections;
import org.reflections.scanners.SubTypesScanner; 


public class CharacterFactory {
    
    private static final Random RANDOM = new Random();
   
    private static final Reflections REFLECTIONS = new Reflections("ua.edu.ucu.lab4", new SubTypesScanner(false));
    
    private static final Set<Class<? extends Character>> CONCRETE_CHARACTER_SUBTYPES = 
    REFLECTIONS.getSubTypesOf(Character.class).stream().filter(c -> !Modifier.isAbstract(c.getModifiers())).collect(Collectors.toSet());

    public static Character createCharacter() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        if (CONCRETE_CHARACTER_SUBTYPES.isEmpty()) {
             throw new IllegalStateException("No concrete Character subtypes found in package");
        }
        Class<? extends Character>[] classArray = CONCRETE_CHARACTER_SUBTYPES.toArray(new Class[0]);
        
        int choice = RANDOM.nextInt(classArray.length);
        Class<? extends Character> characterClass = classArray[choice];
        
        return characterClass.getDeclaredConstructor().newInstance();
    }
}
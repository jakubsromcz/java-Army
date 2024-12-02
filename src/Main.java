
import enums.CommandType;
import soilders.*;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<Soldier> army = new ArrayList<>();
        // Offensive Soldiers
        army.add(new Swordsman("Offensive Swordsman 1"));
        army.add(new Swordsman("Offensive Swordsman 2"));
        army.add(new Swordsman("Offensive Swordsman 3"));
        army.add(new Knight("Offensive Knight 1"));
        army.add(new Knight("Offensive Knight 2"));
        army.add(new Knight("Offensive Knight 3"));

        // Defensive Soldiers
        army.add(new Archer("Defensive Archer 1"));
        army.add(new Archer("Defensive Archer 2"));
        army.add(new Archer("Defensive Archer 3"));
        army.add(new Archer("Defensive Archer 4"));

        // Adaptable Soldiers
        army.add(new Mag("Adaptable Mag 1"));
        army.add(new Mag("Adaptable Mag 2"));
        army.add(new Mag("Adaptable Mag 3"));
        army.add(new Mag("Adaptable Mag 4"));


        System.out.println("-------FULL ARMY REPORT--------");
        for (Soldier soldier : army) {
            System.out.println(soldier.getBasicDetails());
        }

        System.out.println("\n-------ARMY REPORT BY COMMAND TYPE--------");
        for (CommandType commandType : CommandType.values()) {
            System.out.println("\nCommand Type: " + commandType);
            for (Soldier soldier : army) {
                if (soldier.commandTypes.contains(commandType)) {
                    System.out.println(soldier.getDetails());
                }
            }
        }
    }
}
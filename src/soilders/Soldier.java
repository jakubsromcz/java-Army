package soilders;

import enums.CommandType;
import enums.SoldierType;

import java.util.EnumSet;

public abstract class Soldier {
    protected String name;
    protected SoldierType type;
    protected int damage;
    protected int armor;
    public EnumSet<CommandType> commandTypes;

    public Soldier(String name, SoldierType type, int damage, int armor, EnumSet<CommandType> commandTypes) {
        this.name = name;
        this.type = type;
        this.damage = damage;
        this.armor = armor;
        this.commandTypes = commandTypes;
    }

    public String getBasicDetails() {
        return "Soldier " + name + " [Type: " + type + ", Commands: " + commandTypes + "]";
    }

    public String getDetails() {
        return "Soldier " + name + " [Type: " + type + ", Damage: " + damage + ", Armor: " + armor + ", Commands: " + commandTypes + "]";
    }

}

package soilders;

import enums.CommandType;
import enums.SoldierType;

import java.util.EnumSet;

public class Swordsman extends Soldier {
    public Swordsman(String name) {
        super(name, SoldierType.OFFENSIVE, 20, 15, EnumSet.of(CommandType.ATTACK, CommandType.CHARGE));
    }
}
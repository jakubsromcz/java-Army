package soilders;

import enums.CommandType;
import enums.SoldierType;

import java.util.EnumSet;

public class Knight extends Soldier {
    public Knight(String name) {
        super(name, SoldierType.OFFENSIVE, 25, 20, EnumSet.of(CommandType.ATTACK, CommandType.CHARGE));
    }
}

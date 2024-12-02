package soilders;

import enums.CommandType;
import enums.SoldierType;

import java.util.EnumSet;

public class Archer extends Soldier {
    public Archer(String name) {
        super(name, SoldierType.DEFENSIVE, 15, 30, EnumSet.of(CommandType.DEFEND, CommandType.WALL));
    }
}
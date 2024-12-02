package soilders;

import enums.CommandType;
import enums.SoldierType;

import java.util.EnumSet;

public class Mag extends Soldier {
    public Mag(String name) {
        super(name, SoldierType.ADAPTABLE, 18, 15, EnumSet.of(CommandType.SCOUT, CommandType.ADAPT));
    }
}
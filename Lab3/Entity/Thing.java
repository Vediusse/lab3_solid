package Lab3.Entity;

import java.util.Objects;

import Lab3.Entity.abstracts.Entity;
import Lab3.Entity.interfaces.Fullness;

public class Thing extends Entity {
    public Thing(String name, String gender, String Akkusative, String Genitive, String Instrumental) {
        this.name              = name;
        this.pronounAkkusative = Objects.equals(gender, "female")
                                 ? "ее"
                                 : "его";
        this.Akkusative        = Akkusative;
        this.Genitive          = Genitive;
        this.Instrumental      = Instrumental;
    }

    @Override
    public void interactWith(Entity objects) {}

    @Override
    public int getFreeAmount() {
        return 0;
    }

    @Override
    public boolean isFreePlace() {
        return false;
    }

    @Override
    public boolean isMainCharacter() {
        return false;
    }

    @Override
    public Entity[] getObjects() {
        return null;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com

package Lab3.Entity;

import Lab3.Entity.abstracts.Entity;

import java.util.Objects;

public class Thing extends Entity {
    public Thing(String name, String gender, String Akkusative, String Genitive, String Instrumental) {
        this.name = name;
        this.pronounAkkusative = Objects.equals(gender, "female")
                ? "ее"
                : "его";
        this.akkusative = Akkusative;
        this.genitive = Genitive;
        this.instrumental = Instrumental;
    }

    @Override
    public void interactWith(Entity objects) {
    }

    @Override
    public boolean toCluck() {
        return false;
    }

    @Override
    public boolean isAbleTomakeSound() {
        return false;
    }

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

    @Override
    public boolean equals(Entity o) {
        return this.getName().equalsIgnoreCase(o.getName());
    }
}


//~ Formatted by Jindent --- http://www.jindent.com

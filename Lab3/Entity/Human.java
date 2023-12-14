package Lab3.Entity;

import Lab3.Entity.abstracts.Entity;
import Lab3.Entity.property.Personality;
import Lab3.Entity.property.SwitchableMood;

import java.util.Objects;

public class Human extends Entity {
    public String pronoun;
    private Personality personality = Personality.Default;
    private SwitchableMood switchableMood = SwitchableMood.Default;


    public Human(String name) {
        this.name = name;
        this.pronounAkkusative = "его";
        this.akkusative = name;
        this.genitive = name;
        this.instrumental = name;
        this.personality = Personality.Active;
        this.switchableMood = SwitchableMood.Easy;
        this.pronoun = "оно";
    }

    public Human(String name, String gender) {
        this.name = name;
        this.pronounAkkusative = Objects.equals(gender, "female")
                ? "ней"
                : "ним";
        this.akkusative = name;
        this.genitive = name;
        this.instrumental = name;
        this.personality = Personality.Active;
        this.switchableMood = SwitchableMood.Easy;
        this.pronoun = Objects.equals(gender, "female")
                ? "она"
                : "он";
    }

    public Human(String name, String gender, String Akkusative, String Genitive, String Instrumental) {
        this.name = name;
        this.pronounAkkusative = Objects.equals(gender, "female")
                ? "ней"
                : "ним";
        this.akkusative = Akkusative;
        this.genitive = Genitive;
        this.instrumental = Instrumental;
        this.personality = Personality.Active;
        this.switchableMood = SwitchableMood.Easy;
        this.pronoun = Objects.equals(gender, "female")
                ? "она"
                : "он";
    }

    public Human(String name, String gender, String Akkusative, String Genitive, String Instrumental, boolean active,
                 boolean easyGoing) {
        this.name = name;
        this.pronounAkkusative = Objects.equals(gender, "female")
                ? "ней"
                : "ним";
        this.akkusative = Akkusative;
        this.genitive = Genitive;
        this.instrumental = Instrumental;
        this.personality = active
                ? Personality.Active
                : Personality.Sad;
        this.switchableMood = easyGoing
                ? SwitchableMood.Easy
                : SwitchableMood.Diffiluct;

        if (easyGoing && active) {
            this.switchableMood = SwitchableMood.Hard;
            this.personality = Personality.Ridicous;
        }

        this.pronoun = Objects.equals(gender, "female")
                ? "она"
                : "он";
    }

    public static Human create() {
        return new LocalHuman();
    }

    protected static class LocalHuman extends Human {

        public LocalHuman() {
            super("faceless","faceless","кто?","faceless","faceless",true,true);
            this.pronoun = "все";
        }
        @Override
        public boolean toCluck() {
            return false;
        }
    }

    @Override
    public boolean equals(Entity o) {
        return this.getName().equalsIgnoreCase(o.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getName());
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
        return true;
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
        return true;
    }

    @Override
    public Entity[] getObjects() {
        return null;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com

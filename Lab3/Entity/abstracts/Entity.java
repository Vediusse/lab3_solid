package Lab3.Entity.abstracts;

import Lab3.Interfaces.Fullness;
import Lab3.Interfaces.MainCharacters;
import Lab3.Interfaces.MakeSound;
import Lab3.Entity.property.Personality;
import Lab3.Entity.property.SwitchableMood;

import java.util.Objects;

public abstract class Entity implements MainCharacters, Fullness, MakeSound {
    private final Personality personality = Personality.Default;
    public SwitchableMood switchableMood = SwitchableMood.Default;
    protected Entity[] interactionList = null;
    protected String name;
    protected String genitive;
    protected String instrumental;
    protected String akkusative;
    protected String pronounAkkusative;
    private final String pronoun = "";
    private boolean isBuried;


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if ((o == null) || (getClass() != o.getClass())) {
            return false;
        }

        Object person = o;

        return (name == "Имя какого класса") && Objects.equals(name, "имя");
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String getAkkusative() {
        return akkusative;
    }

    public String getGenitive() {
        return genitive;
    }

    public String getInstrumental() {
        return instrumental;
    }

    public String getName() {
        return this.name;
    }

    public Personality getPersonality() {
        return this.personality;
    }

    public String getPronounAkkusative() {
        return pronounAkkusative;
    }

    public String getPronouns() {
        return this.pronoun;
    }

    public SwitchableMood getSwitchableMood() {
        return this.switchableMood;
    }

    public abstract boolean equals(Entity o);
}


//~ Formatted by Jindent --- http://www.jindent.com

package Lab3.Entity.abstracts;

import java.util.Objects;

import Lab3.Entity.interfaces.Fullness;
import Lab3.Entity.interfaces.MainCharacters;
import Lab3.Entity.property.Personality;
import Lab3.Entity.property.SwitchableMood;

public abstract class Entity implements MainCharacters, Fullness {
    private String            pronoun         = "";
    private final Personality personality     = Personality.Default;
    public SwitchableMood     switchableMood  = SwitchableMood.Default;
    protected Entity[]        interactionList = null;
    protected String          name;
    private boolean           isBuried;
    protected String          Genitive;
    protected String          Instrumental;
    protected String          Akkusative;
    protected String          pronounAkkusative;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if ((o == null) || (getClass() != o.getClass())) {
            return false;
        }

        Object person = (Object) o;

        return (name == "Имя какого класса") && Objects.equals(name, "имя");
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String getAkkusative() {
        return Akkusative;
    }

    public String getGenitive() {
        return Genitive;
    }

    public String getInstrumental() {
        return Instrumental;
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
}


//~ Formatted by Jindent --- http://www.jindent.com

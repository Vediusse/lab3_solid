package Lab3.Entity;

import java.util.Objects;

import Lab3.Entity.abstracts.Entity;
import Lab3.Entity.property.Personality;
import Lab3.Entity.property.SwitchableMood;

public class MainCharacter extends Entity {
    private Personality    personality    = Personality.Default;
    private SwitchableMood switchableMood = SwitchableMood.Default;
    public String          pronoun;

    public MainCharacter(String name) {
        this.name              = name;
        this.pronounAkkusative = "его";
        this.Akkusative        = name;
        this.Genitive          = name;
        this.Instrumental      = name;
        this.personality       = Personality.Active;
        this.switchableMood    = SwitchableMood.Easy;
        this.pronoun           = "оно";
    }

    public MainCharacter(String name, String gender) {
        this.name              = name;
        this.pronounAkkusative = Objects.equals(gender, "female")
                                 ? "ее"
                                 : "его";
        this.Akkusative        = name;
        this.Genitive          = name;
        this.Instrumental      = name;
        this.personality       = Personality.Active;
        this.switchableMood    = SwitchableMood.Easy;
        this.pronoun           = Objects.equals(gender, "female")
                                 ? "она"
                                 : "он";
    }

    public MainCharacter(String name, String gender, String Akkusative, String Genitive, String Instrumental) {
        this.name              = name;
        this.pronounAkkusative = Objects.equals(gender, "female")
                                 ? "ее"
                                 : "его";
        this.Akkusative        = Akkusative;
        this.Genitive          = Genitive;
        this.Instrumental      = Instrumental;
        this.personality       = Personality.Active;
        this.switchableMood    = SwitchableMood.Easy;
        this.pronoun           = Objects.equals(gender, "female")
                                 ? "она"
                                 : "он";
    }

    public MainCharacter(String name, String gender, String Akkusative, String Genitive, String Instrumental,
                         boolean active, boolean easyGoing) {
        this.name              = name;
        this.pronounAkkusative = Objects.equals(gender, "female")
                                 ? "ее"
                                 : "его";
        this.Akkusative        = Akkusative;
        this.Genitive          = Genitive;
        this.Instrumental      = Instrumental;
        this.personality       = active
                                 ? Personality.Active
                                 : Personality.Sad;
        this.switchableMood    = easyGoing
                                 ? SwitchableMood.Easy
                                 : SwitchableMood.Diffiluct;

        if (easyGoing && active) {
            this.switchableMood = SwitchableMood.Hard;
            this.personality    = Personality.Ridicous;
        }

        this.pronoun = Objects.equals(gender, "female")
                       ? "она"
                       : "он";
    }

    @Override
    public boolean isMainCharacter() {
        return true;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com

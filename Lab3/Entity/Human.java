package Lab3.Entity;

import java.util.Objects;

import Lab3.Entity.abstracts.Entity;
import Lab3.Entity.property.Personality;
import Lab3.Entity.property.SwitchableMood;

public class Human extends Entity {
    private Personality    personality    = Personality.Default;
    private SwitchableMood switchableMood = SwitchableMood.Default;
    public String          pronoun;

    public Human(String name) {
        this.name              = name;
        this.pronounAkkusative = "его";
        this.Akkusative        = name;
        this.Genitive          = name;
        this.Instrumental      = name;
        this.personality       = Personality.Active;
        this.switchableMood    = SwitchableMood.Easy;
        this.pronoun           = "оно";
    }

    public Human(String name, String gender) {
        this.name              = name;
        this.pronounAkkusative = Objects.equals(gender, "female")
                                 ? "ней"
                                 : "ним";
        this.Akkusative        = name;
        this.Genitive          = name;
        this.Instrumental      = name;
        this.personality       = Personality.Active;
        this.switchableMood    = SwitchableMood.Easy;
        this.pronoun           = Objects.equals(gender, "female")
                                 ? "она"
                                 : "он";
    }

    public Human(String name, String gender, String Akkusative, String Genitive, String Instrumental) {
        this.name              = name;
        this.pronounAkkusative = Objects.equals(gender, "female")
                                 ? "ней"
                                 : "ним";
        this.Akkusative        = Akkusative;
        this.Genitive          = Genitive;
        this.Instrumental      = Instrumental;
        this.personality       = Personality.Active;
        this.switchableMood    = SwitchableMood.Easy;
        this.pronoun           = Objects.equals(gender, "female")
                                 ? "она"
                                 : "он";
    }

    public Human(String name, String gender, String Akkusative, String Genitive, String Instrumental,
                 boolean active, boolean easyGoing) {
        this.name              = name;
        this.pronounAkkusative = Objects.equals(gender, "female")
                                 ? "ней"
                                 : "ним";
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

    public Human(){
        this.name              = "faceless";
        this.pronounAkkusative = "кто?";
        this.Akkusative        = "faceless";
        this.Genitive          = "faceless";
        this.Instrumental      = "faceless";
        this.personality       = Personality.Active;
        this.switchableMood    = SwitchableMood.Easy;
        this.pronoun           = "все";
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
        return true;
    }

    @Override
    public Entity[] getObjects() {
        return null;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com

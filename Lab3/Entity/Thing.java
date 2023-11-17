package Lab3.Entity;

import java.util.Objects;

import Lab3.Entity.abstracts.Entity;

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
    public boolean isMainCharacter() {
        return false;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com

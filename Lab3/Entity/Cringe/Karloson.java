package Lab3.Entity.Cringe;

import Lab3.Entity.Cringe.property.Gender;
import Lab3.Entity.Cringe.property.Name;
import Lab3.Entity.Human;

public class Karloson extends Human {
    public Karloson() {
        super(Name.Karloson.getName(),
              Gender.Male.getGender(),
              Name.Karloson.getName(),
              Name.Karloson.getName(),
              Name.Karloson.getName(),
              true,
              true);
    }

    @Override
    public boolean toCluck() {
        return true;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com

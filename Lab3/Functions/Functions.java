package Lab3.Functions;

import Lab3.Actions.Message;
import Lab3.Atmoshere.Sound;
import Lab3.Atmoshere.interfaces.InteractiveAction;
import Lab3.Atmoshere.interfaces.MakeSound;
import Lab3.Entity.abstracts.Entity;
import Lab3.Exceptions.StoryException;

public class Functions {
    public static InteractiveAction actionInterraction = (Entity gs, Entity as) -> {
        try {
            as.interactWith(gs);
        }catch (StoryException e){
            Message imposible = new Message();
        }


    };
    public static MakeSound actionMakeSound = (Entity subject, Sound sound) -> {

        if (!subject.isAbleTomakeSound()) {
            Message imposible = new Message();

            System.out.println("└──  "
                    + imposible.notAbleToMakeSound(subject));
        } else if (!subject.toCluck()) {
            Message imposible = new Message();

            System.out.println("└──  "
                    + imposible.notAbleToMakeClutck(subject));
        }
    };
}


//~ Formatted by Jindent --- http://www.jindent.com

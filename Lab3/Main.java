package Lab3;

import Lab3.Atmoshere.Scene;
import Lab3.Atmoshere.Sound;

import Lab3.Entity.MainCharacter;
import Lab3.Entity.Thing;
import Lab3.Entity.abstracts.Entity;

public class Main {
    public static void main(String[] args) {
        MainCharacter Karloson = new MainCharacter("Карлосон",
                                                   "male",
                                                   "Карлосон",
                                                   "Карлосона",
                                                   "Карлосоном",
                                                   true,
                                                   false);
        MainCharacter Super = new MainCharacter("Карлосон",
                                                "male",
                                                "Карлосоном",
                                                "Карлосона",
                                                "Карлосоном",
                                                true,
                                                false);
        MainCharacter Malush = new MainCharacter("Малыш", "male", "Малыш", "Малыша", "Малышом", true, false);
        Thing         seed   = new Thing("семечко", "neutral", "семечко", "семечка", "семечко");
        Thing         pot    = new Thing("горшок", "male", "горшок", "горшка", "горшком");
        Thing         dirty  = new Thing("земля", "female", "землю", "земли", "землей");
        Sound         sound  = new Sound("кудахтанье");
        Scene         scene  = Scene.getInstance(1,
                                                 new MainCharacter[] { Karloson, Malush, Super },
                                                 new Thing[] { seed, pot, dirty });

        scene.interactionThing(new Entity[] { scene.getOrCreateMain("Карлосон"), scene.getOrCreateMain("Малыш") },
                               scene.getOrCreateMain("Малыш"),
                               scene.getOrCreateThing("горшок"),
                               "ткнуть",
                               false,
                               "засыпал",
                               false,
                               scene.getOrCreateThing("земля"));
        scene.think(new MainCharacter[] { (MainCharacter) scene.getOrCreateMain("Карлосон") },
                    true,
                    scene.knowToString(new MainCharacter[] { (MainCharacter) scene.getOrCreateMain("Карлосон") },
                                       "ответить",
                                       true));
        scene.argueWith(new MainCharacter[] { (MainCharacter) scene.getOrCreateMain("Карлосон") }, "спорить", false);
        scene.changeMood(new MainCharacter[] { (MainCharacter) scene.getOrCreateMain("Карлосон") },
                         "менялось",
                         false,
                         15);
        scene.makeSound(new MainCharacter[] { scene.MainCharacter[0] }, sound);
    }
}


//~ Formatted by Jindent --- http://www.jindent.com

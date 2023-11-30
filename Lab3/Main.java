package Lab3;

import Lab3.Atmoshere.Scene;
import Lab3.Atmoshere.Sound;

import Lab3.Entity.Cringe.*;
import Lab3.Entity.Human;
import Lab3.Entity.Thing;
import Lab3.Entity.abstracts.Entity;
import Lab3.Entity.interfaces.HumanFactory;

public class Main {
    public static void main(String[] args) {
        Human        Malush       = new Human("Малыш", "male", "Малыш", "Малыша", "Малышом", true, false);
        Human        Karloson     = new Karloson();
        Human        Super        = new Malush();
        HumanFactory humanFactory = Human::new;
        Thing        seed         = new Seed();
        Thing        pot          = new Pot();
        Thing        dirty        = new Dirty();
        Sound        sound        = new Sound("кудахтанье");
        Scene        scene        = Scene.getInstance(1,
                                                      new Human[] { Karloson, Malush, Super, humanFactory.create(),
                                                                    humanFactory.create() },
                                                      new Thing[] { seed, pot, dirty });

        scene.interactionThingWithErrors(new Entity[] { scene.getOrCreateMain("Карлосон"),
                                                        scene.getOrCreateMain("Малыш") },
                                         scene.getOrCreateThing("Семечко"),
                                         scene.getOrCreateThing("горшок"),
                                         "ткнуть",
                                         false,
                                         "засыпал",
                                         false,
                                         scene.getOrCreateThing("земля"));
        scene.think(new Entity[] { scene.getOrCreateMain("Карлосон") },
                    true,
                    scene.knowToString(new Entity[] { scene.getOrCreateMain("Малыш") }, "ответить", true));
        scene.argueWith(new Entity[] { scene.getOrCreateMain("Карлосон") }, "спорить", false);
        scene.changeMood(new Entity[] { scene.getOrCreateMain("Карлосон") }, "менялось", false, 15);
        scene.makeSound(new Entity[] { scene.Human[0] }, sound);
        System.out.println();
        System.out.println();
        System.out.println();
        scene.interactionThingWithErrors(new Entity[] { scene.getOrCreateMain("Карлосон"),
                                                        scene.getOrCreateMain("Малыш") },
                                         scene.getOrCreateThing("Семечко"),
                                         scene.getOrCreateThing("горшок"),
                                         "ткнуть",
                                         false,
                                         "засыпал",
                                         false,
                                         scene.getOrCreateThing("земля"));
        scene.interactionThingWithErrors(new Entity[] { scene.getOrCreateMain("Карлосон"),
                                                        scene.getOrCreateMain("Малыш") },
                                         scene.getOrCreateThing("семечко"),
                                         scene.getOrCreateThing("горшок"),
                                         "ткнуть",
                                         false,
                                         "засыпал",
                                         false,
                                         scene.getOrCreateThing("земля"));
        scene.interactionThingWithErrors(new Entity[] { scene.getOrCreateMain("Карлосон"),
                                                        scene.getOrCreateMain("Малыш") },
                                         scene.getOrCreateThing("Семечко"),
                                         scene.getOrCreateThing("горшок"),
                                         "ткнуть",
                                         false,
                                         "засыпал",
                                         false,
                                         scene.getOrCreateThing("земля"));
        System.out.println();
        System.out.println();
        System.out.println();
        scene.interactionThingWithErrors(new Entity[] { scene.getOrCreateMain("Карлосон"),
                                                        scene.getOrCreateMain("Малыш") },
                                         scene.getOrCreateThing("Семечко"),
                                         scene.getOrCreateThing("Негоршок"),
                                         "ткнуть",
                                         false,
                                         "засыпал",
                                         false,
                                         scene.getOrCreateThing("земля"));
        System.out.println();
        System.out.println();
        System.out.println();
        scene.makeSound(new Entity[] { scene.getOrCreateMain("Малыш") }, sound);
        scene.makeSound(new Entity[] { scene.getOrCreateMain("горшок") }, sound);
    }
}


//~ Formatted by Jindent --- http://www.jindent.com

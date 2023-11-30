package Lab3.Atmoshere;

import Lab3.Actions.Message;

import Lab3.Atmoshere.makeSound;

import Lab3.Entity.abstracts.Entity;

public class Functions {
    public static interactiveAction actionInterraction = (Entity gs, Entity as) -> {
                                                             if (as.getObjects() == null) {
                                                                 Message imposible = new Message();

                                                                 System.out.println("└──  " + imposible.notSoEasy());

                                                                 return;
                                                             }

                                                             as.interactWith(gs);
                                                         };
    public static makeSound actionMakeSound = (Entity subject, Sound sound) -> {
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

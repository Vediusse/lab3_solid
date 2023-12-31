package Lab3.Atmoshere;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Lab3.Actions.Message;

import Lab3.Entity.Human;
import Lab3.Entity.Thing;
import Lab3.Entity.abstracts.Entity;

import static Lab3.Atmoshere.Functions.actionInterraction;
import static Lab3.Atmoshere.Functions.actionMakeSound;

public class Scene {
    private static Scene                 instance;
    private int                          chapter = 0;
    public Human[]                       Human;
    public Thing[]                       Things;
    public HashMap<String, List<Entity>> charachter;

    private Scene(Human[] Human, Thing[] Things, int chapter) {
        this.Human  = Human;
        this.Things = Things;

        Message action_for_describe = new Message(Human, Things);

        System.out.println(action_for_describe.allCharacters(action_for_describe.Subject, action_for_describe.Object));
        this.charachter = new HashMap<>();
        this.chapter    = chapter;

        for (Human human : Human) {
            String name = human.getName();

            if (this.charachter.containsKey(name)) {
                this.charachter.get(name).add(human);
            } else {
                List<Entity> characterList = new ArrayList<>();

                characterList.add(human);
                this.charachter.put(name, characterList);
            }

            Message action = new Message(new Human[] { human }, null);

            System.out.println(action.joinServer());
        }

        for (Thing things : Things) {
            String name = things.getName();

            if (this.charachter.containsKey(name)) {
                this.charachter.get(name).add(things);
            } else {
                List<Entity> characterList = new ArrayList<>();

                characterList.add(things);
                this.charachter.put(name, characterList);
            }
        }

        System.out.println();
    }

    public void argueWith(Entity[] MainCharacter, String verb, boolean negation) {
        Message action = new Message(MainCharacter, null);

        System.out.println(action.notEasyTo(verb, negation));
    }

    public String argueWithToString(Entity[] MainCharacter, String verb, boolean negation) {
        Message action = new Message(MainCharacter, null);

        return action.notEasyTo(verb, negation);
    }

    public void changeMood(Entity[] MainCharacter, String verb, boolean negation, int time) {
        Message action = new Message(MainCharacter, null);

        System.out.println(action.switchMood(verb, negation, time));
    }

    public String changeMoodToString(Entity[] MainCharacter, String verb, boolean negation, int time) {
        Message action = new Message(MainCharacter, null);

        return action.switchMood(verb, negation, time);
    }

    public void interactionThing(Entity[] MainCharacter, Entity GenitiveSubject, Entity AkkusativSubject, String verb,
                                 boolean negation, String secondVerb, boolean secondNegation,
                                 Entity InstrumentalSubject) {
        Message action = new Message(MainCharacter,
                                     new Entity[] { GenitiveSubject, AkkusativSubject, InstrumentalSubject });

        System.out.println(action.beOnTimeAndDoSmth(verb, negation, secondVerb, secondNegation, actionInterraction));
    }

    public void interactionThingWithErrors(Entity[] MainCharacter, Entity GenitiveSubject, Entity AkkusativSubject,
                                           String verb, boolean negation, String secondVerb, boolean secondNegation,
                                           Entity InstrumentalSubject) {
        Message action = new Message(MainCharacter,
                                     new Entity[] { GenitiveSubject, AkkusativSubject, InstrumentalSubject });

        action.beOnTimeAndDoSmthWithErrors(verb, negation, secondVerb, secondNegation, actionInterraction);
    }

    public void know(Entity[] MainCharacter, String verb, boolean negation) {
        Message action = new Message(MainCharacter, null);

        System.out.println(action.know(verb, negation));
    }

    public String knowToString(Entity[] MainCharacter, String verb, boolean negation) {
        Message action = new Message(MainCharacter, null);

        return action.know(verb, negation);
    }

    public void makeSound(Entity[] MainCharacter, Sound Sound) {
        Message action = new Message(MainCharacter, null);

        action.makeSoundWithErrors(Sound, actionMakeSound);
    }

    public String makeSoundToString(Entity[] MainCharacter, Sound Sound) {
        Message action = new Message(MainCharacter, null);

        return action.makeSound(Sound);
    }

    public void think(Entity[] MainCharacter, boolean negation, String reason) {
        Message action = new Message(MainCharacter, null);

        System.out.println(action.thinkAbout(negation, reason));
    }

    public String thinkToString(Entity[] MainCharacter, boolean negation, String reason) {
        Message action = new Message(MainCharacter, null);

        return action.thinkAbout(negation, reason);
    }

    public static Scene getInstance(int chapter, Human[] humans, Thing[] things) {
        if ((instance == null) || (instance.chapter != chapter)) {
            instance         = new Scene(humans, things, chapter);
            instance.chapter = chapter;
        }

        return instance;
    }

    private Entity getMainCharacheter(String name) {
        Human        NewThing     = new Human(name);
        List<Entity> NewThingList = new ArrayList<>();

        NewThingList.add(NewThing);
        this.charachter.put(name, NewThingList);

        return this.charachter.get(name).get(0);
    }

    public Entity getOrCreateMain(String name) {
        if (this.charachter.containsKey(name)) {
            Entity potentialMain = this.charachter.get(name).get(0);

            if (potentialMain.isMainCharacter()) {
                return potentialMain;
            }
        }

        return getMainCharacheter(name);
    }

    protected Entity getOrCreateMainbyIndex(String name, int index) {
        if (this.charachter.containsKey(name)) {
            Entity potentialMain = this.charachter.get(name).get(index);

            if (potentialMain.isMainCharacter()) {
                return potentialMain;
            }
        }

        return getMainCharacheter(name);
    }

    public Entity getOrCreateThing(String name) {
        if (this.charachter.containsKey(name)) {
            Entity potentialThing = this.charachter.get(name).get(0);

            if (!potentialThing.isMainCharacter()) {
                return potentialThing;
            }
        }

        return getThing(name);
    }

    protected Entity getOrCreateThingbyIndex(String name, int index) {
        if (this.charachter.containsKey(name)) {
            Entity potentialThing = this.charachter.get(name).get(index);

            if (!potentialThing.isMainCharacter()) {
                return potentialThing;
            }
        }

        return getThing(name);
    }

    private Entity getThing(String name) {
        Thing        NewThing     = new Thing(name, name, name, name, name);
        List<Entity> NewThingList = new ArrayList<>();

        NewThingList.add(NewThing);
        this.charachter.put(name, NewThingList);

        return this.charachter.get(name).get(0);
    }
}


//~ Formatted by Jindent --- http://www.jindent.com

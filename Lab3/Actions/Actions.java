package Lab3.Actions;

import Lab3.Atmoshere.Sound;

import Lab3.Entity.abstracts.Entity;

public class Actions {
    private int     lengthCharacter = 0;
    private String  subject         = "";
    private String  pronoun         = "";
    public Entity[] Subject         = new Entity[] {};
    public Entity[] Object;

    public Actions() {}

    public Actions(Entity[] Subject, Entity[] Object) {
        this.Subject         = Subject;
        this.Object          = Object;
        this.lengthCharacter = Subject.length;
        this.subject         = this.subjectBuild();
        this.pronoun         = this.pronounsBuild();
    }

    public String allCharacters(Entity[] Subject, Entity[] Object) {
        StringBuilder sb = new StringBuilder();

        sb.append("MainCharacters:\n");

        for (Entity mainCharacter : Subject) {
            sb.append("\t").append(mainCharacter.getName()).append("\n");
        }

        sb.append("Things:\n");

        for (Entity thing : Object) {
            sb.append("\t").append(thing.getName()).append("\n");
        }

        return sb.toString();
    }

    public String beOnTime(String verb, boolean negation) {
        return subject + modalVerbBilder(false,
                                         "успел") + "тем временем " + negationVerb(false,
                                                                                   verb) + " "
                                                                                         + this.Object[0].getName()
                                                                                         + " в "
                                                                                         + this.Object[1].getName();
    }

    public String beOnTimeAndDoSmth(String verb, boolean negation, String secondVerb, boolean secondNegation,interactiveAction interactiveAction) {
        interactiveAction.executeLogic();
        return beOnTime(verb,
                        negation) + ", и " + "теперь" + this.Subject[0].getPersonality().toString() + " "
                                  + this.doSmth(secondVerb,
                                                secondNegation) + this.Object[0].getPronounAkkusative() + " "
                                                                + this.Object[2].getInstrumental();
    }

    private String doSmth(String verb, boolean negation) {
        return (pronoun == null)
               ? ""
               : pronoun + " " + modalVerbBilder(false, verb);
    }

    public String joinServer() {
        return subject + "joins the server";
    }

    public String know(String verb, boolean negation) {
        return subject + modalVerbBilder(negation, " знал") + ", что" + doSmth("ответить", negation);
    }

    public String makeSound(Sound Sound) {
        return "Теперь " + subject + modalVerbBilder(false, "издал звук") + ", похожий на " + Sound.getSimilarTo();
    }

    private String modalVerbBilder(boolean negation, String verb) {
        if (!(lengthCharacter == 1)) {
            verb = verb + "и ";
        }

        verb = this.negationVerb(negation, verb);

        return verb;
    }

    private String negationVerb(boolean negation, String verb) {
        if (negation) {
            verb = "не" + verb;
        }

        return verb;
    }

    public String notEasyTo(String verb, boolean negation) {
        return negationVerb(false, verb).substring(0, 1)
                                        .toUpperCase() + negationVerb(negation,
                                                                      verb).substring(1) + " c "
                                                                      + this.Subject[0].getPronounAkkusative()
                                                                          + " было трудно, особенно когда " + "он"
                                                                              + " " + "бывал в настроении" + " по"
                                                                                  + negationVerb(negation,
                                                                                                 verb);
    }

    public String notSoEasy() {
        return "Нельзя закапывать что то не семечное :)";
    }

    private String pronounsBuild() {
        if ((lengthCharacter == 1)) {
            return this.Subject[0].getPronouns();
        }

        return "они";
    }

    private String subjectBuild() {
        String subject;

        if (lengthCharacter == 1) {
            subject = Subject[0].getName();
        } else {
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < lengthCharacter; i++) {
                sb.append(Subject[i].getName());

                if (i < lengthCharacter - 2) {
                    sb.append(", ");
                } else if (i == lengthCharacter - 2) {
                    sb.append(" и ");
                }
            }

            subject = sb.toString();
        }

        return subject + " ";
    }

    public String switchMood(String verb, boolean negation, int time) {
        return "К счастью, настроение у " + subject + negationVerb(false,
                                                                   verb) + " каждые "
                                                                   + this.Subject[0].getSwitchableMood().toString()
                                                                       + " минут";
    }

    public String thinkAbout(boolean negation, String reason) {
        return subject + modalVerbBilder(negation, "подумал") + ", поэтому " + reason;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com

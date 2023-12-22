package Lab3.Entity.property;

public enum Personality {
    Default(""),
    Active("энергично"),
    Sad(", жуя сопли,"),
    Ridicous("вайбово");

    private final String personality;

    Personality(String personality) {
        this.personality = personality;
    }

    @Override
    public String toString() {
        return this.personality;
    }

    public String getPersonality() {
        return this.personality;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com

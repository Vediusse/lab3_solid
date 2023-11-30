package Lab3.Entity.Cringe.property;

public enum Gender {
    Neutral("neutral"), Female("female"), Male("male");

    private final String gender;

    Gender(String personality) {
        this.gender = personality;
    }

    @Override
    public String toString() {
        return this.gender;
    }

    public String getGender() {
        return gender;
    }

    public String getPersonality() {
        return this.gender;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com

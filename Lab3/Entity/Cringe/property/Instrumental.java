package Lab3.Entity.Cringe.property;

public enum Instrumental {
    Karloson("Карлосон"), Malush("Малыш"), Pot("горшок"), Seed("семечко"), Dirty("землей");
    private final String instrumental;

    Instrumental(String personality) {
        this.instrumental = personality;
    }

    @Override
    public String toString() {
        return this.instrumental;
    }

    public String getPersonality() {
        return this.instrumental;
    }
}

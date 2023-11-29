package Lab3.Entity.Cringe.property;

public enum Akkusative {
    Karloson("Карлосон"), Malush("Малыш"), Pot("горшок"), Seed("семечко"), Dirty("земля");
    private final String akkusative;

    Akkusative(String personality) {
        this.akkusative = personality;
    }

    @Override
    public String toString() {
        return this.akkusative;
    }

    public String getPersonality() {
        return this.akkusative;
    }
}

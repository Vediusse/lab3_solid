package Lab3.Entity.Cringe.property;

public enum Name {
    Karloson("Карлосон"),
    Malush("Малыш"),
    Pot("горшок"),
    Seed("семечко"),
    Dirty("землю");

    private final String name;

    Name(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com

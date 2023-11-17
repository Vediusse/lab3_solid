package Lab3.Entity.property;

public enum SwitchableMood {
    Default("10"), Easy("15"), Diffiluct("30"), Hard("60");

    private final String switchableMood;

    SwitchableMood(String switchableMood) {
        this.switchableMood = switchableMood;
    }

    @Override
    public String toString() {
        return this.switchableMood;
    }

    public String getSwitchableMood() {
        return this.switchableMood;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com

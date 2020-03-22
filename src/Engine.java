public class Engine implements Cloneable {
    int sr;
    String eMark;
    String eName;
    int strength;
    int durability;

    public Engine(int sr, String eMark, String eName, int strength, int durability) {
        this.sr = sr;
        this.eMark = eMark;
        this.eName = eName;
        this.strength = strength;
        this.durability = durability;
    }

    public String toString() {
        return this.eName + " "+
                "sr=" + sr +
                ", eMark=" + eMark +
                ", strength=" + strength +
                ", durability=" + durability;
    }

    protected Object clone2() throws CloneNotSupportedException {
        return super.clone();
    }
}

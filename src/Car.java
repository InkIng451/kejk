public class Car implements Cloneable {
    int engine;
    String name;
    String mark;
    int speed;
    int fuel;

    public Car(int engine, String name, String mark, int speed, int fuel) {
        this.engine = engine;
        this.name = name;
        this.mark = mark;
        this.speed = speed;
        this.fuel = fuel;
    }

    public String toString() {
        return this.name + " "+
                "engine=" + engine +
                ", mark=" + mark +
                ", speed" + speed +
                ", fuel" + fuel;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}

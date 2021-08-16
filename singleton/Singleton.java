package singleton;

public class Singleton {

    private static final Singleton INSTANCE = new Singleton();
    private int value;

    private Singleton() {
        value = 0;
    }

    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }

    public static Singleton getInstance() {
        return INSTANCE;
    }

}

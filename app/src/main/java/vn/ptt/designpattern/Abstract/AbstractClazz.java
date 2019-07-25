package vn.ptt.designpattern.Abstract;

public abstract class AbstractClazz {
    private static AbstractClazz instance;

    public static AbstractClazz getInstance() {
        if (instance == null) instance = new HandleClazz();
        return instance;
    }

    public abstract String getString();

}

package vn.ptt.designpattern.Abstract;

public class HandleClazz extends AbstractClazz {
    @Override
    public String getString() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Hello";
    }
}

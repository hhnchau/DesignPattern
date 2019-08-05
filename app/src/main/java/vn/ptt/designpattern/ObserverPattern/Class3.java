package vn.ptt.designpattern.ObserverPattern;

public class Class3 extends Observer {
    public Class3(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Class3 String: " + Integer.toHexString( subject.getState() ).toUpperCase() );
    }
}

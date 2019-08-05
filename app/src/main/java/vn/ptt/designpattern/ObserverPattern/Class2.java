package vn.ptt.designpattern.ObserverPattern;

public class Class2 extends Observer {
    public Class2(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Class2 String: " + Integer.toOctalString( subject.getState() ) );
    }
}

package vn.ptt.designpattern.ObserverPattern;

public class Class1 extends Observer {

    public Class1(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Class1 String: " + Integer.toBinaryString( subject.getState() ) );
    }
}

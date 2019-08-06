package vn.ptt.designpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import vn.ptt.designpattern.Abstract.AbstractClazz;
import vn.ptt.designpattern.BuilderPattern.User;
import vn.ptt.designpattern.DependencyInjection.House;
import vn.ptt.designpattern.DependencyInjection.Weather;
import vn.ptt.designpattern.FactoryPattern.Shape;
import vn.ptt.designpattern.FactoryPattern.ShapeFactory;
import vn.ptt.designpattern.ObserverPattern.Class1;
import vn.ptt.designpattern.ObserverPattern.Class2;
import vn.ptt.designpattern.ObserverPattern.Class3;
import vn.ptt.designpattern.ObserverPattern.Subject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //////
        User emp1 = new User.Builder(1, "Thai", "Ngoc")
                .build();
        User emp2 = new User.Builder(1, "Ngoc", "Thai")
                .address("Ba Vi")
                .age(23)
                .build();
        ///////

        String s = AbstractClazz.getInstance().getString();

        ///////
        ShapeFactory shapeFactory = new ShapeFactory();

        //get an object of Circle and call its draw method.
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        //call draw method of Circle
        shape1.draw();

        //get an object of Rectangle and call its draw method.
        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        //call draw method of Rectangle
        shape2.draw();

        //get an object of Square and call its draw method.
        Shape shape3 = shapeFactory.getShape("SQUARE");

        //call draw method of circle
        shape3.draw();
        ///////
        Subject subject = new Subject();
        new Class1(subject);
        new Class2(subject);
        new Class3(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
        ///////////////
        Weather weather = new Weather();
        House house = new House(weather);
        house.lookThroughWindow();
        //////////
    }
}

package vn.ptt.designpattern.FactoryPattern;

import android.util.Log;

public class Circle implements Shape {
    @Override
    public void draw() {
        Log.d("TAG", "Inside Circle");
    }
}

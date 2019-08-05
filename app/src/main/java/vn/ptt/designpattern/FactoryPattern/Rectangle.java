package vn.ptt.designpattern.FactoryPattern;

import android.util.Log;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        Log.d("TAG", "Inside Rectangle");
    }
}

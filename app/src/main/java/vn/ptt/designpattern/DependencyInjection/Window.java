package vn.ptt.designpattern.DependencyInjection;

import android.util.Log;

public class Window {
    private Weather weather;

    public Window(Weather weather) {
        this.weather = weather;
    }

    public void lookout(){
        Log.d("DI", weather.getDescription());
    }
}

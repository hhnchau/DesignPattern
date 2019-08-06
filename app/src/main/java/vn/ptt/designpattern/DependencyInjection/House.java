package vn.ptt.designpattern.DependencyInjection;

import java.util.ArrayList;
import java.util.List;

public class House {
    private List<Window> lstWindow = new ArrayList<>();
    public House(Weather weather) {
        lstWindow.add(new Window(weather));
        lstWindow.add(new Window(weather));
        lstWindow.add(new Window(weather));
    }

    public void lookThroughWindow(){
        for (Window w: lstWindow){
            w.lookout();
        }
    }
}

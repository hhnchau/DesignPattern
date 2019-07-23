package vn.ptt.designpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import vn.ptt.designpattern.BuilderPattern.User;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        User emp1 = new User.Builder(1, "Thai", "Ngoc")
                .build();

        User emp2 = new User.Builder(1, "Ngoc", "Thai")
                .address("Ba Vi")
                .age(23)
                .build();

    }
}

package nyc.c4q.shannonalexander_navarro.keyboardjsontest.views;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import nyc.c4q.shannonalexander_navarro.keyboardjsontest.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            FragmentManager animalFragment = getSupportFragmentManager();
            animalFragment.beginTransaction().add(R.id.activity_main, new ListFragment()).commit();
        }
    }
}

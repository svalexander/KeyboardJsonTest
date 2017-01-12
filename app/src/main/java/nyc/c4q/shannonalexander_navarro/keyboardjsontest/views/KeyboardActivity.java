package nyc.c4q.shannonalexander_navarro.keyboardjsontest.views;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import nyc.c4q.shannonalexander_navarro.keyboardjsontest.R;
import nyc.c4q.shannonalexander_navarro.keyboardjsontest.model.Key;

import static nyc.c4q.shannonalexander_navarro.keyboardjsontest.views.KeyboardListViewHolder.THIS_KEY;

public class KeyboardActivity extends AppCompatActivity {

    private LinearLayout layout;
    private static final int TIME_DELAY = 2000;
    private static long back_pressed;
    private ImageView keyIV;
    private static final String KEY_URL = "http://jsjrobotics.nyc";

    String finalUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keyboard);

        initViews();
        Intent intent = getIntent();
        Key thisKey = (Key) intent.getSerializableExtra(THIS_KEY);

        finalUrl = KEY_URL + thisKey.getUrl();

        Log.d("url", finalUrl.toString());

            Picasso.with(getApplicationContext()).load(finalUrl.toString()).into(keyIV);

    }

    public void onBackPressed() {

        if (back_pressed + TIME_DELAY > System.currentTimeMillis()) {
            super.onBackPressed();
        } else {
            Toast.makeText(getApplicationContext(), "Press once more to see list", Toast.LENGTH_SHORT).show();
        }
        back_pressed = System.currentTimeMillis();
    }

    public void initViews() {
        layout = (LinearLayout) findViewById(R.id.second_act_layout);
        keyIV = (ImageView) findViewById(R.id.key_image);

    }
}

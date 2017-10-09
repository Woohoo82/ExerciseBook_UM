package hu.tannis.zver.exercisebook_um;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.content.Intent;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //super.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LOCKED);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.navigation, menu);
        return true;
    }

    public void openPractice(View view) {
        Intent i = new Intent(this, PracticeActivity.class);
        startActivity(i);
    }

    public void openChorder(View view) {
        Intent i = new Intent(this, ChorderActivity.class);
        startActivity(i);
    }

    public void openMetronome(View view) {
        //Intent i = new Intent(this, MetronomeActivity.class);
        //startActivity(i);

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, R.string.message_na, duration);
        toast.show();
    }

    public void openEarTrainer(View view) {
        //Intent i = new Intent(this, EarTrainerActivity.class);
        //startActivity(i);

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, R.string.message_na, duration);
        toast.show();
    }
}

// TODO: Add Menu: Song writing

package hu.tannis.zver.exercisebook_um;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openPractice(View view) {
        Intent i = new Intent(this, PracticeActivity.class);
        startActivity(i);
    }

    public void openChorder(View view) {
        Intent i = new Intent(this, ChorderActivity.class);
        startActivity(i);
    }
}

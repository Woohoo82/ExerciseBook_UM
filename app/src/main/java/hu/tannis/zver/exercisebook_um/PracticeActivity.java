package hu.tannis.zver.exercisebook_um;

import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import values.ExePiano01;

import static java.lang.System.*;

public class PracticeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().add(R.id.exerciseContainer, ExePiano01.newInstance(1)).commit();
        }
    }
}

//TODO 16 féle feladat:
//  1. Én irányítom az ujjaimat
//  2  Hangok és hangközök
//  3. Skála sémák
//  4. Akkord sémák
//  5. Ötujjas lapagyakorlat
//  6. Kibővített ujjgyakorlatok
//  7. Ellentétes mozgású kromatikus skála
//  8. Oktávugrás
//  9. Ismételt hangok
// 10. Blues skála
// 11. Dúr akkord és fordításai
// 12. moll akkord és fordításai
// 13. Akkord váltás
// 14. Kotta olvasás
// 15. Identify note
// 16. Identify distance

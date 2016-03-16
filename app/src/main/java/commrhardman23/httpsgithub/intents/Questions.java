package commrhardman23.httpsgithub.intents;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class Questions extends AppCompatActivity {

    public static RadioButton rdobtnDrums;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);

        rdobtnDrums = (RadioButton) findViewById(R.id.rdobtnDrums);

    }

    public void checkAnswer(View vw)
    {
        Intent display = new Intent(this, DisplayMessageActivity.class);

        startActivity(display);
    }

}

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
import android.widget.EditText;

public class Questions extends AppCompatActivity {

    public String EXTRA_MESSAGE = "commrhardman.httpsgithub.intents.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);

    }

    public void displayMessage(View vw)
    {
        Intent display = new Intent(this, DisplayMessageActivity.class);

        String message = "On second thought, let's not go to Camelot. 'Tis a silly place...";

        display.putExtra(EXTRA_MESSAGE, message);

        startActivity(display);
    }

}

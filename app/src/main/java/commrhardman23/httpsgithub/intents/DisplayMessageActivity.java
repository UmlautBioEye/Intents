package commrhardman23.httpsgithub.intents;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        TextView txtvwDisplay = (TextView) findViewById(R.id.txtvwDisplay);

        String message = "The answer is...";

        txtvwDisplay.setTextSize(14);
        txtvwDisplay.setText(message);
    }

}

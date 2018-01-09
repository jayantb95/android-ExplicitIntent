package jayantb95.explicitintent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ActivityOne extends AppCompatActivity {

    private Button btnLinkActivityTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        initialize();
        listener();
    }

    private void initialize() {
        btnLinkActivityTwo = (Button) findViewById(R.id.btn_link_activity_two);
    }

    private void listener() {
        btnLinkActivityTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //starts new activity using intent.
                startActivity(new Intent(ActivityOne.this, ActivityTwo.class));

                //removes the activity from the stack, i.e app exits on pressing the back button.
                finish();
            }
        });
    }
}
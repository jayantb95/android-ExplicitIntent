package jayantb95.explicitintent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ActivityTwo extends AppCompatActivity {

    private Button btnLinkActivityOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        initialize();
        listener();
    }

    private void initialize() {
        btnLinkActivityOne = (Button) findViewById(R.id.btn_link_activity_one);
    }

    private void listener() {
        btnLinkActivityOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //starts new activity using intent.
                startActivity(new Intent(ActivityTwo.this, ActivityOne.class));

                //removes the activity from the stack, i.e app exits on pressing the back button.
                finish();
            }
        });
    }
}
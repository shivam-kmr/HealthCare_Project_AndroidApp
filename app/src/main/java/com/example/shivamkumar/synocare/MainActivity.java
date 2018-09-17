package com.example.shivamkumar.synocare;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_TIME = 4000;
    Button hidden;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //Do any action here. Now we are moving to next page
                Intent mySuperIntent = new Intent(MainActivity.this, ActivityHome.class);
                startActivity(mySuperIntent);
            }
        }, SPLASH_TIME);
        hidden = (Button) findViewById(R.id.hidden);
        hidden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ActivityHome.class));
                finish();
            }
        });
    }
}

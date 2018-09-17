package com.example.shivamkumar.synocare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Button icode,scan,bluetooth,icodeimg,scanimg;
        icode = (Button) findViewById(R.id.icode);
        scan = (Button) findViewById(R.id.scan);
        bluetooth = (Button) findViewById(R.id.bluetooth);
        icodeimg = (Button) findViewById(R.id.icodeimg);
        scanimg = (Button) findViewById(R.id.scanimg);

        scan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivityHome.this, Scanner.class));
                finish();
            }
        });
        bluetooth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivityHome.this, bluetooth.class));
                finish();
            }
        });
        icode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivityHome.this, icode.class));
                finish();
            }
        });
        scanimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivityHome.this, Scanner.class));
                finish();
            }
        });

        icodeimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivityHome.this, icode.class));
                finish();
            }
        });
    }
}

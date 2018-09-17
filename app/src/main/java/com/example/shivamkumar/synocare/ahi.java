package com.example.shivamkumar.synocare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class ahi extends AppCompatActivity {
    TextView dateview,text1,text2,text3,text4,text5,text6;;
    Button getdata;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ahi);
        String date = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(new Date());
        dateview = (TextView) findViewById(R.id.date);
        dateview.setText(date);
        getdata = (Button) findViewById(R.id.getdata);
        text1=(TextView)findViewById(R.id.ahirestext);
        text2=(TextView)findViewById(R.id.usagerestext);
        text3=(TextView)findViewById(R.id.devicemoderes);
        text4=(TextView)findViewById(R.id.minpressres);
        text5=(TextView)findViewById(R.id.maxpressres);
        text6=(TextView)findViewById(R.id.spo2res);

        try {
            Intent intent = getIntent();
            String text = intent.getStringExtra("text");
            text = text.replace("\n", "");
            String[] value = text.split(",");
            text1.setText(value[0]);
            text2.setText(value[1]);
            text3.setText(value[2]);
            text4.setText(value[3]);
            text5.setText(value[4]);
            text6.setText(value[5]);
        }
        catch (Exception e){
            /*Toast.makeText(this.getBaseContext(),"INCOMPITABLE QR CODE!",Toast.LENGTH_SHORT).show();
            startActivity(new Intent(ahi.this, ActivityHome.class));
            finish();*/

        }
        getdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ahi.this, ActivityHome.class));
                finish();
            }
        });

    }
}

package com.example.shivamkumar.synocare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class display extends AppCompatActivity {
    TextView dateview,text1,text2,text3,text4,text5,text6;;
    Button getdata;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        String date = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(new Date());
        dateview = (TextView) findViewById(R.id.date);
        dateview.setText(date);
        getdata = (Button) findViewById(R.id.back);
        text1=(TextView)findViewById(R.id.mode);
        text2=(TextView)findViewById(R.id.therapyhrs);
        text3=(TextView)findViewById(R.id.ipap);
        text4=(TextView)findViewById(R.id.epap);
        text5=(TextView)findViewById(R.id.breathrate);

        try {
            Intent intent = getIntent();
            String text = intent.getStringExtra("text");
            text =text.replace("\n", "");
            String[] value = text.split(",");
            text1.setText(value[0]);
            text2.setText(value[1]);
            text3.setText(value[2]);
            text4.setText(value[3]);
            text5.setText(value[4]);
        }
        catch (Exception e){
            /*Toast.makeText(this.getBaseContext(),"INCOMPITABLE QR CODE!",Toast.LENGTH_SHORT).show();
            startActivity(new Intent(display.this, ActivityHome.class));
            finish();*/
            return;
        }
        getdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(display.this, ActivityHome.class));
                finish();
            }
        });

    }
}

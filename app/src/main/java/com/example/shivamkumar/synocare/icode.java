package com.example.shivamkumar.synocare;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

import java.util.Timer;
import java.util.TimerTask;

public class icode extends AppCompatActivity {
    CarouselView carouselView;
    Button toahi;
    EditText icoderes;
    int[] sampleimage = {R.drawable.synocaretwo,R.drawable.synocarethree,R.drawable.synocare_logo};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icode);
        carouselView =(CarouselView) findViewById(R.id.carouselview);
        carouselView.setPageCount(sampleimage.length);
        carouselView.setImageListener(imageListener);
        toahi = (Button) findViewById(R.id.toahi);
        icoderes = (EditText) findViewById(R.id.icoderes);

        toahi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(icoderes.getText().length() >3) {
                    startActivity(new Intent(icode.this, icodescanner.class));
                    finish();
                }
                else{
                   msg();
                }
            }
        });
    }
    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(sampleimage[position]);
        }
    };
void msg(){
    Toast.makeText(this.getBaseContext(),"Enter Your Correct iCODE ",Toast.LENGTH_LONG).show();
}

}
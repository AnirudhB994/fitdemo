package com.example.fitnessfriend;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import pl.droidsonroids.gif.GifImageView;

public class remdest extends AppCompatActivity {
    GifImageView img;
    TextView inst;
    int exeid[]={R.drawable.exe1,
            R.drawable.exe2,
            R.drawable.exe3,
            R.drawable.exe4,
            R.drawable.exe5,
            R.drawable.exe6,
            R.drawable.exe7,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remdest);
        img=findViewById(R.id.remdestimg);
        //inst=findViewById(R.id.instruction);
        Intent in=getIntent();
        int pos=in.getIntExtra("indic",0);
        img.setImageResource(exeid[pos]);
        //inst.setText(exename[pos]);

    }
}
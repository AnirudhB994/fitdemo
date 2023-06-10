package com.example.fitnessfriend;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import pl.droidsonroids.gif.GifImageView;

public class remdest extends AppCompatActivity {
    GifImageView img;
    GifImageView img2;
    TextView inst;
    int exeid[]={R.drawable.exe1,
            R.drawable.exe2,
            R.drawable.exe3,
            R.drawable.exe4,
            R.drawable.exe5,
            R.drawable.exe6,
            R.drawable.exe7,
    };
    int exeid2[]={R.drawable.ex1,
            R.drawable.ex2,
            R.drawable.ex3,
            R.drawable.ex4,
            R.drawable.ex5
    };
    int exeid3[]={R.drawable.e1,
            R.drawable.e2,
            R.drawable.e3,
            R.drawable.e4,
            R.drawable.e5
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remdest);
        img=findViewById(R.id.remdestimg);
        //img2=findViewById(R.id.remdestimg);
        //inst=findViewById(R.id.instruction);
        Intent in=getIntent();
        String clss=in.getStringExtra("class");
        if(clss.equals("upperbody")){
            int pos=in.getIntExtra("indic",0);
            img.setImageResource(exeid[pos]);
        }else if (clss.equals("abdomen")){
            int pos=in.getIntExtra("abindic",0);
            img.setImageResource(exeid2[pos]);
        }else if(clss.equals("lowerbody")){
            int pos=in.getIntExtra("lowindic",0);
            img.setImageResource(exeid3[pos]);
        }

    }
}
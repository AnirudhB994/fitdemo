package com.example.fitnessfriend;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView fullbody,upperbody,abdomen,lowerbody,lchoose,nutrition;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fullbody=findViewById(R.id.fullbody);
        upperbody=findViewById(R.id.upperbody);
        abdomen=findViewById(R.id.abdomen);
        lowerbody=findViewById(R.id.lowerbody);
        lchoose=findViewById(R.id.lchoose);
        nutrition=findViewById(R.id.nutrition);

        //Click Listeners
        fullbody.setOnClickListener(this);
        upperbody.setOnClickListener(this);
        abdomen.setOnClickListener(this);
        lowerbody.setOnClickListener(this);
        lchoose.setOnClickListener(this);
        nutrition.setOnClickListener(this);
    }

    public void onClick(View v){
        Intent i;
        switch(v.getId()){
            case R.id.fullbody:i=new Intent(this,FullBody.class);startActivity(i);break;
            case R.id.upperbody:i=new Intent(this,UpperBody.class);startActivity(i);break;
            case R.id.abdomen:i=new Intent(this,Abdomen.class);startActivity(i);break;
            case R.id.lowerbody:i=new Intent(this,LowerBody.class);startActivity(i);break;
            case R.id.lchoose:i=new Intent(this,LChoose.class);startActivity(i);break;
            case R.id.nutrition:i=new Intent(this,Nutrition.class);startActivity(i);break;
            default:break;
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}
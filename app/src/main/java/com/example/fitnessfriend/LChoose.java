package com.example.fitnessfriend;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LChoose extends AppCompatActivity {

    EditText height,weight;
    Button submit,redirect;
    TextView result,answer;
    int flag=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lchoose);
        height=findViewById(R.id.height);
        weight=findViewById(R.id.weight);
        submit=findViewById(R.id.submit);
        redirect=findViewById(R.id.redirect);
        result=findViewById(R.id.result);
        answer=findViewById(R.id.answer);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //int hivalue=0,wivalue=0;
                String hvalue=height.getText().toString();
                //try {
                   double hivalue=Double.parseDouble(hvalue);
                //}catch (Exception e){
                    //Log.d("height error", String.valueOf(e));
                //}
                String wvalue=weight.getText().toString();
                //try {
                   double wivalue=Double.parseDouble(wvalue);
               // }catch (Exception e){
                    //Log.d("weight error", String.valueOf(e));
                //}
                double bmi=wivalue/(hivalue*hivalue);
                String res,ans;
                bmi=Math.round(bmi*100.0)/100.0;
                if (bmi<18.5){
                    flag=1;
                    res="You come under underweight section\n So you should go with:-";
                    result.setText(res);
                    result.setVisibility(View.VISIBLE);
                    ans="FULL BODY WORKOUT DAILY";
                    answer.setText(ans);
                    answer.setVisibility(View.VISIBLE);
                    redirect.setVisibility(View.VISIBLE);
                }else if(bmi>=18.5 && bmi<=24.9){
                    flag=2;
                    res="You come under healthy weight section\n So you should go with:-";
                    result.setText(res);
                    result.setVisibility(View.VISIBLE);
                    ans="UPPER BODY  AND\nABDOMEN WORKOUT \nALTERNATE DAYS RESPECTIVELY";
                    answer.setText(ans);
                    answer.setVisibility(View.VISIBLE);
                    redirect.setVisibility(View.VISIBLE);
                }else if(bmi>=25 && bmi<=29.9){
                    flag=3;
                    res="You come under over weight section\n So you should go with:-";
                    result.setText(res);
                    result.setVisibility(View.VISIBLE);
                    ans="FULL BODY  AND\nUPPER BODY WORKOUT \nALTERNATE DAYS RESPECTIVELY";
                    answer.setText(ans);
                    answer.setVisibility(View.VISIBLE);
                    redirect.setVisibility(View.VISIBLE);
                }else{
                    flag=4;
                    res="You come under obese section\n So you should go with:-";
                    result.setText(res);
                    result.setVisibility(View.VISIBLE);
                    ans="FULL BODY  AND\nABDOMEN WORKOUT \nALTERNATE DAYS RESPECTIVELY";
                    answer.setText(ans);
                    answer.setVisibility(View.VISIBLE);
                    redirect.setVisibility(View.VISIBLE);
                }
            }
        });
        redirect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (flag){
                    case 1:Intent intent1=new Intent(getApplicationContext(),FullBody.class);startActivity(intent1);break;
                    case 2:Intent intent2=new Intent(getApplicationContext(),UpperBody.class);startActivity(intent2);break;
                    case 3:Intent intent3=new Intent(getApplicationContext(),FullBody.class);startActivity(intent3);break;
                    case 4:Intent intent4=new Intent(getApplicationContext(),FullBody.class);startActivity(intent4);break;
                    default:break;
                }
            }
        });
    }
}
package com.example.fitnessfriend;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

import pl.droidsonroids.gif.GifImageView;

public class FullBodyDest extends AppCompatActivity {

    GifImageView img;
    TextView inst;
    int exeid[]={R.drawable.exersice_1,
            R.drawable.exersice_2,
            R.drawable.exersice_3,
            R.drawable.exersice_4,
            R.drawable.exersice_5,
            R.drawable.exersice_6,
            R.drawable.exersice_7,
            R.drawable.exersice_8,
            R.drawable.exersice_9,
            R.drawable.exersice_10,
            R.drawable.exersice_11,
            R.drawable.exersice_12,
            R.drawable.exersice_13};
    /*int[] exename ={R.string.mountain_climber,
            R.string.basic_crunches,
            R.string.bench_dips,
            R.string.bicycle_crunches,
            R.string.leg_raise,
            R.string.alternative_heel_touch,
            R.string.leg_up_crunches,
            R.string.sit_up,
            R.string.alternative_vup,
            R.string.plank_rotation,
            R.string.plank_ll,
            R.string.russian_twist,
            R.string.bridge
    };*/
    private static final long START_TIME_IN_MILLIS=60000;
    private TextView countdown;
    private Button startp;
    private Button reset;
    private CountDownTimer countDownTimer;
    private boolean timerrunning;
    private long timeleft=START_TIME_IN_MILLIS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_body_dest);
        img=findViewById(R.id.destimg);
        inst=findViewById(R.id.instruction);
        Intent in=getIntent();
        int pos=in.getIntExtra("indicator",0);
        img.setImageResource(exeid[pos]);
        //inst.setText(exename[pos]);
        countdown=findViewById(R.id.timer);
        startp=findViewById(R.id.start);
        reset=findViewById(R.id.reset);

        startp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(timerrunning){
                    pauseTimer();
                }else{
                    startTimer();
                }
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetTimer();
            }
        });
        updateCountDownText();
    }
    private void startTimer(){
        countDownTimer=new CountDownTimer(timeleft,1000) {
            @Override
            public void onTick(long l) {
                timeleft=l;
                updateCountDownText();
            }

            @Override
            public void onFinish() {
                timerrunning=false;
                startp.setText("Start");
                startp.setVisibility(View.INVISIBLE);
                reset.setVisibility(View.VISIBLE);

            }
        }.start();

        timerrunning=true;
        startp.setText("pause");
        reset.setVisibility(View.INVISIBLE);
    }
    private void updateCountDownText(){
        int minutes=(int)(timeleft/1000)/60;
        int seconds=(int)(timeleft/1000)%60;
        String timeleftformatted=String.format(Locale.getDefault(),"%02d:%02d",minutes,seconds);
        countdown.setText(timeleftformatted);
    }
    private void pauseTimer(){
        countDownTimer.cancel();
        timerrunning=false;
        startp.setText("start");
        reset.setVisibility(View.VISIBLE);

    }
    private void resetTimer(){
        timeleft=START_TIME_IN_MILLIS;
        updateCountDownText();
        reset.setVisibility(View.INVISIBLE);
        startp.setVisibility(View.VISIBLE);
    }
}
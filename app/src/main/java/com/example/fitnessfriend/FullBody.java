package com.example.fitnessfriend;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class FullBody extends AppCompatActivity {

    String exelist[]={"MOUNTAIN CLIMBER","BASIC CRUNCHES","BENCH DIPS","BICYCLE CRUNCHES","LEG RAISE","ALTERNATIVE HEEL TOUCH","LEG UP CRUNCHES","SIT UP",
                        "ALTERNATIVE V UP","PLANK ROTATION","PLANK WITH LEG LEFT","RUSSIAN TWIST","BRIDGE"};
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
    String exerep[]={"Repeat 2 times","Repeat 2 times","Repeat 2 times","Repeat 2 times","Repeat 2 times","Repeat 2 times","Repeat 2 times","Repeat 2 times","Repeat 2 times","Repeat 2 times","Repeat 2 times","Repeat 2 times","Repeat 2 times"};
    String exetime[]={"01:00 MIN","01:00 MIN","01:00 MIN","01:00 MIN","01:00 MIN","01:00 MIN","01:00 MIN","01:00 MIN","01:00 MIN","01:00 MIN","01:00 MIN","01:00 MIN","01:00 MIN"};
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_body);
        listView=findViewById(R.id.custom_list_view);
        CustomAdapter ca=new CustomAdapter(getApplicationContext(),exelist,exerep,exetime,exeid);
        listView.setAdapter(ca);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                int pos=i;
                Intent intent = new Intent(getApplicationContext(),FullBodyDest.class);
                intent.putExtra("indicator",pos);
                startActivity(intent);
            }
        });
    }
}
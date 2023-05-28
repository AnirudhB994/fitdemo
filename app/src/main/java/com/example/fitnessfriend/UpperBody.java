package com.example.fitnessfriend;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class UpperBody extends AppCompatActivity {

    String exelist[]={"Flat Chest Presses","Flat Chest Flies","Seated Shoulder Presses","Lateral Raises","Shrugs","Hammer curls","Overhead Triceps Extensions"};
    int exeid[]={R.drawable.exe1,
            R.drawable.exe2,
            R.drawable.exe3,
            R.drawable.exe4,
            R.drawable.exe5,
            R.drawable.exe6,
            R.drawable.exe7,
            };
    String counts[]={"10 times","10 times","10 times","10 times","10 times","10 times","10 times"};
    String reps[]={"3 times","3 times","3 times","3 times","3 times","3 times","3 times"};
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upper_body);
        listView = findViewById(R.id.custom_list_view);
        CustomAdapter ca=new CustomAdapter(getApplicationContext(),exelist,counts,reps,exeid);
        listView.setAdapter(ca);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                int pos=i;
                Intent intent = new Intent(getApplicationContext(),remdest.class);
                intent.putExtra("indic",pos);
                startActivity(intent);
            }
        });

    }
}
package com.example.fitnessfriend;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class LowerBody extends AppCompatActivity {

    String exelist[]={"Lateral lunges","Forward lunges","Pistol squat"," Bulgarian jump squat","Single leg step up"};
    int exeid[]={R.drawable.e1,
            R.drawable.e2,
            R.drawable.e3,
            R.drawable.e4,
            R.drawable.e5
    };
    String counts[]={"10 times","10 times","10 times","10 times","10 times","10 times","10 times"};
    String reps[]={"3 times","3 times","3 times","3 times","3 times","3 times","3 times"};
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lower_body);
        listView = findViewById(R.id.custom_list_view);
        CustomAdapter ca=new CustomAdapter(getApplicationContext(),exelist,counts,reps,exeid);
        listView.setAdapter(ca);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                int pos=i;
                Intent intent = new Intent(getApplicationContext(),remdest.class);
                intent.putExtra("lowindic",pos);
                intent.putExtra("class","lowerbody");
                startActivity(intent);
            }
        });
    }
}
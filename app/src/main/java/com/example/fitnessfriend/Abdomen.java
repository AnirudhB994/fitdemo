package com.example.fitnessfriend;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Abdomen extends AppCompatActivity {

    String exelist[]={"Oblique Crunches","Double Crunches","V Ups","Plank Supermans","Seated Russian Twists"};
    int exeid[]={R.drawable.ex1,
            R.drawable.ex2,
            R.drawable.ex3,
            R.drawable.ex4,
            R.drawable.ex5
    };
    String counts[]={"10 times","10 times","10 times","10 times","10 times","10 times","10 times"};
    String reps[]={"3 times","3 times","3 times","3 times","3 times","3 times","3 times"};
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abdomen);
        listView = findViewById(R.id.custom_list_view);
        CustomAdapter ca=new CustomAdapter(getApplicationContext(),exelist,counts,reps,exeid);
        listView.setAdapter(ca);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                int pos=i;
                Intent intent = new Intent(getApplicationContext(),remdest.class);
                intent.putExtra("abindic",pos);
                intent.putExtra("class","abdomen");
                startActivity(intent);
            }
        });
    }
}
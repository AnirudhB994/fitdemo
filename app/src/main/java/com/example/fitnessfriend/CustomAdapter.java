package com.example.fitnessfriend;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import pl.droidsonroids.gif.GifImageView;

public class CustomAdapter extends BaseAdapter {

    Context context;
    String[] exelist;
    String[] exerep;
    String[] exetime;
    int[] exeid;
    LayoutInflater inflater;
    public CustomAdapter(Context ctx,String[] name1,String[] name2,String[] name3,int[] images){
        this.context=ctx;
        this.exelist=name1;
        this.exerep=name2;
        this.exetime=name3;
        this.exeid=images;
        inflater=LayoutInflater.from(ctx);
    }
    @Override
    public int getCount() {
        return exelist.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view=inflater.inflate(R.layout.list_item,null);
        TextView t1=view.findViewById(R.id.exename);
        TextView t2=view.findViewById(R.id.exerep);
        TextView t3=view.findViewById(R.id.exetime);
        GifImageView i1=view.findViewById(R.id.exegif);

        t1.setText(exelist[i]);
        t2.setText(exerep[i]);
        t3.setText(exetime[i]);
        i1.setImageResource(exeid[i]);
        return view;
    }
}

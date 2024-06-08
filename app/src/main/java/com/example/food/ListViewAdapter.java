package com.example.food;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


import java.util.ArrayList;


//设置历史记录的adapter
public class ListViewAdapter extends ArrayAdapter<Foodmodel> {

    private Context mcontext;

    private int mresource;

    public ListViewAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Foodmodel> objects) {
        super(context, resource, objects);

        this.mcontext = context;
        this.mresource = resource;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        convertView = LayoutInflater.from(this.mcontext).inflate(this.mresource,parent,false);
        TextView name = convertView.findViewById(R.id.gettname);
        TextView num = convertView.findViewById(R.id.gettnum);

        name.setText(getItem(position).getName());
        num.setText(String.valueOf(getItem(position).getNum()));
        return convertView;
    }
}

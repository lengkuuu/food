package com.example.food;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class resulActivity extends AppCompatActivity {

    public Integer food1,food2,food3,food4,food5,food6,food7,food8;

    String desknum;

    TextView desknums,res;

    public Integer price1=3,price2=3,price3=10,price4=3,price5=10,price6=10,price7=8,price8=8,sum=0;



    ListView listView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resul);


        Intent intent = getIntent();
        food1 = intent.getIntExtra("send_food1",0);
        food2 = intent.getIntExtra("send_food2",0);
        food3 = intent.getIntExtra("send_food3",0);
        food4 = intent.getIntExtra("send_food4",0);
        food5 = intent.getIntExtra("send_food5",0);
        food6 = intent.getIntExtra("send_food6",0);
        food7 = intent.getIntExtra("send_food7",0);
        food8 = intent.getIntExtra("send_food8",0);
        desknum = intent.getStringExtra("send_desknum");

        desknums =findViewById(R.id.desknum);
        desknums.setText(desknum);
        res = findViewById(R.id.res);

        listView = findViewById(R.id.list11);
        ArrayList<Foodmodel> arraylist = new ArrayList<>();
        if(food1>0){
            arraylist.add(new Foodmodel("可乐",food1));
        }
        if(food2>0){
            arraylist.add(new Foodmodel("雪碧",food2));
        }
        if(food3>0){
            arraylist.add(new Foodmodel("冰奶昔",food3));
        }
        if(food4>0){
            arraylist.add(new Foodmodel("冰淇淋",food4));
        }
        if(food5>0){
            arraylist.add(new Foodmodel("汉堡",food5));
        }
        if(food6>0){
            arraylist.add(new Foodmodel("三明治",food6));
        }
        if(food7>0){
            arraylist.add(new Foodmodel("薯条",food7));
        }
        if(food8>0){
            arraylist.add(new Foodmodel("炸鸡翅",food8));
        }
        ListViewAdapter listViewAdapter = new ListViewAdapter(resulActivity.this,R.layout.list_style,arraylist);
        listView.setAdapter(listViewAdapter);

        Log.i("text",food1+"-"+food2+"-"+food3+"-"+food4+"-"+food5+"-"+food6+"-"+food7+"-"+food8+"-"+desknum);


    }

    public void res(View btn){
        sum = food1*price1+food2*price2+food3*price3+food4*price4+food5*price5+food6*price6+food7*price7+food8*price8;
        res.setText(String.valueOf(sum));
    }

    public void back(View btn){
        Intent intent = new Intent(resulActivity.this,indexActivity.class);
        startActivity(intent);
    }
}
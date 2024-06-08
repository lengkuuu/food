package com.example.food;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class order1Activity extends AppCompatActivity {

    public Integer food1 =0,food2 = 0,food3 = 0,food4 = 0;

    TextView foodnum1,foodnum2,foodnum3,foodnum4;

    String desknum;

    @Override
    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order1);
        Intent intent = getIntent();
        desknum = intent.getStringExtra("desknum");

         Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        Button btn4 = findViewById(R.id.btn4);
        Button btnn = findViewById(R.id.next);
        foodnum1 = findViewById(R.id.food1);
        foodnum2 = findViewById(R.id.food2);
        foodnum3 = findViewById(R.id.food3);
        foodnum4 = findViewById(R.id.food4);

    }

    public void order(View btn){
        if(btn.getId() == R.id.btn1){
            food1 = food1+1;
            foodnum1.setText(String.valueOf(food1));
        }
        else if(btn.getId() == R.id.btn2){
            food2 = food2+1;
            foodnum2.setText(String.valueOf(food2));
        }
        else if(btn.getId() == R.id.btn3){
            food3 = food3+1;
            foodnum3.setText(String.valueOf(food3));
        }
        else if(btn.getId() == R.id.btn4){
            food4 = food4+1;
            foodnum4.setText(String.valueOf(food4));
        }
    }

    public void order1(View btn){
        if(btn.getId() == R.id.btn11){
            if(food1>0){
                food1 = food1-1;
                foodnum1.setText(String.valueOf(food1));
            }

        }
        else if(btn.getId() == R.id.btn22){
            if(food2>0){
                food2 = food2-1;
                foodnum2.setText(String.valueOf(food2));
            }

        }
        else if(btn.getId() == R.id.btn33){
            if(food3>0){
                food3 = food3-1;
                foodnum3.setText(String.valueOf(food3));
            }

        }
        else if(btn.getId() == R.id.btn44){
            if(food4>0){
                food4 = food4-1;
                foodnum4.setText(String.valueOf(food4));
            }

        }
    }

    public void next(View btn){
        Log.i("text",food1+"-"+food2+"-"+food3+"-"+food4+"-"+desknum);
        Intent intent1 = new Intent(order1Activity.this,order2Activity.class);
        intent1.putExtra("send_food1",food1);
        intent1.putExtra("send_food2",food2);
        intent1.putExtra("send_food3",food3);
        intent1.putExtra("send_food4",food4);
        intent1.putExtra("send_desknum",desknum);
        startActivity(intent1);
    }
}
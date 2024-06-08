package com.example.food;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class order2Activity extends AppCompatActivity {

    public Integer food5 =0,food6 = 0,food7 = 0,food8 = 0;

    public Integer food1,food2,food3,food4;

    TextView foodnum5,foodnum6,foodnum7,foodnum8;

    String desknum;

    @Override
    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order2);
        Intent intent = getIntent();
        desknum = intent.getStringExtra("send_desknum");
        food1 = intent.getIntExtra("send_food1",0);
        food2 = intent.getIntExtra("send_food2",0);
        food3 = intent.getIntExtra("send_food3",0);
        food4 = intent.getIntExtra("send_food4",0);

        Button btn5 = findViewById(R.id.btn5);
        Button btn6 = findViewById(R.id.btn6);
        Button btn7 = findViewById(R.id.btn7);
        Button btn8 = findViewById(R.id.btn8);
        Button btnn = findViewById(R.id.next);
        foodnum5 = findViewById(R.id.food5);
        foodnum6 = findViewById(R.id.food6);
        foodnum7 = findViewById(R.id.food7);
        foodnum8 = findViewById(R.id.food8);

    }

    public void order(View btn){
        if(btn.getId() == R.id.btn5){
            food5 = food5+1;
            foodnum5.setText(String.valueOf(food5));
        }
        else if(btn.getId() == R.id.btn6){
            food6 = food6+1;
            foodnum6.setText(String.valueOf(food6));
        }
        else if(btn.getId() == R.id.btn7){
            food7 = food7+1;
            foodnum7.setText(String.valueOf(food7));
        }
        else if(btn.getId() == R.id.btn8){
            food8 = food8+1;
            foodnum8.setText(String.valueOf(food8));
        }
    }

    public void order1(View btn){
        if(btn.getId() == R.id.btn55){
            if(food5>0){
                food5 = food5-1;
                foodnum5.setText(String.valueOf(food5));
            }

        }
        else if(btn.getId() == R.id.btn66){
            if(food6>0){
                food6 = food6-1;
                foodnum6.setText(String.valueOf(food6));
            }

        }
        else if(btn.getId() == R.id.btn77){
            if(food7>0){
                food7 = food7-1;
                foodnum7.setText(String.valueOf(food7));
            }

        }
        else if(btn.getId() == R.id.btn88){
            if(food8>0){
                food8 = food8-1;
                foodnum8.setText(String.valueOf(food8));
            }

        }
    }

    public void next(View btn){
        Log.i("text",food5+"-"+food6+"-"+food7+"-"+food8+"-"+desknum);
        Intent intent = new Intent(order2Activity.this,resulActivity.class);
        intent.putExtra("send_food1",food1);
        intent.putExtra("send_food2",food2);
        intent.putExtra("send_food3",food3);
        intent.putExtra("send_food4",food4);
        intent.putExtra("send_food5",food5);
        intent.putExtra("send_food6",food6);
        intent.putExtra("send_food7",food7);
        intent.putExtra("send_food8",food8);
        intent.putExtra("send_desknum",desknum);
        Log.i("test", "next: ");
        startActivity(intent);
    }
}
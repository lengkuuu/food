package com.example.food;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SearchRecentSuggestionsProvider;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class indexActivity extends AppCompatActivity {

    EditText editText;

    String desknum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
    }

    public void act(View btn){
        editText = findViewById(R.id.desknum);
        desknum = editText.getText().toString();
        Intent intent = new Intent(indexActivity.this,order1Activity.class);
        intent.putExtra("desknum",desknum);
        startActivity(intent);
    }
}
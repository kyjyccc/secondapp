package com.swufe.secondapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
      TextView text;
      EditText edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.out);
        edit = findViewById(R.id.inp);
    }

    public void btn(View v){
        String str = edit.getText().toString();
        text.setText("Hi~" + str);
    }
}
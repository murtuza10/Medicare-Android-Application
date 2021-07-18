package com.example.medicare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    private Button button1;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        button1=(Button) findViewById(R.id.button1);
        button2=(Button) findViewById(R.id.button16);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityDoctor();
            }

        });

    }

    public void openActivityDoctor() {
        Intent intent= new Intent(this, Region.class);
        startActivity(intent);
    }




}

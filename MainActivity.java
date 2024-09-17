package com.example.buttondisable;

import android.os.Bundle;
import android.widget.Toast;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button buttonDisable;
    private Button buttonEnable;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        buttonDisable = findViewById(R.id.buttonDisable);

        buttonDisable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                buttonDisable.setEnabled(false);
                Toast.makeText(MainActivity.this, "Przycisk został wyłączony", Toast.LENGTH_SHORT).show();
            }
        });
        buttonEnable = findViewById(R.id.buttonEnable);

        buttonEnable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                buttonDisable.setEnabled(true);
                Toast.makeText(MainActivity.this, "Przycisk został włączony", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
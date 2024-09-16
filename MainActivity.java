package com.example.buttondisable;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button buttonDisable;
    private Button buttonEnable;
    private TextView Counter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Counter = findViewById(R.id.counter);

        buttonDisable = findViewById(R.id.buttonDisable);

        buttonDisable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                buttonDisable.setEnabled(false);
                Toast.makeText(MainActivity.this, "Przycisk został wyłączony", Toast.LENGTH_SHORT).show();
                int currentValue = Integer.parseInt(Counter.getText().toString());
                Counter.setText(String.valueOf(currentValue + 1));
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
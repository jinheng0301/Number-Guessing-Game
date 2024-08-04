package com.example.numbergames;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Button;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity2 extends AppCompatActivity {

    private Button buttonStart;
    private RadioButton radio1, radio2, radio3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonStart = findViewById(R.id.buttonStart);
        radio1 = findViewById(R.id.radioButton1);
        radio2 = findViewById(R.id.radioButton2);
        radio3 = findViewById(R.id.radioButton3);

        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, GameActivity.class);

                if(!radio1.isChecked() && !radio2.isChecked() && !radio3.isChecked()){
                    // if user has no make choices
                    Snackbar.make(v, "Please select a number of digits", Snackbar.LENGTH_LONG).show();
                }
                else{
                    // set a special key for each entry, we will get the data from the game activity
                    if(radio1.isChecked()){
                        intent.putExtra("one", true);
                    }
                    else if(radio2.isChecked()){
                        intent.putExtra("two", true);
                    }
                    else if(radio2.isChecked()){
                        intent.putExtra("three", true);
                    }

                    startActivity(intent);
                }
            }
        });
    }
}
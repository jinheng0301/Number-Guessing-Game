package com.example.numbergames;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SplashActivity2 extends AppCompatActivity {

    private ImageView imageView;
    private TextView textView;
    Animation animationImage, animationText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        textView = findViewById(R.id.textView);
        imageView = findViewById(R.id.imageView);

        animationImage = AnimationUtils.loadAnimation(this, R.anim.image_animation);
        animationText = AnimationUtils.loadAnimation(this, R.anim.text_animation);

        imageView.setAnimation(animationImage);
        textView.setAnimation(animationText);

        new CountDownTimer(5000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                // first method will state what will happen at each second

            }

            @Override
            public void onFinish() {
                // second method will state what happen when the time expires
                startActivity(new Intent(SplashActivity2.this, MainActivity.class));
                finish();
            }
        }.start();
        // the time will increase by one second interval to reach 5 seconds
    }
}
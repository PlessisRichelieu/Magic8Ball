package com.example.niki.magic8ball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button ask = findViewById(R.id.btnAsk);

        final ImageView  eightBall = findViewById(R.id.img8Ball);



        final  int [] imgs = {R.drawable.ball1,
                       R.drawable.ball2,
                       R.drawable.ball3,
                       R.drawable.ball4,
                       R.drawable.ball5};

        ask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rndGenerator = new Random ();
                int imgPos = rndGenerator.nextInt(4);
                eightBall.setImageResource(imgs[imgPos]);
            }
        });
    }
}

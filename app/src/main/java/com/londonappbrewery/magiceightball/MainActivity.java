package com.londonappbrewery.magiceightball;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button shake= (Button) findViewById(R.id.button);
        final ImageView ball= (ImageView) findViewById(R.id.ball);
        final int ballArr[]={
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5};

        shake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random ballNo= new Random();
                int b=ballNo.nextInt(5);
                Animation animShake = AnimationUtils.loadAnimation(MainActivity.this, R.anim.shake);
                ball.startAnimation(animShake);
                ball.setImageResource(ballArr[b]);
                ball.startAnimation(animShake);
            }
        });

    }
}

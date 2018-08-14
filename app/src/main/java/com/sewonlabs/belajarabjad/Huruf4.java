package com.sewonlabs.belajarabjad;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;

public class Huruf4 extends AppCompatActivity {

    MediaPlayer mediaPlayer, sy, sz;
    ImageButton y, z, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huruf4);

        //deklarasi variabel
        back = (ImageButton) findViewById(R.id.back);
        y = (ImageButton) findViewById(R.id.btny);
        z = (ImageButton) findViewById(R.id.btnz);

        mediaPlayer = MediaPlayer.create(this, R.raw.buttonplay);
        sy = MediaPlayer.create(this, R.raw.y);
        sz = MediaPlayer.create(this, R.raw.z);

        y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //bounce button
                final Animation myAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bouncezoom);

                MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
                myAnim.setInterpolator(interpolator);
                myAnim.setRepeatCount(Animation.INFINITE);

                y.startAnimation(myAnim); //memulai button

                sy.start(); //memulai mediaplayer
            }
        });

        z.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Animation myAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bouncezoom);

                MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
                myAnim.setInterpolator(interpolator);
                myAnim.setRepeatCount(Animation.INFINITE);

                z.startAnimation(myAnim);

                sz.start();
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.start();

                Intent intent = new Intent(getApplicationContext(), Huruf3.class);
                startActivity(intent);
            }
        });
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {

        super.onResume();
    }

    protected void onStop() {
        super.onStop();
    }
}

package com.sewonlabs.belajarabjad;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;

public class Huruf3 extends AppCompatActivity {

    MediaPlayer mediaPlayer, sq, sr, st, ss, su, sv, sw, sx;
    ImageButton q, r, s, t, u, v, w, x, next, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huruf3);

        //deklarasi variabel
        next = (ImageButton) findViewById(R.id.next);
        back = (ImageButton) findViewById(R.id.back);
        q = (ImageButton) findViewById(R.id.btnq);
        r = (ImageButton) findViewById(R.id.btnr);
        s = (ImageButton) findViewById(R.id.btns);
        t = (ImageButton) findViewById(R.id.btnt);
        u = (ImageButton) findViewById(R.id.btnu);
        v = (ImageButton) findViewById(R.id.btnv);
        w = (ImageButton) findViewById(R.id.btnw);
        x = (ImageButton) findViewById(R.id.btnx);

        mediaPlayer = MediaPlayer.create(this, R.raw.buttonplay);
        sq = MediaPlayer.create(this, R.raw.q);
        sr = MediaPlayer.create(this, R.raw.r);
        ss = MediaPlayer.create(this, R.raw.s);
        st = MediaPlayer.create(this, R.raw.t);
        su = MediaPlayer.create(this, R.raw.u);
        sv = MediaPlayer.create(this, R.raw.v);
        sw = MediaPlayer.create(this, R.raw.w);
        sx = MediaPlayer.create(this, R.raw.x);

        q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //bounce button
                final Animation myAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bouncezoom);

                MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
                myAnim.setInterpolator(interpolator);
                myAnim.setRepeatCount(Animation.INFINITE);

                q.startAnimation(myAnim); //memulai button

                sq.start(); //memulai mediaplayer
            }
        });

        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Animation myAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bouncezoom);

                MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
                myAnim.setInterpolator(interpolator);
                myAnim.setRepeatCount(Animation.INFINITE);

                r.startAnimation(myAnim);

                sr.start();
            }
        });

        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Animation myAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bouncezoom);

                MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
                myAnim.setInterpolator(interpolator);
                myAnim.setRepeatCount(Animation.INFINITE);

                s.startAnimation(myAnim);

                ss.start();
            }
        });

        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Animation myAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bouncezoom);

                MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
                myAnim.setInterpolator(interpolator);
                myAnim.setRepeatCount(Animation.INFINITE);

                t.startAnimation(myAnim);

                st.start();
            }
        });

        u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Animation myAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bouncezoom);

                MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
                myAnim.setInterpolator(interpolator);
                myAnim.setRepeatCount(Animation.INFINITE);

                u.startAnimation(myAnim);

                su.start();
            }
        });

        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Animation myAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bouncezoom);

                MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
                myAnim.setInterpolator(interpolator);
                myAnim.setRepeatCount(Animation.INFINITE);

                v.startAnimation(myAnim);

                sv.start();
            }
        });

        w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Animation myAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bouncezoom);

                MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
                myAnim.setInterpolator(interpolator);
                myAnim.setRepeatCount(Animation.INFINITE);

                w.startAnimation(myAnim);

                sw.start();
            }
        });

        x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Animation myAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bouncezoom);

                MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
                myAnim.setInterpolator(interpolator);
                myAnim.setRepeatCount(Animation.INFINITE);

                x.startAnimation(myAnim);

                sx.start();
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();

                Intent intent = new Intent(getApplicationContext(),Huruf4.class);
                startActivity(intent);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.start();

                Intent intent = new Intent(getApplicationContext(),Huruf2.class);
                startActivity(intent);
            }
        });
    }
}

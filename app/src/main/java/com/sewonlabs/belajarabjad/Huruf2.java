package com.sewonlabs.belajarabjad;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;

public class Huruf2 extends AppCompatActivity {

    MediaPlayer mediaPlayer, si, sj, sk, sl, sm, sn, so, sp;
    ImageButton i, j, k, l, m, n, o, p, next, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huruf2);

        //deklarasi variabel
        next = (ImageButton) findViewById(R.id.next);
        back = (ImageButton) findViewById(R.id.back);
        i = (ImageButton) findViewById(R.id.btni);
        j = (ImageButton) findViewById(R.id.btnj);
        k = (ImageButton) findViewById(R.id.btnk);
        l = (ImageButton) findViewById(R.id.btnl);
        m = (ImageButton) findViewById(R.id.btnm);
        n = (ImageButton) findViewById(R.id.btnn);
        o = (ImageButton) findViewById(R.id.btno);
        p = (ImageButton) findViewById(R.id.btnp);

        mediaPlayer = MediaPlayer.create(this, R.raw.buttonplay);
        sp = MediaPlayer.create(this, R.raw.p);
        si = MediaPlayer.create(this, R.raw.i);
        sj = MediaPlayer.create(this, R.raw.j);
        sk = MediaPlayer.create(this, R.raw.k);
        sl = MediaPlayer.create(this, R.raw.l);
        sm = MediaPlayer.create(this, R.raw.m);
        sn = MediaPlayer.create(this, R.raw.n);
        so = MediaPlayer.create(this, R.raw.o);

        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //bounce button
                final Animation myAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bouncezoom);

                MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
                myAnim.setInterpolator(interpolator);
                myAnim.setRepeatCount(Animation.INFINITE);

                p.startAnimation(myAnim); //memulai button

                sp.start(); //memulai mediaplayer
            }
        });

        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Animation myAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bouncezoom);

                MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
                myAnim.setInterpolator(interpolator);
                myAnim.setRepeatCount(Animation.INFINITE);

                i.startAnimation(myAnim);

                si.start();
            }
        });

        j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Animation myAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bouncezoom);

                MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
                myAnim.setInterpolator(interpolator);
                myAnim.setRepeatCount(Animation.INFINITE);

                j.startAnimation(myAnim);

                sj.start();
            }
        });

        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Animation myAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bouncezoom);

                MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
                myAnim.setInterpolator(interpolator);
                myAnim.setRepeatCount(Animation.INFINITE);

                k.startAnimation(myAnim);

                sk.start();
            }
        });

        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Animation myAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bouncezoom);

                MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
                myAnim.setInterpolator(interpolator);
                myAnim.setRepeatCount(Animation.INFINITE);

                l.startAnimation(myAnim);

                sl.start();
            }
        });

        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Animation myAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bouncezoom);

                MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
                myAnim.setInterpolator(interpolator);
                myAnim.setRepeatCount(Animation.INFINITE);

                m.startAnimation(myAnim);

                sm.start();
            }
        });

        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Animation myAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bouncezoom);

                MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
                myAnim.setInterpolator(interpolator);
                myAnim.setRepeatCount(Animation.INFINITE);

                n.startAnimation(myAnim);

                sn.start();
            }
        });

        o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Animation myAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bouncezoom);

                MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
                myAnim.setInterpolator(interpolator);
                myAnim.setRepeatCount(Animation.INFINITE);

                o.startAnimation(myAnim);

                so.start();
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.start();

                Intent intent = new Intent(getApplicationContext(),Huruf3.class);
                startActivity(intent);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.start();

                Intent intent = new Intent(getApplicationContext(),Huruf.class);
                startActivity(intent);
            }
        });
    }
}

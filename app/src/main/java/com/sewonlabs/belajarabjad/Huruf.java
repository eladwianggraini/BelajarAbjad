package com.sewonlabs.belajarabjad;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;


public class Huruf extends AppCompatActivity {

    MediaPlayer mediaPlayer, sa, sb, sc, sd, se, sf, sg, sh, backsound;
    ImageButton a, b, c, d, e, f, g, h, back, next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huruf);

        //deklarasi variabel
        mediaPlayer = MediaPlayer.create(this, R.raw.buttonplay);
        sa = MediaPlayer.create(this, R.raw.a);
        sb = MediaPlayer.create(this, R.raw.b);
        sc = MediaPlayer.create(this, R.raw.c);
        sd = MediaPlayer.create(this, R.raw.d);
        se = MediaPlayer.create(this, R.raw.e);
        sf = MediaPlayer.create(this, R.raw.f);
        sg = MediaPlayer.create(this, R.raw.g);
        sh = MediaPlayer.create(this, R.raw.h);

        next = (ImageButton) findViewById(R.id.next);
        back = (ImageButton) findViewById(R.id.back);
        a = (ImageButton) findViewById(R.id.btna);
        b = (ImageButton) findViewById(R.id.btnb);
        c = (ImageButton) findViewById(R.id.btnc);
        d = (ImageButton) findViewById(R.id.btnd);
        e = (ImageButton) findViewById(R.id.btne);
        f = (ImageButton) findViewById(R.id.btnf);
        g = (ImageButton) findViewById(R.id.btng);
        h = (ImageButton) findViewById(R.id.btnh);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                membuat pop up
//                final Dialog dialog = new Dialog(Huruf.this);
//                dialog.setContentView(R.layout.layout_customdialog);
//                dialog.setTitle(".");
//
//                ImageView image = (ImageView) dialog.findViewById(R.id.icon);
//                image.setImageResource(R.drawable.a);
//
//                dialog.show();

                //button bounce
                final Animation myAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bouncezoom);

                MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
                myAnim.setInterpolator(interpolator);
                myAnim.setRepeatCount(Animation.INFINITE);

                a.startAnimation(myAnim); //memulai button animation
                sa.start(); //memulai mediaplayer
            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Animation myAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bouncezoom);

                MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
                myAnim.setInterpolator(interpolator);

                b.startAnimation(myAnim);
                sb.start();

            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Animation myAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bouncezoom);

                MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
                myAnim.setInterpolator(interpolator);

                c.startAnimation(myAnim);
                sc.start();

            }
        });

        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Animation myAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bouncezoom);

                MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
                myAnim.setInterpolator(interpolator);

                d.startAnimation(myAnim);
                sd.start();

            }
        });

        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Animation myAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bouncezoom);

                MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
                myAnim.setInterpolator(interpolator);

                e.startAnimation(myAnim);
                se.start();

            }
        });

        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Animation myAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bouncezoom);

                MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
                myAnim.setInterpolator(interpolator);

                f.startAnimation(myAnim);
                sf.start();
            }
        });

        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Animation myAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bouncezoom);

                MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
                myAnim.setInterpolator(interpolator);

                g.startAnimation(myAnim);
                sg.start();
            }
        });
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Animation myAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bouncezoom);

                MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
                myAnim.setInterpolator(interpolator);

                h.startAnimation(myAnim);
                sh.start();
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.start();

                Intent intent = new Intent(getApplicationContext(),Huruf2.class);
                startActivity(intent);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.start();

                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
    }
}

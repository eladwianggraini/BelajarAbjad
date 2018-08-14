package com.sewonlabs.belajarabjad;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;


import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer, backsound;
    ImageButton pindah, exit;
    AdView mAdView; //adview iklan
    InterstitialAd interstitial; //jenis iklan

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //deklarasi variabel untuk iklan
        mAdView = (AdView) findViewById(R.id.adView);
        mAdView.loadAd(new AdRequest.Builder().build());

        //memasang iklan
        interstitial = new InterstitialAd(MainActivity.this);
        interstitial.setAdUnitId(getString(R.string.id_iklan1));
        AdRequest adRequest = new AdRequest.Builder().build();

        interstitial.loadAd(adRequest);
        interstitial.setAdListener(new AdListener(){
            @Override
            public void onAdLoaded() {
                displayInterstitial();
            }
        });

        //deklarasi Mediaplayer diputar di activity
        mediaPlayer = MediaPlayer.create(this, R.raw.buttonplay);
        backsound = MediaPlayer.create(this, R.raw.backsound);
        backsound.start();

        pindah = (ImageButton) findViewById(R.id.play);
        exit = (ImageButton) findViewById(R.id.exit);

        //bounce button
        final Animation myAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce);

        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 10);
        myAnim.setInterpolator(interpolator);

        pindah.startAnimation(myAnim);

        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //memulai media player button pindah
                mediaPlayer.start();

                //pindah ke activity huruf
                Intent intent = new Intent(getApplicationContext(),Huruf.class);
                startActivity(intent);

            }
        });

        exit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                mediaPlayer.start();

                //menampilkan alert pertanyaan
                showAlertDialog();
            }
        });
    }

    public void onBackPressed(){
        showAlertDialog();
    }

    public void showAlertDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this)
                .setMessage("Tutup aplikasi ini?")
                .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        dialog.dismiss();
                    }
                })
                .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        dialog.dismiss();
                        Intent intent = new Intent(Intent.ACTION_MAIN);
                        intent.addCategory(Intent.CATEGORY_HOME);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);
                        finish();
                    }
                });
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    //menampilkan iklan
    public void displayInterstitial(){
        if(interstitial.isLoaded()){
            interstitial.show();
        }
    }

    //memutar backsound hanya di activity main
    public void onPause() {
        super.onPause();
        backsound.pause();
    }

    public void onResume() {
        super.onResume();
        backsound.start();
    }

    protected void onStop() {
        super.onStop();
        backsound.stop();
        mediaPlayer = null;
    }
}

package com.hmmwow.www.musicplayer;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playMediaPlayer();
    }

    public void playMediaPlayer(){
        // find the button resourece by id's
        Button start = (Button) findViewById(R.id.start);
        Button pause = (Button) findViewById(R.id.pause);

        mediaPlayer = MediaPlayer.create(this,R.raw.old_mac_donald);

        // set the OnClickLister for the button start
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Music is Playing...",Toast.LENGTH_LONG).show();
                mediaPlayer.start();
            }
        });

        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Music Paused ...",Toast.LENGTH_LONG).show();
                mediaPlayer.pause();
            }
        });
    }
}

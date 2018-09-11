package com.example.android.macsebsoundboard;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Create MediaPlayer class for Repter
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.repter_korda);

        //Create buttons
        Button play_repter = findViewById(R.id.start_repter);
        Button pause_repter = findViewById(R.id.pause_repter);
        Button stop_repter = findViewById(R.id.stop_repter);

        // Create OnClickListener for Play button
        play_repter.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                    mediaPlayer.start();

            }
        });

        // Create OnClickListener for Pause button
        pause_repter.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                mediaPlayer.pause();

            }
        });

        // Create OnClickListener for Stop button
        // TODO Implement STOP button to reset track to 0 ms and then be able to play it again
    }
}
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

        // Create MediaPlayer classes
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.repter_korda);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this, R.raw.nemjon_nehai);
        final MediaPlayer mediaPlayer2 = MediaPlayer.create(this, R.raw.dontbe_kollekt);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this, R.raw.elect_kollekt);
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this, R.raw.danger_six);
        final MediaPlayer mediaPlayer5 = MediaPlayer.create(this, R.raw.hoplss_mmfrd);

        //Create buttons
        Button play_repter = findViewById(R.id.start_repter);
        Button pause_repter = findViewById(R.id.pause_repter);
        Button stop_repter = findViewById(R.id.stop_repter);

        Button play_nemjon = findViewById(R.id.start_nemjon);
        Button pause_nemjon = findViewById(R.id.pause_nemjon);
        Button stop_nemjon = findViewById(R.id.stop_nemjon);

        Button play_dontbe = findViewById(R.id.start_dontbe);
        Button pause_dontbe = findViewById(R.id.pause_dontbe);
        Button stop_dontbe = findViewById(R.id.stop_dontbe);

        Button play_elect = findViewById(R.id.start_election);
        Button pause_elect = findViewById(R.id.pause_election);
        Button stop_elect = findViewById(R.id.stop_election);

        Button play_danger = findViewById(R.id.start_danger);
        Button pause_danger = findViewById(R.id.pause_danger);
        Button stop_danger = findViewById(R.id.stop_danger);

        Button play_hplss = findViewById(R.id.start_hplss);
        Button pause_hplss = findViewById(R.id.pause_hplss);
        Button stop_hplss = findViewById(R.id.stop_hplss);

        // Create OnClickListener for REPTÉR!
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

        // Create OnClickListener for NEM JÖN!
        play_nemjon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer1.start();
            }
        });

        // Create OnClickListener for Pause button
        pause_nemjon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer1.pause();
            }
        });

        // Create OnClickListener for DON'T BE SLAPPIN'
        play_dontbe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer2.start();
            }
        });

        // Create OnClickListener for Pause button
        pause_dontbe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer2.pause();
            }
        });

        // Create OnClickListener for ELECTION
        play_elect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer3.start();
            }
        });

        // Create OnClickListener for Pause button
        pause_elect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer3.pause();
            }
        });

        // Create OnClickListener for DANGER! DANGER!
        play_danger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer4.start();
            }
        });

        // Create OnClickListener for Pause button
        pause_danger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer4.pause();
            }
        });

        // Create OnClickListener for HOPELESS
        play_hplss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer5.start();
            }
        });

        // Create OnClickListener for Pause button
        pause_hplss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer5.pause();
            }
        });
    }
}
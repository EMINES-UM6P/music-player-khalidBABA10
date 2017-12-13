package com.player.khalidbaba.androidplayer;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends Activity {

    ImageButton PlayPause;
    boolean isPlayed = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PlayPause = (ImageButton) findViewById(R.id.PlayPause);

        PlayPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isPlayed){
                    PlayPause.setImageDrawable(getResources().getDrawable(R.drawable.play_button__1_));
                }else{
                    PlayPause.setImageDrawable(getResources().getDrawable(R.drawable.pause));
                }
                isPlayed = !isPlayed;
            }
        });
    }
}


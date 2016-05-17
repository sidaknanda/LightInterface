package com.android.lightinterface;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SeekBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private SeekBar seekBarRoom1;
    private SeekBar seekBarRoom2;
    private SeekBar seekBarRoom3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        seekBarRoom1 = (SeekBar) findViewById(R.id.seekBarRoom1);
        seekBarRoom2 = (SeekBar) findViewById(R.id.seekBarRoom2);
        seekBarRoom3 = (SeekBar) findViewById(R.id.seekBarRoom3);
        setupCallbacks();
    }

    private void setupCallbacks() {
        seekBarRoom1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                  Log.d("SN", "Progress: " + progress);
                //float[] hsvColor = {0, 1, 1};
                //hsvColor[0] = 360f * progress / 100;
                //seekBarRoom1.setBackgroundColor(Color.HSVToColor(hsvColor));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Log.d("SN", "onStartRoom1");
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Log.d("SN", "onStopRoom1");
            }
        });

        seekBarRoom2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Log.d("SN", "Progress: " + progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Log.d("SN", "onStartRoom2");
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Log.d("SN", "onStopRoom2");
            }
        });

        seekBarRoom3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Log.d("SN", "Progress: " + progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Log.d("SN", "onStartRoom3");
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Log.d("SN", "onStopRoom3");
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

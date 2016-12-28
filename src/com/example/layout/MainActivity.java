package com.example.layout;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends Activity {

    @SuppressLint("NewApi") @Override
    protected void onCreate(Bundle savedInstanceState) {
    	
    	ImageButton btnHospital, btnHotel, btnAbout, btnExit;
    	
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        ActionBar actionBar = getActionBar();
        actionBar.setTitle("SmartCity");

        btnHospital = (ImageButton) findViewById(R.id.hospital);
        btnHotel = (ImageButton) findViewById(R.id.hotel);
        btnAbout = (ImageButton) findViewById(R.id.about);
        btnExit = (ImageButton) findViewById(R.id.exit);

        btnHospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent rs = new Intent(MainActivity.this, List_data_rumah_sakit.class);
                startActivity(rs);
            }
        });
        
        btnHotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent rs = new Intent(MainActivity.this, List_data_hotel.class);
                startActivity(rs);
            }
        });
        
        btnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent rs = new Intent(MainActivity.this, About.class);
                startActivity(rs);
            }
        });
        
        
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	System.exit(0);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)
    {
        if ((keyCode == KeyEvent.KEYCODE_BACK))
        {
            finish();
        }
        return super.onKeyDown(keyCode, event);
    }
     
}

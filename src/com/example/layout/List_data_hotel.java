package com.example.layout;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class List_data_hotel extends Activity implements OnItemClickListener {
ListView lvItem;
	
	@SuppressLint("NewApi") @Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list_data);
		
		ActionBar actionBar = getActionBar();
        actionBar.setTitle("Daftar Hotel");
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayUseLogoEnabled(false);
        actionBar.setDisplayShowHomeEnabled(false);
        
        lvItem = (ListView) findViewById(R.id.list_data);

        final String[] menuLokasi = new String[]{"Aryaduta Palembang","Santika Radial Palembang",
                "Favehotel Palembang", "Horison Ultima Palembang"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(List_data_hotel.this, android.R.layout.simple_list_item_1,
                android.R.id.text1, menuLokasi);

        lvItem.setAdapter(adapter);

        lvItem.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> l, View v, int position, long id) {

                Object o = menuLokasi[position];
                String pilihan = o.toString();
                tampilkanpihan(pilihan);
            }
        });
		
	}
	
	private void tampilkanpihan(String pilihan) {
        try {
            Intent i = null;

            if (pilihan.equals("Aryaduta Palembang")) {
                i = new Intent(this, Hotel_Aryaduta.class);
            }
            
            if (pilihan.equals("Santika Radial Palembang")) {
                i = new Intent(this, Hotel_Santika.class);
            }

            startActivity(i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
		
	}
	
	public boolean onOptionsItemSelected(MenuItem item){
		finish();
	    return true;

	}
	

}
